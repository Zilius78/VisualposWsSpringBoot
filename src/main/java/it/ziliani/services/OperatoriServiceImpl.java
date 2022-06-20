package it.ziliani.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.ziliani.entities.Operatori;
import it.ziliani.repository.OperatoriRepository;

@Service
@Transactional
public class OperatoriServiceImpl implements OperatoriService{
	@Autowired
	
	OperatoriRepository operatoriRepository; 
	@Override
	public Iterable<Operatori> selTutti() {
		
		return operatoriRepository.findAll();
	}

}
