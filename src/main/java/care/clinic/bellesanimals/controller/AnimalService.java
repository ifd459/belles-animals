package care.clinic.bellesanimals.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import care.clinic.bellesanimals.model.Animal;

@Service
@Transactional
public class AnimalService {
	@Autowired
	public AnimalRepository animalrepo;

	public Animal getAnimalById(long id) {
		System.out.println("animal retrieved");
		return animalrepo.findById(id).get();
	}

	public void deleteAnimalById(long id) {
		System.out.println("animal is deleted");
		animalrepo.deleteById(id);
	}

	public Iterable<Animal> getAllAnimals() {
		System.out.println("All animals returned");
		return animalrepo.findAll();
	}

}
