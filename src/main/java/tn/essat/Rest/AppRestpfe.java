package tn.essat.Rest;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.essat.Model.Pfe;
import tn.essat.dao.IPfe;
@CrossOrigin("*")
@RestController
@RequestMapping("/rest")
public class AppRestpfe {
	@Autowired
	IPfe pfedao;
	@GetMapping("/Allpfes")
	public List<Pfe> get1(){
		return pfedao.findAll();
	}
	@GetMapping("/Allpfe/{titre}")
	public Pfe get2(@PathVariable ("titre") String titre){
		return pfedao.findByTitre(titre);
	}
	@DeleteMapping("/deletepfe/{id}")
	public void del(@PathVariable int id){
		pfedao.deleteById(id);
	}
	@PostMapping("/savepfe")
	public void post2222(@RequestBody Pfe m){
	pfedao.save(m);
	}
	@GetMapping("/Allpfe/{type}")
	public Pfe get23(@PathVariable ("type") String type){
		return pfedao.findbytype(type);}
	
	
	
	
	
	
}
