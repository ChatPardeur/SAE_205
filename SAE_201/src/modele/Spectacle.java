package modele;

import java.util.ArrayList;

public class Spectacle
{
    private String nom;
    private int duree;
    private int nbreMaxSpect;
    private String genre;
    private Tarif tarif;


    public Spectacle(String nom, int duree, int nbreMaxSpect, String genre)
    {
        this.nom = nom;
        this.duree = duree;
        this.nbreMaxSpect = nbreMaxSpect;
        this.genre = genre;
    }


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getDuree() {
		return duree;
	}


	public void setDuree(int duree) {
		this.duree = duree;
	}

	

	public Tarif getTarif() {
		return tarif;
	}


	public void setTarif(Tarif tarif) {
		this.tarif = tarif;
	}


	public int getNbreMaxSpect() {
		return nbreMaxSpect;
	}


	public void setNbreMaxSpect(int nbreMaxSpect) {
		this.nbreMaxSpect = nbreMaxSpect;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	
}
