# README #

This README would normally document whatever steps are necessary to get your application up and running.

### How to get started?? ###


###Prerequisites: Softwares required ###
* Mercurial
* Tomcat 8
* MySQL 
* Get the mercurial-eclipse eclipse plugin: http://mercurialeclipse.eclipselabs.org.codespot.com/hg.wiki/update_site/stable


### How do I get set up? ###

1> Register at bitbucket [https://bitbucket.org]. An invitation has been sent to  amitrawal1305@gmail.com. Our team name is teamgyan and repo name is gyan_repo

2> Navigate to your workspace, where you want to create codebase. 
cd C:\Users\suchendra.kumar\EclipseProjects

3> Clone the repo
hg clone https://skumar18@bitbucket.org/teamgyan/gyan_repo

4> replace the attached hgrc file at C:\Users\suchendra.kumar\EclipseProjects\gyan_repo\.hg\
after changing the username

5> To check-in changes > 
1. hg commit -m "comment"
2. hg push 

5.1> If you are adding new files to your local code base, you need to "Add files to VCS" too. [Similar as we did for startteam, just a reminter]. Only after this you would be able to commit new files.

6> to check what changes you have made in your local code base which need to be committed.
hg diff

7> to check what changes you are going to checkin after you have committed
hg out

8> to get latest changes from repo
hg pull -u


### DB Setup? ###

* Install mysql with workbench, keep credentials: root/gyaan
* run database scripts from scriptDB.sql file.

### Who do I talk to? ###

* Suchendra Kumar/ Amit Rawal