Calendar=function(a,b,c,d){this.timeout=this.getDateText=this.getDateToolTip=this.getDateStatus=this.currentDateEl=this.activeDiv=null;this.onSelected=c||null;this.onClose=d||null;this.hidden=this.dragging=!1;this.minYear=1970;this.maxYear=2050;this.dateFormat=Calendar._TT.DEF_DATE_FORMAT;this.ttDateFormat=Calendar._TT.TT_DATE_FORMAT;this.weekNumbers=this.isPopup=!0;this.firstDayOfWeek="number"==typeof a?a:Calendar._FD;this.showsOtherMonths=!1;this.dateStr=b;this.ar_days=null;this.showsTime=!1;this.time24=
!0;this.yearStep=2;this.hiliteToday=!0;this.activeYear=this.hilitedYear=this.activeMonth=this.hilitedMonth=this.yearsCombo=this.monthsCombo=this.firstdayname=this.tbody=this.element=this.table=this.multiple=null;this.dateClicked=!1;if("undefined"==typeof Calendar._SDN){"undefined"==typeof Calendar._SDN_len&&(Calendar._SDN_len=3);a=[];for(b=8;0<b;)a[--b]=Calendar._DN[b].substr(0,Calendar._SDN_len);Calendar._SDN=a;"undefined"==typeof Calendar._SMN_len&&(Calendar._SMN_len=3);a=[];for(b=12;0<b;)a[--b]=
Calendar._MN[b].substr(0,Calendar._SMN_len);Calendar._SMN=a}};Calendar._C=null;Calendar.is_ie=/msie/i.test(navigator.userAgent)&&!/opera/i.test(navigator.userAgent);Calendar.is_ie5=Calendar.is_ie&&/msie 5\.0/i.test(navigator.userAgent);Calendar.is_opera=/opera/i.test(navigator.userAgent);Calendar.is_khtml=/Konqueror|Safari|KHTML/i.test(navigator.userAgent);
Calendar.getAbsolutePos=function(a){var b=0,c=0,d=/^div$/i.test(a.tagName);d&&a.scrollLeft&&(b=a.scrollLeft);d&&a.scrollTop&&(c=a.scrollTop);b={x:a.offsetLeft-b,y:a.offsetTop-c};a.offsetParent&&(a=this.getAbsolutePos(a.offsetParent),b.x+=a.x,b.y+=a.y);return b};Calendar.isRelated=function(a,b){var c=b.relatedTarget;if(!c){var d=b.type;"mouseover"==d?c=b.fromElement:"mouseout"==d&&(c=b.toElement)}for(;c;){if(c==a)return!0;c=c.parentNode}return!1};
Calendar.removeClass=function(a,b){if(a&&a.className){for(var c=a.className.split(" "),d=[],e=c.length;0<e;)c[--e]!=b&&(d[d.length]=c[e]);a.className=d.join(" ")}};Calendar.addClass=function(a,b){Calendar.removeClass(a,b);a.className+=" "+b};Calendar.getElement=function(a){for(a=Calendar.is_ie?window.event.srcElement:a.currentTarget;1!=a.nodeType||/^div$/i.test(a.tagName);)a=a.parentNode;return a};
Calendar.getTargetElement=function(a){for(a=Calendar.is_ie?window.event.srcElement:a.target;1!=a.nodeType;)a=a.parentNode;return a};Calendar.stopEvent=function(a){a||(a=window.event);Calendar.is_ie?(a.cancelBubble=!0,a.returnValue=!1):(a.preventDefault(),a.stopPropagation());return!1};Calendar.addEvent=function(a,b,c){a.attachEvent?a.attachEvent("on"+b,c):a.addEventListener?a.addEventListener(b,c,!0):a["on"+b]=c};
Calendar.removeEvent=function(a,b,c){a.detachEvent?a.detachEvent("on"+b,c):a.removeEventListener?a.removeEventListener(b,c,!0):a["on"+b]=null};Calendar.createElement=function(a,b){var c=null,c=document.createElementNS?document.createElementNS("http://www.w3.org/1999/xhtml",a):document.createElement(a);"undefined"!=typeof b&&b.appendChild(c);return c};
Calendar._add_evs=function(a){with(Calendar)addEvent(a,"mouseover",dayMouseOver),addEvent(a,"mousedown",dayMouseDown),addEvent(a,"mouseout",dayMouseOut),is_ie&&(addEvent(a,"dblclick",dayMouseDblClick),a.setAttribute("unselectable",!0))};Calendar.findMonth=function(a){return"undefined"!=typeof a.month?a:"undefined"!=typeof a.parentNode.month?a.parentNode:null};Calendar.findYear=function(a){return"undefined"!=typeof a.year?a:"undefined"!=typeof a.parentNode.year?a.parentNode:null};
Calendar.showMonthsCombo=function(){var a=Calendar._C;if(!a)return!1;var b=a.activeDiv,c=a.monthsCombo;a.hilitedMonth&&Calendar.removeClass(a.hilitedMonth,"hilite");a.activeMonth&&Calendar.removeClass(a.activeMonth,"active");var d=a.monthsCombo.getElementsByTagName("div")[a.date.getMonth()];Calendar.addClass(d,"active");a.activeMonth=d;a=c.style;a.display="block";0>b.navtype?a.left=b.offsetLeft+"px":(c=c.offsetWidth,"undefined"==typeof c&&(c=50),a.left=b.offsetLeft+b.offsetWidth-c+"px");a.top=b.offsetTop+
b.offsetHeight+"px"};
Calendar.showYearsCombo=function(a){var b=Calendar._C;if(!b)return!1;var c=b.activeDiv,d=b.yearsCombo;b.hilitedYear&&Calendar.removeClass(b.hilitedYear,"hilite");b.activeYear&&Calendar.removeClass(b.activeYear,"active");b.activeYear=null;for(var e=b.date.getFullYear()+(a?1:-1),f=d.firstChild,g=!1,k=12;0<k;--k)e>=b.minYear&&e<=b.maxYear?(f.innerHTML=e,f.year=e,f.style.display="block",g=!0):f.style.display="none",f=f.nextSibling,e+=a?b.yearStep:-b.yearStep;g&&(a=d.style,a.display="block",0>c.navtype?
a.left=c.offsetLeft+"px":(d=d.offsetWidth,"undefined"==typeof d&&(d=50),a.left=c.offsetLeft+c.offsetWidth-d+"px"),a.top=c.offsetTop+c.offsetHeight+"px")};
Calendar.tableMouseUp=function(a){var b=Calendar._C;if(!b)return!1;b.timeout&&clearTimeout(b.timeout);var c=b.activeDiv;if(!c)return!1;var d=Calendar.getTargetElement(a);a||(a=window.event);Calendar.removeClass(c,"active");d!=c&&d.parentNode!=c||Calendar.cellClick(c,a);var e=Calendar.findMonth(d),c=null;if(e)c=new Date(b.date),e.month!=c.getMonth()&&(c.setMonth(e.month),b.setDate(c),b.dateClicked=!1,b.callHandler());else if(d=Calendar.findYear(d))c=new Date(b.date),d.year!=c.getFullYear()&&(c.setFullYear(d.year),
b.setDate(c),b.dateClicked=!1,b.callHandler());with(Calendar)return removeEvent(document,"mouseup",tableMouseUp),removeEvent(document,"mouseover",tableMouseOver),removeEvent(document,"mousemove",tableMouseOver),b._hideCombos(),_C=null,stopEvent(a)};
Calendar.tableMouseOver=function(a){var b=Calendar._C;if(b){var c=b.activeDiv,d=Calendar.getTargetElement(a);d==c||d.parentNode==c?(Calendar.addClass(c,"hilite active"),Calendar.addClass(c.parentNode,"rowhilite")):(("undefined"==typeof c.navtype||50!=c.navtype&&(0==c.navtype||2<Math.abs(c.navtype)))&&Calendar.removeClass(c,"active"),Calendar.removeClass(c,"hilite"),Calendar.removeClass(c.parentNode,"rowhilite"));a||(a=window.event);if(50==c.navtype&&d!=c){var e=Calendar.getAbsolutePos(c),f=c.offsetWidth,
g=a.clientX,k=!0;g>e.x+f?(g=g-e.x-f,k=!1):g=e.x-g;0>g&&(g=0);for(var e=c._range,f=c._current,g=Math.floor(g/10)%e.length,h=e.length;0<=--h&&e[h]!=f;);for(;0<g--;)k?0>--h&&(h=e.length-1):++h>=e.length&&(h=0);c.innerHTML=e[h];b.onUpdateTime()}(c=Calendar.findMonth(d))?c.month!=b.date.getMonth()?(b.hilitedMonth&&Calendar.removeClass(b.hilitedMonth,"hilite"),Calendar.addClass(c,"hilite"),b.hilitedMonth=c):b.hilitedMonth&&Calendar.removeClass(b.hilitedMonth,"hilite"):(b.hilitedMonth&&Calendar.removeClass(b.hilitedMonth,
"hilite"),(d=Calendar.findYear(d))?d.year!=b.date.getFullYear()?(b.hilitedYear&&Calendar.removeClass(b.hilitedYear,"hilite"),Calendar.addClass(d,"hilite"),b.hilitedYear=d):b.hilitedYear&&Calendar.removeClass(b.hilitedYear,"hilite"):b.hilitedYear&&Calendar.removeClass(b.hilitedYear,"hilite"));return Calendar.stopEvent(a)}};Calendar.tableMouseDown=function(a){if(Calendar.getTargetElement(a)==Calendar.getElement(a))return Calendar.stopEvent(a)};
Calendar.calDragIt=function(a){var b=Calendar._C;if(!b||!b.dragging)return!1;var c,d;Calendar.is_ie?(d=window.event.clientY+document.body.scrollTop,c=window.event.clientX+document.body.scrollLeft):(c=a.pageX,d=a.pageY);b.hideShowCovered();var e=b.element.style;e.left=c-b.xOffs+"px";e.top=d-b.yOffs+"px";return Calendar.stopEvent(a)};
Calendar.calDragEnd=function(a){var b=Calendar._C;if(!b)return!1;b.dragging=!1;with(Calendar)removeEvent(document,"mousemove",calDragIt),removeEvent(document,"mouseup",calDragEnd),tableMouseUp(a);b.hideShowCovered()};
Calendar.dayMouseDown=function(a){var b=Calendar.getElement(a);if(b.disabled)return!1;var c=b.calendar;c.activeDiv=b;Calendar._C=c;if(300!=b.navtype)with(Calendar)50==b.navtype?(b._current=b.innerHTML,addEvent(document,"mousemove",tableMouseOver)):addEvent(document,Calendar.is_ie5?"mousemove":"mouseover",tableMouseOver),addClass(b,"hilite active"),addEvent(document,"mouseup",tableMouseUp);else c.isPopup&&c._dragStart(a);-1==b.navtype||1==b.navtype?(c.timeout&&clearTimeout(c.timeout),c.timeout=setTimeout("Calendar.showMonthsCombo()",
250)):-2==b.navtype||2==b.navtype?(c.timeout&&clearTimeout(c.timeout),c.timeout=setTimeout(0<b.navtype?"Calendar.showYearsCombo(true)":"Calendar.showYearsCombo(false)",250)):c.timeout=null;return Calendar.stopEvent(a)};Calendar.dayMouseDblClick=function(a){Calendar.cellClick(Calendar.getElement(a),a||window.event);Calendar.is_ie&&document.selection.empty()};
Calendar.dayMouseOver=function(a){var b=Calendar.getElement(a);if(Calendar.isRelated(b,a)||Calendar._C||b.disabled)return!1;b.ttip&&("_"==b.ttip.substr(0,1)&&(b.ttip=b.caldate.print(b.calendar.ttDateFormat)+b.ttip.substr(1)),b.calendar.tooltips.innerHTML=b.ttip);300!=b.navtype&&(Calendar.addClass(b,"hilite"),b.caldate&&Calendar.addClass(b.parentNode,"rowhilite"));return Calendar.stopEvent(a)};
Calendar.dayMouseOut=function(a){with(Calendar){var b=getElement(a);if(isRelated(b,a)||_C||b.disabled)return!1;removeClass(b,"hilite");b.caldate&&removeClass(b.parentNode,"rowhilite");b.calendar&&(b.calendar.tooltips.innerHTML=_TT.SEL_DATE);return stopEvent(a)}};
Calendar.cellClick=function(a,b){var c=a.calendar,d=!1,e=!1,f=null;if("undefined"==typeof a.navtype){c.currentDateEl&&(Calendar.removeClass(c.currentDateEl,"selected"),Calendar.addClass(a,"selected"),d=c.currentDateEl==a,d||(c.currentDateEl=a));c.date.setDateOnly(a.caldate);var f=c.date,g=!(c.dateClicked=!a.otherMonth);g||c.currentDateEl?e=!a.disabled:c._toggleMultipleDate(new Date(f));g&&c._init(c.firstDayOfWeek,f)}else{if(200==a.navtype){Calendar.removeClass(a,"hilite");c.callCloseHandler();return}f=
new Date(c.date);0==a.navtype&&f.setDateOnly(new Date);c.dateClicked=!1;var g=f.getFullYear(),k=f.getMonth(),h=function(a){var b=f.getDate(),c=f.getMonthDays(a);b>c&&f.setDate(c);f.setMonth(a)};switch(a.navtype){case 400:Calendar.removeClass(a,"hilite");d=Calendar._TT.ABOUT;"undefined"!=typeof d&&(d+=c.showsTime?Calendar._TT.ABOUT_TIME:"");return;case -2:g>c.minYear&&f.setFullYear(g-1);break;case -1:0<k?h(k-1):g-- >c.minYear&&(f.setFullYear(g),h(11));break;case 1:11>k?h(k+1):g<c.maxYear&&(f.setFullYear(g+
1),h(0));break;case 2:g<c.maxYear&&f.setFullYear(g+1);break;case 100:c.setFirstDayOfWeek(a.fdow);return;case 50:d=a._range;e=a.innerHTML;for(g=d.length;0<=--g&&d[g]!=e;);b&&b.shiftKey?0>--g&&(g=d.length-1):++g>=d.length&&(g=0);a.innerHTML=d[g];c.onUpdateTime();return;case 0:if("function"==typeof c.getDateStatus&&c.getDateStatus(f,f.getFullYear(),f.getMonth(),f.getDate()))return!1}f.equalsTo(c.date)?0==a.navtype&&(e=d=!0):(c.setDate(f),e=!0)}e&&b&&c.callHandler();d&&(Calendar.removeClass(a,"hilite"),
b&&c.callCloseHandler())};
Calendar.prototype.create=function(a){var b=null;a?(b=a,this.isPopup=!1):(b=document.getElementsByTagName("body")[0],this.isPopup=!0);this.date=this.dateStr?new Date(this.dateStr):new Date;this.table=a=Calendar.createElement("table");a.cellSpacing=0;a.cellPadding=0;a.calendar=this;Calendar.addEvent(a,"mousedown",Calendar.tableMouseDown);var c=Calendar.createElement("div");this.element=c;c.className="calendar";this.isPopup&&(c.style.position="absolute",c.style.display="none");c.appendChild(a);var d=
Calendar.createElement("thead",a),e=null,f=null,g=this,c=function(a,b,c){e=Calendar.createElement("td",f);e.colSpan=b;e.className="button";0!=c&&2>=Math.abs(c)&&(e.className+=" nav");Calendar._add_evs(e);e.calendar=g;e.navtype=c;e.innerHTML="<div unselectable='on'>"+a+"</div>";return e},f=Calendar.createElement("tr",d),k=6;this.isPopup&&--k;this.weekNumbers&&++k;c("?",1,400).ttip=Calendar._TT.INFO;this.title=c("",k,300);this.title.className="title";this.isPopup&&(this.title.ttip=Calendar._TT.DRAG_TO_MOVE,
this.title.style.cursor="move",c("&#x00d7;",1,200).ttip=Calendar._TT.CLOSE);f=Calendar.createElement("tr",d);f.className="headrow";this._nav_py=c("&#x00ab;",1,-2);this._nav_py.ttip=Calendar._TT.PREV_YEAR;this._nav_pm=c("&#x2039;",1,-1);this._nav_pm.ttip=Calendar._TT.PREV_MONTH;this._nav_now=c(Calendar._TT.TODAY,this.weekNumbers?4:3,0);this._nav_now.ttip=Calendar._TT.GO_TODAY;this._nav_nm=c("&#x203a;",1,1);this._nav_nm.ttip=Calendar._TT.NEXT_MONTH;this._nav_ny=c("&#x00bb;",1,2);this._nav_ny.ttip=Calendar._TT.NEXT_YEAR;
f=Calendar.createElement("tr",d);f.className="daynames";this.weekNumbers&&(e=Calendar.createElement("td",f),e.className="name wn",e.innerHTML=Calendar._TT.WK);for(d=7;0<d;--d)e=Calendar.createElement("td",f),d||(e.navtype=100,e.calendar=this,Calendar._add_evs(e));this.firstdayname=this.weekNumbers?f.firstChild.nextSibling:f.firstChild;this._displayWeekdays();this.tbody=k=Calendar.createElement("tbody",a);for(d=6;0<d;--d){f=Calendar.createElement("tr",k);this.weekNumbers&&(e=Calendar.createElement("td",
f));for(var h=7;0<h;--h)e=Calendar.createElement("td",f),e.calendar=this,Calendar._add_evs(e)}this.showsTime?(f=Calendar.createElement("tr",k),f.className="time",e=Calendar.createElement("td",f),e.className="time",e.colSpan=2,e.innerHTML=Calendar._TT.TIME||"&nbsp;",e=Calendar.createElement("td",f),e.className="time",e.colSpan=this.weekNumbers?4:3,function(){function a(b,c,d,f){var h=Calendar.createElement("span",e);h.className=b;h.innerHTML=c;h.calendar=g;h.ttip=Calendar._TT.TIME_PART;h.navtype=50;
h._range=[];if("number"!=typeof d)h._range=d;else for(b=d;b<=f;++b)h._range[h._range.length]=10>b&&10<=f?"0"+b:""+b;Calendar._add_evs(h);return h}var b=g.date.getHours(),c=g.date.getMinutes(),d=!g.time24,h=12<b;d&&h&&(b-=12);var k=a("hour",b,d?1:0,d?12:23),b=Calendar.createElement("span",e);b.innerHTML=":";b.className="colon";var q=a("minute",c,0,59),s=null;e=Calendar.createElement("td",f);e.className="time";e.colSpan=2;d?s=a("ampm",h?"pm":"am",["am","pm"]):e.innerHTML="&nbsp;";g.onSetTime=function(){var a,
b=this.date.getHours(),c=this.date.getMinutes();d&&((a=12<=b)&&(b-=12),0==b&&(b=12),s.innerHTML=a?"pm":"am");k.innerHTML=10>b?"0"+b:b;q.innerHTML=10>c?"0"+c:c};g.onUpdateTime=function(){var b=this.date,a=parseInt(k.innerHTML,10);d&&(/pm/i.test(s.innerHTML)&&12>a?a+=12:/am/i.test(s.innerHTML)&&12==a&&(a=0));var c=b.getDate(),e=b.getMonth(),f=b.getFullYear();b.setHours(a);b.setMinutes(parseInt(q.innerHTML,10));b.setFullYear(f);b.setMonth(e);b.setDate(c);this.dateClicked=!1;this.callHandler()}}()):this.onSetTime=
this.onUpdateTime=function(){};a=Calendar.createElement("tfoot",a);f=Calendar.createElement("tr",a);f.className="footrow";e=c(Calendar._TT.SEL_DATE,this.weekNumbers?8:7,300);e.className="ttip";this.isPopup&&(e.ttip=Calendar._TT.DRAG_TO_MOVE,e.style.cursor="move");this.tooltips=e;this.monthsCombo=c=Calendar.createElement("div",this.element);c.className="combo";for(d=0;d<Calendar._MN.length;++d)a=Calendar.createElement("div"),a.className=Calendar.is_ie?"label-IEfix":"label",a.month=d,a.innerHTML=Calendar._SMN[d],
c.appendChild(a);this.yearsCombo=c=Calendar.createElement("div",this.element);c.className="combo";for(d=12;0<d;--d)a=Calendar.createElement("div"),a.className=Calendar.is_ie?"label-IEfix":"label",c.appendChild(a);this._init(this.firstDayOfWeek,this.date);b.appendChild(this.element)};
Calendar._keyEvent=function(a){var b=window._dynarch_popupCalendar;if(!b||b.multiple)return!1;Calendar.is_ie&&(a=window.event);var c=Calendar.is_ie||"keypress"==a.type,d=a.keyCode;if(a.ctrlKey)switch(d){case 37:c&&Calendar.cellClick(b._nav_pm);break;case 38:c&&Calendar.cellClick(b._nav_py);break;case 39:c&&Calendar.cellClick(b._nav_nm);break;case 40:c&&Calendar.cellClick(b._nav_ny);break;default:return!1}else switch(d){case 32:Calendar.cellClick(b._nav_now);break;case 27:c&&b.callCloseHandler();break;
case 37:case 38:case 39:case 40:if(c){var e,f,g,k,h,c=37==d||38==d;h=37==d||39==d?1:7;var m=function(){k=b.currentDateEl;var a=k.pos;e=a&15;f=a>>4;g=b.ar_days[f][e]};m();for(var n=function(){var a=new Date(b.date);a.setDate(a.getDate()-h);b.setDate(a)},p=function(){var a=new Date(b.date);a.setDate(a.getDate()+h);b.setDate(a)};;){switch(d){case 37:if(0<=--e)g=b.ar_days[f][e];else{e=6;d=38;continue}break;case 38:0<=--f?g=b.ar_days[f][e]:(n(),m());break;case 39:if(7>++e)g=b.ar_days[f][e];else{e=0;d=
40;continue}break;case 40:++f<b.ar_days.length?g=b.ar_days[f][e]:(p(),m())}break}g&&(g.disabled?c?n():p():Calendar.cellClick(g))}break;case 13:c&&Calendar.cellClick(b.currentDateEl,a);break;default:return!1}return Calendar.stopEvent(a)};
Calendar.prototype._init=function(a,b){var c=new Date,d=c.getFullYear(),e=c.getMonth(),c=c.getDate();this.table.style.visibility="hidden";var f=b.getFullYear();f<this.minYear?(f=this.minYear,b.setFullYear(f)):f>this.maxYear&&(f=this.maxYear,b.setFullYear(f));this.firstDayOfWeek=a;this.date=new Date(b);var g=b.getMonth(),k=b.getDate();b.getMonthDays();b.setDate(1);var h=(b.getDay()-this.firstDayOfWeek)%7;0>h&&(h+=7);b.setDate(-h);b.setDate(b.getDate()+1);for(var h=this.tbody.firstChild,m=this.ar_days=
[],n=Calendar._TT.WEEKEND,p=this.multiple?this.datesCells={}:null,r=0;6>r;++r,h=h.nextSibling){var l=h.firstChild;this.weekNumbers&&(l.className="day wn",l.innerHTML=b.getWeekNumber(),l=l.nextSibling);h.className="daysrow";for(var x=!1,q,s=m[r]=[],t=0;7>t;++t,l=l.nextSibling,b.setDate(q+1)){q=b.getDate();var y=b.getDay();l.className="day";l.pos=r<<4|t;s[t]=l;var v=b.getMonth()==g;if(v)l.otherMonth=!1,x=!0;else if(this.showsOtherMonths)l.className+=" othermonth",l.otherMonth=!0;else{l.className="emptycell";
l.innerHTML="&nbsp;";l.disabled=!0;continue}l.disabled=!1;l.innerHTML=this.getDateText?this.getDateText(b,q):q;p&&(p[b.print("%Y%m%d")]=l);if(this.getDateStatus){var u=this.getDateStatus(b,f,g,q);if(this.getDateToolTip){var w=this.getDateToolTip(b,f,g,q);w&&(l.title=w)}!0===u?(l.className+=" disabled",l.disabled=!0):(/disabled/i.test(u)&&(l.disabled=!0),l.className+=" "+u)}l.disabled||(l.caldate=new Date(b),l.ttip="_",!this.multiple&&(v&&q==k&&this.hiliteToday)&&(l.className+=" selected",this.currentDateEl=
l),b.getFullYear()==d&&(b.getMonth()==e&&q==c)&&(l.className+=" today",l.ttip+=Calendar._TT.PART_TODAY),-1!=n.indexOf(y.toString())&&(l.className+=l.otherMonth?" oweekend":" weekend"))}x||this.showsOtherMonths||(h.className="emptyrow")}this.title.innerHTML=Calendar._MN[g]+", "+f;this.onSetTime();this.table.style.visibility="visible";this._initMultipleDates()};
Calendar.prototype._initMultipleDates=function(){if(this.multiple)for(var a in this.multiple){var b=this.datesCells[a];this.multiple[a]&&b&&(b.className+=" selected")}};Calendar.prototype._toggleMultipleDate=function(a){if(this.multiple){var b=a.print("%Y%m%d"),c=this.datesCells[b];c&&(this.multiple[b]?(Calendar.removeClass(c,"selected"),delete this.multiple[b]):(Calendar.addClass(c,"selected"),this.multiple[b]=a))}};Calendar.prototype.setDateToolTipHandler=function(a){this.getDateToolTip=a};
Calendar.prototype.setDate=function(a){a.equalsTo(this.date)||this._init(this.firstDayOfWeek,a)};Calendar.prototype.refresh=function(){this._init(this.firstDayOfWeek,this.date)};Calendar.prototype.setFirstDayOfWeek=function(a){this._init(a,this.date);this._displayWeekdays()};Calendar.prototype.setDateStatusHandler=Calendar.prototype.setDisabledHandler=function(a){this.getDateStatus=a};Calendar.prototype.setRange=function(a,b){this.minYear=a;this.maxYear=b};
Calendar.prototype.callHandler=function(){if(this.onSelected)this.onSelected(this,this.date.print(this.dateFormat))};Calendar.prototype.callCloseHandler=function(){if(this.onClose)this.onClose(this);this.hideShowCovered()};Calendar.prototype.destroy=function(){this.element.parentNode.removeChild(this.element);Calendar._C=null;window._dynarch_popupCalendar=null};Calendar.prototype.reparent=function(a){var b=this.element;b.parentNode.removeChild(b);a.appendChild(b)};
Calendar._checkCalendar=function(a){var b=window._dynarch_popupCalendar;if(!b)return!1;for(var c=Calendar.is_ie?Calendar.getElement(a):Calendar.getTargetElement(a);null!=c&&c!=b.element;c=c.parentNode);if(null==c)return window._dynarch_popupCalendar.callCloseHandler(),Calendar.stopEvent(a)};
Calendar.prototype.show=function(){for(var a=this.table.getElementsByTagName("tr"),b=a.length;0<b;){var c=a[--b];Calendar.removeClass(c,"rowhilite");for(var c=c.getElementsByTagName("td"),d=c.length;0<d;){var e=c[--d];Calendar.removeClass(e,"hilite");Calendar.removeClass(e,"active")}}this.element.style.display="block";this.hidden=!1;this.isPopup&&(window._dynarch_popupCalendar=this,Calendar.addEvent(document,"keydown",Calendar._keyEvent),Calendar.addEvent(document,"keypress",Calendar._keyEvent),Calendar.addEvent(document,
"mousedown",Calendar._checkCalendar));this.hideShowCovered()};Calendar.prototype.hide=function(){this.isPopup&&(Calendar.removeEvent(document,"keydown",Calendar._keyEvent),Calendar.removeEvent(document,"keypress",Calendar._keyEvent),Calendar.removeEvent(document,"mousedown",Calendar._checkCalendar));this.element.style.display="none";this.hidden=!0;this.hideShowCovered()};Calendar.prototype.showAt=function(a,b){var c=this.element.style;c.left=a+"px";c.top=b+"px";this.show()};
Calendar.prototype.showAtElement=function(a,b){var c=this,d=Calendar.getAbsolutePos(a);if(!b||"string"!=typeof b)return this.showAt(d.x,d.y+a.offsetHeight),!0;this.element.style.display="block";Calendar.continuation_for_the_fucking_khtml_browser=function(){var e=c.element.offsetWidth,f=c.element.offsetHeight;c.element.style.display="none";var g=b.substr(0,1),k="l";1<b.length&&(k=b.substr(1,1));switch(g){case "T":d.y-=f;break;case "B":d.y+=a.offsetHeight;break;case "C":d.y+=(a.offsetHeight-f)/2;break;
case "t":d.y+=a.offsetHeight-f}switch(k){case "L":d.x-=e;break;case "R":d.x+=a.offsetWidth;break;case "C":d.x+=(a.offsetWidth-e)/2;break;case "l":d.x+=a.offsetWidth-e}d.width=e;d.height=f+40;c.monthsCombo.style.display="none";0>d.x&&(d.x=0);0>d.y&&(d.y=0);e=document.createElement("div");f=e.style;f.position="absolute";f.right=f.bottom=f.width=f.height="0px";document.body.appendChild(e);f=Calendar.getAbsolutePos(e);document.body.removeChild(e);f.y+=window.scrollY;f.x+=window.scrollX;e=d.x+d.width-
f.x;0<e&&(d.x-=e);e=d.y+d.height-f.y;0<e&&(d.y-=e);c.showAt(d.x,d.y)};Calendar.is_khtml?setTimeout("Calendar.continuation_for_the_fucking_khtml_browser()",10):Calendar.continuation_for_the_fucking_khtml_browser()};Calendar.prototype.setDateFormat=function(a){this.dateFormat=a};Calendar.prototype.setTtDateFormat=function(a){this.ttDateFormat=a};Calendar.prototype.parseDate=function(a,b){b||(b=this.dateFormat);this.setDate(Date.parseDate(a,b))};
Calendar.prototype.hideShowCovered=function(){function a(a){var b=a.style.visibility;b||(b=document.defaultView&&"function"==typeof document.defaultView.getComputedStyle?Calendar.is_khtml?"":document.defaultView.getComputedStyle(a,"").getPropertyValue("visibility"):a.currentStyle?a.currentStyle.visibility:"");return b}if(Calendar.is_ie||Calendar.is_opera)for(var b=["applet","iframe","select"],c=this.element,d=Calendar.getAbsolutePos(c),e=d.x,f=c.offsetWidth+e,g=d.y,c=c.offsetHeight+g,k=b.length;0<
k;)for(var h=document.getElementsByTagName(b[--k]),m=null,n=h.length;0<n;){var m=h[--n],d=Calendar.getAbsolutePos(m),p=d.x,r=m.offsetWidth+p,d=d.y,l=m.offsetHeight+d;this.hidden||p>f||r<e||d>c||l<g?(m.__msh_save_visibility||(m.__msh_save_visibility=a(m)),m.style.visibility=m.__msh_save_visibility):(m.__msh_save_visibility||(m.__msh_save_visibility=a(m)),m.style.visibility="hidden")}};
Calendar.prototype._displayWeekdays=function(){for(var a=this.firstDayOfWeek,b=this.firstdayname,c=Calendar._TT.WEEKEND,d=0;7>d;++d){b.className="day name";var e=(d+a)%7;d&&(b.ttip=Calendar._TT.DAY_FIRST.replace("%s",Calendar._DN[e]),b.navtype=100,b.calendar=this,b.fdow=e,Calendar._add_evs(b));-1!=c.indexOf(e.toString())&&Calendar.addClass(b,"weekend");b.innerHTML=Calendar._SDN[(d+a)%7];b=b.nextSibling}};
Calendar.prototype._hideCombos=function(){this.monthsCombo.style.display="none";this.yearsCombo.style.display="none"};
Calendar.prototype._dragStart=function(a){if(!this.dragging){this.dragging=!0;var b;Calendar.is_ie?(b=window.event.clientY+document.body.scrollTop,a=window.event.clientX+document.body.scrollLeft):(b=a.clientY+window.scrollY,a=a.clientX+window.scrollX);var c=this.element.style;this.xOffs=a-parseInt(c.left);this.yOffs=b-parseInt(c.top);with(Calendar)addEvent(document,"mousemove",calDragIt),addEvent(document,"mouseup",calDragEnd)}};Date._MD=[31,28,31,30,31,30,31,31,30,31,30,31];Date.SECOND=1E3;
Date.MINUTE=60*Date.SECOND;Date.HOUR=60*Date.MINUTE;Date.DAY=24*Date.HOUR;Date.WEEK=7*Date.DAY;
Date.parseDate=function(a,b){for(var c=new Date,d=0,e=-1,f=0,g=a.split(/\W+/),k=b.match(/%./g),h=0,m=0,n=0,p=0,h=0;h<g.length;++h)if(g[h])switch(k[h]){case "%d":case "%e":f=parseInt(g[h],10);break;case "%m":e=parseInt(g[h],10)-1;break;case "%Y":case "%y":d=parseInt(g[h],10);100>d&&(d+=29<d?1900:2E3);break;case "%b":case "%B":for(m=0;12>m;++m)if(Calendar._MN[m].substr(0,g[h].length).toLowerCase()==g[h].toLowerCase()){e=m;break}break;case "%H":case "%I":case "%k":case "%l":n=parseInt(g[h],10);break;
case "%P":case "%p":/pm/i.test(g[h])&&12>n?n+=12:/am/i.test(g[h])&&12<=n&&(n-=12);break;case "%M":p=parseInt(g[h],10)}isNaN(d)&&(d=c.getFullYear());isNaN(e)&&(e=c.getMonth());isNaN(f)&&(f=c.getDate());isNaN(n)&&(n=c.getHours());isNaN(p)&&(p=c.getMinutes());if(0!=d&&-1!=e&&0!=f)return new Date(d,e,f,n,p,0);d=0;e=-1;for(h=f=0;h<g.length;++h)if(-1!=g[h].search(/[a-zA-Z]+/)){k=-1;for(m=0;12>m;++m)if(Calendar._MN[m].substr(0,g[h].length).toLowerCase()==g[h].toLowerCase()){k=m;break}-1!=k&&(-1!=e&&(f=e+
1),e=k)}else 12>=parseInt(g[h],10)&&-1==e?e=g[h]-1:31<parseInt(g[h],10)&&0==d?(d=parseInt(g[h],10),100>d&&(d+=29<d?1900:2E3)):0==f&&(f=g[h]);0==d&&(d=c.getFullYear());return-1!=e&&0!=f?new Date(d,e,f,n,p,0):c};Date.prototype.getMonthDays=function(a){var b=this.getFullYear();"undefined"==typeof a&&(a=this.getMonth());return 0!=b%4||0==b%100&&0!=b%400||1!=a?Date._MD[a]:29};
Date.prototype.getDayOfYear=function(){var a=new Date(this.getFullYear(),this.getMonth(),this.getDate(),0,0,0),b=new Date(this.getFullYear(),0,0,0,0,0);return Math.floor((a-b)/Date.DAY)};Date.prototype.getWeekNumber=function(){var a=new Date(this.getFullYear(),this.getMonth(),this.getDate(),0,0,0),b=a.getDay();a.setDate(a.getDate()-(b+6)%7+3);b=a.valueOf();a.setMonth(0);a.setDate(4);return Math.round((b-a.valueOf())/6048E5)+1};
Date.prototype.equalsTo=function(a){return this.getFullYear()==a.getFullYear()&&this.getMonth()==a.getMonth()&&this.getDate()==a.getDate()&&this.getHours()==a.getHours()&&this.getMinutes()==a.getMinutes()};Date.prototype.setDateOnly=function(a){a=new Date(a);this.setDate(1);this.setFullYear(a.getFullYear());this.setMonth(a.getMonth());this.setDate(a.getDate())};
Date.prototype.print=function(a){var b=this.getMonth(),c=this.getDate(),d=this.getFullYear(),e=this.getWeekNumber(),f=this.getDay(),g={},k=this.getHours(),h=12<=k,m=h?k-12:k,n=this.getDayOfYear();0==m&&(m=12);var p=this.getMinutes(),r=this.getSeconds();g["%a"]=Calendar._SDN[f];g["%A"]=Calendar._DN[f];g["%b"]=Calendar._SMN[b];g["%B"]=Calendar._MN[b];g["%C"]=1+Math.floor(d/100);g["%d"]=10>c?"0"+c:c;g["%e"]=c;g["%H"]=10>k?"0"+k:k;g["%I"]=10>m?"0"+m:m;g["%j"]=100>n?10>n?"00"+n:"0"+n:n;g["%k"]=k;g["%l"]=
m;g["%m"]=9>b?"0"+(1+b):1+b;g["%M"]=10>p?"0"+p:p;g["%n"]="\n";g["%p"]=h?"PM":"AM";g["%P"]=h?"pm":"am";g["%s"]=Math.floor(this.getTime()/1E3);g["%S"]=10>r?"0"+r:r;g["%t"]="\t";g["%U"]=g["%W"]=g["%V"]=10>e?"0"+e:e;g["%u"]=f+1;g["%w"]=f;g["%y"]=(""+d).substr(2,2);g["%Y"]=d;g["%%"]="%";b=/%./g;if(!Calendar.is_ie5&&!Calendar.is_khtml)return a.replace(b,function(a){return g[a]||a});c=a.match(b);for(d=0;d<c.length;d++)if(e=g[c[d]])b=RegExp(c[d],"g"),a=a.replace(b,e);return a};
Date.prototype.__msh_oldSetFullYear=Date.prototype.setFullYear;Date.prototype.setFullYear=function(a){var b=new Date(this);b.__msh_oldSetFullYear(a);b.getMonth()!=this.getMonth()&&this.setDate(28);this.__msh_oldSetFullYear(a)};window._dynarch_popupCalendar=null;
