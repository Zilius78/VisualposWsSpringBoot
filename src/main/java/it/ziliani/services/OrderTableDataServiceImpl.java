package it.ziliani.services;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.ziliani.entities.OrdiniT;
import it.ziliani.repository.OrderTableDataRepository;

@Service
@Transactional

public class OrderTableDataServiceImpl  implements OrderTableDataService {
	@PersistenceContext
	private EntityManager entMan;
	
	@Autowired
	private OrderTableDataRepository order;
	
	


	
//	public List<OrdiniT> SelByTableDate(@Param("tavoloOrt") int tavoloOrt, @Param("dataOrt") Date dataOrt, int fattorinoOrt, String statoOrt){
//	 	return    order.findAll();
//	}

	@Override
	// tagliata , int fattorinoOrt, String statoOrt
	public OrdiniT SelByOrdineBarcode(int tavoloOrt, Date dataOrt) {
	// tagliata	, fattorinoOrt, statoOrt
		return order.SelByOrdineBarcode(tavoloOrt, dataOrt);
	}



	@Override
	@Transactional
	public void update(OrdiniT ot) {
		entMan.merge(ot);
		
	}



	

	

	
	
	

}
