package org.examen;


import java.time.LocalDate;

public class Solo extends Artistes{
    private String nom;
    private String prenom;
    private LocalDate dateDeNaissance;

    public Solo(int id, String nomDeScene, LocalDate anneeDeDebut, String nationalite, String nom, String prenom, LocalDate dateDeNaissance) {
        super(id, nomDeScene, anneeDeDebut, nationalite);
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(LocalDate dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }


}
