package it.ziliani.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.ziliani.entities.OrdiniT;

@Repository
public interface OrdiniTRepository  extends CrudRepository<OrdiniT,Long>{
 
}
