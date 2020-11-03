package care.clinic.bellesanimals.controller;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import care.clinic.bellesanimals.model.Animal;
import care.clinic.bellesanimals.model.Dog;

@Service
@Transactional
public class DogService {
	@Autowired
	public DogRepository dogrepo;

	public Dog addDog(Dog dog) {
		System.out.println("new dog called in service");
		return dogrepo.save(dog);
	}

	public Iterable<Dog> getAllDogs() {
		System.out.println("All dogs returned");
		return dogrepo.findAll();
	}

	public Animal updateDog(long id, Dog dog) {
		System.out.println("dog was updated");
		Dog newDog = dogrepo.findById(id).get();
		if (dog.getName() != null && dog.getName() != "") {
			newDog.setName(dog.getName());
		}
		if (dog.getBirthday() != null && dog.getBirthday() != "") {
			newDog.setBirthday(dog.getBirthday());
		}
		if (dog.getArrivalDate() != null && dog.getArrivalDate() != "") {
			newDog.setArrivalDate(dog.getArrivalDate());
		}
		if (dog.getGender() != null && dog.getGender() != "") {
			newDog.setGender(dog.getGender());
		}
		return dogrepo.save(newDog);
	}

}
