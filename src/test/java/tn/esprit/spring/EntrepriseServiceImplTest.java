package tn.esprit.spring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.repository.DepartementRepository;
import tn.esprit.spring.services.IDepartementService;
import tn.esprit.spring.services.IEntrepriseService;

@SpringBootTest
public class EntrepriseServiceImplTest {

	@Autowired
	IEntrepriseService es ;
	@Autowired
	DepartementRepository depRepository ;
	@Autowired
	IDepartementService id ;
	
	@Test
	void ajouterEntrepriseTest()
	{
		Entreprise ent = new Entreprise("ggg","gggg");
		ent.setId(2);
		assertEquals(2,  es.ajouterEntreprise(ent));
	}
	
}
