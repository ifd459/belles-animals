package care.clinic.bellesanimals.controller;

import org.springframework.data.repository.CrudRepository;
import care.clinic.bellesanimals.model.Dog;

public interface DogRepository extends CrudRepository<Dog, Long>{

}
