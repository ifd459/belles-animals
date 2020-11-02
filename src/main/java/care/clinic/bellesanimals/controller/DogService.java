package care.clinic.bellesanimals.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class DogService {
	   @Autowired
	    public DogRepository dogrepo;
}
