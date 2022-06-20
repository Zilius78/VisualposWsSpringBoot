package it.ziliani.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import it.ziliani.entities.OrdiniT;

@Repository
public interface OrderTableDataRepository extends JpaRepository<OrdiniT, Long>
{
	//tagliata && STATO_ORT LIKE :statoOrt && FATTORINO_ORT = :fattorinoOrt
	@Query(value = "SELECT DISTINCT * FROM myristo.vo_ordini_t  WHERE TAVOLO_ORT LIKE :tavoloOrt && DATE(DATA_ORT) = :dataOrt ", nativeQuery = true) 
	//taglaita ,@Param("fattorinoOrt")int fattorinoOrt,@Param("statoOrt")String statoOrt
	OrdiniT SelByOrdineBarcode(@Param("tavoloOrt")int tavoloOrt,@Param("dataOrt")Date dataOrt);
	
	
//	@Modifying(flushAutomatically = true)
//	@Query(value = "UPDATE myristo.vo_ordini_t SET FATTORINO_ORT = :fattorinoN, STATO_ORT='CNS' WHERE TAVOLO_ORT LIKE :tavoloOrt && DATE(DATA_ORT) = :dataOrt && STATO_ORT LIKE :statoOrt && FATTORINO_ORT = :fattorinoOrt", nativeQuery = true)
//	
//	OrdiniT AssegnaRider(@Param("fattorinoN")int fattorinoN,@Param("tavoloOrt")int tavoloOrt,@Param("dataOrt")Date dataOrt,@Param("fattorinoOrt")int fattorinoOrt,@Param("statoOrt")String statoOrt);
	
	
	

}
