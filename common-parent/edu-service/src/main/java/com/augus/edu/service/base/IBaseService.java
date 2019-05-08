package com.augus.edu.service.base;

public interface IBaseService<T> {

    public T findById(Integer id);

    public T findByUUId(String id);

    public void deleteById(Integer id);

    public void deleteByUUId(String id);

    public void save(T entity);

    public void update(T entity);

}
