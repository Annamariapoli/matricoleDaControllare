package it.polito.tdp.model;

import java.util.LinkedList;
import java.util.List;

public class Model {
	
	private List<Studente> studenti = new LinkedList<Studente>();  
	
	public void aggiungiStudente(Studente studente){      //ok
		if(!studenti.contains(studente))
		   studenti.add(studente);				
	}
	
	public Studente cercaStudente(String matricola){          //ok
		for(Studente s : studenti){
			if(s.getMatricola().compareTo(matricola)==0){
				System.out.println(s);
				return s;
			}
		}
		System.out.println("non trovato");
		return null;
	}

	public List<Corso> cercaStudenteListaCorsi(String matricola){          //ok!!
		for(Studente s : studenti){
			if(s.getMatricola().equals(matricola)){
			System.out.println(s.getCorsi());
				return s.getCorsi();                                    //se c'è ritorna la lista dei corsi
			}
		}
		System.out.println("Non trovato");
		return null;
	}
	
	/*public void stampaCorsiUnoPerRiga(){          //tutte le matricole una per riga
		String risultato="";
		for(int i=0; i<matricole.size(); i++){
			risultato += matricole.getCorso();
			System.out.println(risultato);
			
		}
	}*/

	public void stampaStudenti(){            //Tutte le matricole
		System.out.println(studenti);      
	}
	
	/*public void stampaMatricolaCercata(String stringa){        //stampa solo quella cercata
		if(matricole.contains(stringa)){
			System.out.println(stringa);
		}
	}
	*/
}
