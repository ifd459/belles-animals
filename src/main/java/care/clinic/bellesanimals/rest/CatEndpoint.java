package care.clinic.bellesanimals.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import care.clinic.bellesanimals.controller.CatService;
import care.clinic.bellesanimals.model.Cat;

@RestController
@RequestMapping("/api/shelter")
public class CatEndpoint {
	@Autowired
	CatService catservice;

	//Post endpoints
	@PostMapping("/add/cat")
	public Cat addCat(@RequestBody Cat cat) {
		System.out.println("There is a new cat in the system!");
		return catservice.addCat(cat);
	}
	
	//Get endpoints
	@GetMapping("/get/all/cats")
	public Iterable<Cat> getCats(){
		return catservice.getAllCats();
	}
	
	@GetMapping("/get/cat/{id}")
	public Cat getCatById(@PathVariable(value="id") long id) {
		return catservice.getCatById(id);
	}
	
	//Delete endpoints
	@DeleteMapping("/delete/cat/{id}")
	public String deleteCatById(@PathVariable(value="id") long id) {
		catservice.deleteCatById(id);
		return "cat has been deleted";
	}
	
	@PutMapping("/update/cat/{id}")
	public Cat updateCat(@PathVariable(value="id") long id, @RequestBody Cat cat) {
		return catservice.updateCat(id, cat);
	}
	
}
