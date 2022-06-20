package it.ziliani.services;


import java.util.List;
import java.util.Optional;

import it.ziliani.entities.Periferiche;

public interface PerifericheService {

	public List<Periferiche> selTutti();
	
	

	public Optional<Periferiche> findPrnById(int id);
}
