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
import care.clinic.bellesanimals.controller.AnimalService;
import care.clinic.bellesanimals.controller.CatService;
import care.clinic.bellesanimals.controller.DogService;
import care.clinic.bellesanimals.model.Animal;
import care.clinic.bellesanimals.model.Cat;
import care.clinic.bellesanimals.model.Dog;

@RestController
@RequestMapping("/api/shelter")
public class AnimalEndpoint {
	@Autowired
	CatService catservice;
	@Autowired
	DogService dogservice;
	@Autowired
	AnimalService animalservice;
	
	//create critter endpoints
	@PostMapping("/add/cat")
	public Cat addCat(@RequestBody Cat cat) {
		System.out.println("There is a new cat in the system!");
		return catservice.addCat(cat);
	}
	@PostMapping ("/add/dog")
	public Dog addDog(@RequestBody Dog dog) {
		System.out.println("there is a new dog in the system!");
		return dogservice.addDog(dog);
	}
	
	//call up endpoints
	@GetMapping("/get/all/cats")
	public Iterable<Cat> getCats(){
		return catservice.getAllCats();
	}
	
	@GetMapping ("/get/all/dogs")
	public Iterable<Dog> getDogs(){
		return dogservice.getAllDogs();
	}
	
	@GetMapping("/get/all/animals")
		public Iterable<Animal> getAnimals(){
			return animalservice.getAllAnimals();
		}
	
	
	@GetMapping("/get/animal/{id}")
	public Animal getAnimalById(@PathVariable(value="id") long id) {
		return animalservice.getAnimalById(id);
	}
	
	@DeleteMapping("/delete/animal/{id}")
	public String deleteAnimalById(@PathVariable(value="id") long id) {
		animalservice.deleteAnimalById(id);
		return "animal has been deleted";
	}
	
	@PutMapping("/update/cat/{id}")
	public Cat updateCat(@PathVariable(value="id") long id, @RequestBody Cat cat) {
		return catservice.updateCat(id, cat);
	}
	@PutMapping("/update/dog/{id}")
	public Animal updateAnimal(@PathVariable(value="id") long id, @RequestBody Dog dog) {
		return dogservice.updateDog(id, dog);
	}
}
