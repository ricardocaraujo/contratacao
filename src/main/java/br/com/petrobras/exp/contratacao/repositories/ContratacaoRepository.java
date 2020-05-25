package br.com.petrobras.exp.contratacao.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.petrobras.exp.contratacao.domain.Contratacao;

@Repository
@Transactional
public class ContratacaoRepository implements GenericRepository<Contratacao> {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Contratacao findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Contratacao t) {
		manager.persist(t);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Contratacao> findAll() {
		return manager.createQuery("select c from Contratacao c", Contratacao.class).getResultList();
	}

	@Override
	public void update(Contratacao t) {
		// TODO Auto-generated method stub
		
	}

}
