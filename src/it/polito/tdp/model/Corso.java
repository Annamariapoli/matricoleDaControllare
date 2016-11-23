package it.polito.tdp.model;

public class Corso {
	
	private String nome;
	private int crediti;
	private String  semestre;             //(o 1 o 2)  è boolean?
	
	public Corso(String nome, int crediti, String semestre) {
		super();
		this.nome = nome;
		this.crediti = crediti;
		this.semestre = semestre;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCrediti() {
		return crediti;
	}
	public void setCrediti(int crediti) {
		this.crediti = crediti;
	}
	public String getSemestre() {
		return semestre;
	}
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	
	public String toString(){
		String risu="";
		risu= nome+" "+crediti+" "+semestre+" "+"\n";
		return risu;
	}
}
