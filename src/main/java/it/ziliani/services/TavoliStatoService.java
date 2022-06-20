package it.ziliani.services;

import it.ziliani.entities.TavoliStato;

public interface TavoliStatoService {
	
	public TavoliStato getByid(Integer id);

	public void update(TavoliStato t);

}
