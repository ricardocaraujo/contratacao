package br.com.petrobras.exp.contratacao.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;


public interface GenericRepository<T> {
	
	public T findById(Integer id);
	public void insert(T t);
	public void delete(Integer id);
	public List<T> findAll();
	public void update(T t);
	

}
