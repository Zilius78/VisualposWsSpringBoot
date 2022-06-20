package it.ziliani.services;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.ziliani.entities.TavoliStato;
import it.ziliani.repository.TavoliStatoRepository;

@Service
@Transactional
public class TavoliStatoServiceImpl implements TavoliStatoService{
	
	@PersistenceContext
	private EntityManager entMan;
	@Autowired
	TavoliStatoRepository tavoliStatoRepository;
	@Override
	public TavoliStato getByid(Integer id) {
		
		return tavoliStatoRepository.getById(id);
	}
	@Override
	@Transactional
	public void update(TavoliStato t) {
		entMan.merge(t);
		
	}

}
