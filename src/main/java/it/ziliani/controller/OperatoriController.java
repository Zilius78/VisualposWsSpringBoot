package it.ziliani.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import it.ziliani.entities.Operatori;

import it.ziliani.services.OperatoriServiceImpl;

@RestController
@RequestMapping(path="/api/operatori")

public class OperatoriController {
	@Autowired
	private OperatoriServiceImpl repoOperatori;
	
	@GetMapping(path="/all")
	@ResponseBody
	public ResponseEntity<List<Operatori>> opList() {
		Iterable<Operatori> listaOperatori = repoOperatori.selTutti();
		
		return new ResponseEntity<List<Operatori>>((List<Operatori>) listaOperatori,HttpStatus.OK);
		
		
		
		
	}
	

}
