package it.ziliani.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.ziliani.entities.Periferiche;
import it.ziliani.repository.PerifericheRepository;

@Service
@Transactional
public class PerifericheServiceImpl implements PerifericheService{
	@Autowired
	PerifericheRepository perifericheRepository ;

	
	
	


	@Override
	public List<Periferiche> selTutti() {
		List<Periferiche> listPer = (List<Periferiche>) perifericheRepository.findAll();
		return  listPer;
	}






	@Override
	public Optional<Periferiche> findPrnById(int id) {
		
		return perifericheRepository.findById(id);
	}






	






	






	






	
}
