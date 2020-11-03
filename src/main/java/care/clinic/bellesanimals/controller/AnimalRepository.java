package care.clinic.bellesanimals.controller;

import org.springframework.data.repository.CrudRepository;

import care.clinic.bellesanimals.model.Animal;
import care.clinic.bellesanimals.model.Cat;

public interface AnimalRepository extends CrudRepository<Animal, Long>{

}
