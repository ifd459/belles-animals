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

	public Cat updateCat(long id, Cat cat) {
		System.out.println("cat was updated");
		Cat newCat = catrepo.findById(id).get();
		if (cat.getName() != null && cat.getName() != "") {
			newCat.setName(cat.getName());
		}
		if (cat.getBirthday() != null && cat.getBirthday() != "") {
			newCat.setBirthday(cat.getBirthday());
		}
		if (cat.getArrivalDate() != null && cat.getArrivalDate() != "") {
			newCat.setArrivalDate(cat.getArrivalDate());
		}
		if (cat.getGender() != null && cat.getGender() != "") {
			newCat.setGender(cat.getGender());
		}
		return catrepo.save(newCat);
	}



}
