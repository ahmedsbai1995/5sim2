package tn.esprit.log4j;

import org.apache.log4j.Logger;

public class AffichageLog {

	private static final Logger l = Logger.getLogger(AffichageLog.class);

	public static void main(String[] args) {
		AffichageLog al = new AffichageLog();
		al.getAllPrducts();
	}
 
	public void getAllPrducts() {
		try {
			
			// DEBUG / INFO / WARN / ERROR  
			
			l.info("In getAllPrducts() : ");
			
			l.debug("Je vais  lancer la divsion.");
			int i = 1; //1/0; 
			// ....
			l.debug("Je viens de lancer la divsion. " + i);
			l.debug("Je viens de finir l'opération X."); 

			l.info("Out getAllPrducts() without errors." ); // after retruning 
		} catch (Exception e) {
			l.error("Erreur dans getAllPrducts() : " + e); // after throwing 
		} finally {
			// dans tous les cas
			l.info("Méthode getAllPrducts() finie  ");
		}
	}
}