package org.examen;


import java.time.LocalDate;

public abstract class Artistes {
    private int id;
    private String nomDeScene;
    private LocalDate anneeDeDebut;
    private String nationalite;

    public Artistes(int id, String nomDeScene, LocalDate anneeDeDebut, String nationalite) {
        this.id = id;
        this.nomDeScene = nomDeScene;
        this.anneeDeDebut = anneeDeDebut;
        this.nationalite = nationalite;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDeScene() {
        return nomDeScene;
    }

    public void setNomDeScene(String nomDeScene) {
        this.nomDeScene = nomDeScene;
    }

    public LocalDate getAnneeDeDebut() {
        return anneeDeDebut;
    }

    public void setAnneeDeDebut(LocalDate anneeDeDebut) {
        this.anneeDeDebut = anneeDeDebut;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalité(String nationalite) {
        this.nationalite = nationalite;
    }
}
