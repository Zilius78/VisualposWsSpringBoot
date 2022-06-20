package it.ziliani.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import it.ziliani.entities.Periferiche;
import it.ziliani.services.PerifericheServiceImpl;




	

@RestController
@RequestMapping(path="/api/periferiche")

public class PerifericheController {
	@Autowired
	private PerifericheServiceImpl perifericheRepo;
	
	@GetMapping(path="/all")
	@ResponseBody
	public ResponseEntity<List<Periferiche>> List() {
		
		List<Periferiche> listaPeriferiche =  perifericheRepo.selTutti();
		
		return new ResponseEntity<List<Periferiche>>(listaPeriferiche,HttpStatus.OK);
		
		
		
	}
	

}