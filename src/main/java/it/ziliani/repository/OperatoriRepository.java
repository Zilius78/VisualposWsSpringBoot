package it.ziliani.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.ziliani.entities.Operatori;
@Repository
public interface OperatoriRepository extends CrudRepository<Operatori,Long>{
	
 
}
