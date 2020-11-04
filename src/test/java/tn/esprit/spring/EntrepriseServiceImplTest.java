package tn.esprit.spring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.log4j.AffichageLog;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.repository.DepartementRepository;
import tn.esprit.spring.services.IDepartementService;
import tn.esprit.spring.services.IEntrepriseService;

@SpringBootTest
public class EntrepriseServiceImplTest {
	
	private static final Logger l = Logger.getLogger(EntrepriseServiceImplTest.class);

	@Autowired
	IEntrepriseService es ;
	@Autowired
	DepartementRepository depRepository ;
	@Autowired
	IDepartementService id ;
	
	@Test
	void ajouterEntrepriseTest()
	{
try {
			
			// DEBUG / INFO / WARN / ERROR  
			
			l.info("In getAllPrducts() : ");
			
			l.debug("Je vais  lancer le test.");
			// ....
			l.debug("Je viens de lancer le test " );
			l.debug("Je viens de finir le test."); 

			l.info("Out getAllPrducts() without errors." ); // after retruning 
		} catch (Exception e) {
			l.error("Erreur dans getAllPrducts() : " + e); // after throwing 
		}

		Entreprise ent = new Entreprise("ggg","gggg");
		ent.setId(2);
		assertEquals(3,  es.ajouterEntreprise(ent));
	}
	
}
