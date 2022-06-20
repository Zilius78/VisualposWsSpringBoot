package it.ziliani.services;



import java.util.Date;

import it.ziliani.entities.OrdiniT;

public interface OrderTableDataService {

	
//tagliata ,int fattorinoOrt,String statoOrt

public OrdiniT  SelByOrdineBarcode(int tavoloOrt,Date dataOrt);





public void update(OrdiniT ot);


}
