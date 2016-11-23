package it.polito.tdp.model;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
	
			Model m = new Model(); 
			List<Corso> corsis1 = new LinkedList<Corso> ();
			List<Corso> corsis2 = new LinkedList<Corso> ();
			List<Corso> corsis3 = new LinkedList<Corso> ();
			
			Corso c1 = new Corso("matematica", 8, "1 semestre");
			Corso c2 = new Corso("italiano", 10, "2 semestre");
			Corso c3 = new Corso("geografia", 12, "1 semestre");
			
			
			Studente s1 = new Studente("111",corsis1);
			Studente s2 = new Studente("222",corsis2);
			Studente s3 = new Studente("333",corsis3);
			
			
			m.aggiungiStudente(s1);
			m.aggiungiStudente(s2);
			m.aggiungiStudente(s3);
			m.aggiungiStudente(s2);
			m.aggiungiStudente(s3);
			
			
			s1.aggiungiCorso(c1);
			s1.aggiungiCorso(c2);
		
			s2.aggiungiCorso(c3);
			s2.aggiungiCorso(c1);
		
			s3.aggiungiCorso(c1);
			s3.aggiungiCorso(c2);
			s3.aggiungiCorso(c3);
			s3.aggiungiCorso(c2);
			
			m.stampaStudenti();
			
			//m.cercaStudenteListaCorsi("117");
			
			m.cercaStudente("181");
		
			//s1.aggiungiCorso(c1);
			

	}

}
