package edu.sms.service;

import java.util.List;

public interface CRUDInjectService<E, F> {
	public E get(F form);

	public void save(F form);

	public void delete(F form);

	public List list(F form);

	public E getById(Long id);

	public void saveById(Integer id);

	public List<E> listByForeignId(Long parentId);

	public void deleteById(Integer id);
}
