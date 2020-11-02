package care.clinic.bellesanimals.controller;

import org.springframework.data.repository.CrudRepository;

import care.clinic.bellesanimals.model.Cat;

public interface CatRepository extends CrudRepository<Cat, Long> {

}
