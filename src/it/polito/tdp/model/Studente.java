package it.polito.tdp.model;

import java.util.LinkedList;
import java.util.List;

public class Studente {
	private String matricola;
	private List<Corso> corsi = new LinkedList<Corso> ();
	
	
	public Studente(String matricola,List<Corso> corsi) {
		super();
		this.matricola=matricola;
		this.corsi = corsi;
       
	}	
	public String getMatricola() {
		return matricola;
	}
	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	public List <Corso>getCorsi() {                    //ritorna la lista dei corsi a cui lo studente è iscritto
		return corsi;
	}
	public void setCorso(List <Corso > corsi) {
		this.corsi = corsi;
	}
	
	
	public void aggiungiCorso(Corso corsoNuovo){      //ok
		if(!corsi.contains(corsoNuovo)){
			corsi.add(corsoNuovo);
		}
	}
	
	public String toString(){
		String risultato= "";
		risultato = matricola+" " +corsi+ "\n";
		return risultato;
	}

}
