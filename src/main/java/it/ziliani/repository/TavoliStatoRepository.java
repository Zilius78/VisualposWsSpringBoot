package it.ziliani.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.ziliani.entities.TavoliStato;
@Repository
public interface TavoliStatoRepository extends JpaRepository<TavoliStato, Integer>{

}
