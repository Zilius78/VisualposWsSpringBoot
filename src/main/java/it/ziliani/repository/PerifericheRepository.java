package it.ziliani.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.ziliani.entities.Periferiche;
@Repository
public interface PerifericheRepository extends CrudRepository<Periferiche,Integer>{
	
	

}
