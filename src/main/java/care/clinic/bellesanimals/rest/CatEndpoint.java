package care.clinic.bellesanimals.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import care.clinic.bellesanimals.controller.CatService;

@RestController
@RequestMapping("/api/shelter")
public class CatEndpoint {
	@Autowired
	CatService catservice;
	

}
