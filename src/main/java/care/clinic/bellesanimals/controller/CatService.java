package care.clinic.bellesanimals.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import care.clinic.bellesanimals.model.Cat;

@Service
@Transactional
public class CatService {
    @Autowired
    public CatRepository catrepo;

	public Cat addCat(Cat cat) {
		System.out.println("new cat called in service");
		return catrepo.save(cat);
	}

	public Iterable<Cat> getAllCats() {
		System.out.println("All cats returned");
		return catrepo.findAll();
	}

	public void deleteCatById(long id) {
		System.out.println("cat is deleted");
		catrepo.deleteById(id);
	}

	public Cat getCatById(long id) {
		System.out.println("cat retrieved!");
		return catrepo.findById(id).get();
	}

	public Cat updateCat(long id, Cat cat) {
		System.out.println("cat was updated");
		Cat newCat = catrepo.findById(id).get();
		return catrepo.save(newCat);
	}
}
