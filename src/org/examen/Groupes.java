package org.examen;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Groupes extends Solo{
    private List<Solo> groupes;

    public Groupes(int id, String nomDeScene, LocalDate anneeDeDebut, String nationalite, String nom, String prenom, LocalDate dateDeNaissance, List<Solo> groupes) {
        super(id, nomDeScene, anneeDeDebut, nationalite, nom, prenom, dateDeNaissance);
        this.groupes = new ArrayList<>();
    }
}
