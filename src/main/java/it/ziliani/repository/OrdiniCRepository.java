package it.ziliani.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.ziliani.entities.OrdiniC;


@Repository
public interface OrdiniCRepository  extends CrudRepository<OrdiniC,Long>{
 
}
