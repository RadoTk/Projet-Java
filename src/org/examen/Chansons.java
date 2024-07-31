package org.examen;


import java.time.Duration;

public class Chansons {
    private int id;
    private String titre;
    private Duration duration;
    private Artistes artistes;
    private GenreDeMusique genre;

    public Chansons(int id, String titre, Duration duration, Artistes artistes, GenreDeMusique genre) {
        this.id = id;
        this.titre = titre;
        this.duration = duration;
        this.artistes = artistes;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public Artistes getArtistes() {
        return artistes;
    }

    public void setArtistes(Artistes artistes) {
        this.artistes = artistes;
    }

    public GenreDeMusique getGenre() {
        return genre;
    }

    public void setGenre(GenreDeMusique genre) {
        this.genre = genre;
    }
}
