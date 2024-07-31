package org.examen;

import java.util.List;

public class Playlist {
    private List<Chansons> playListChanson;
    private List<Albums> playlistAlbum;
    private Artistes artiste;
    private Statut statut;

    public Playlist(List<Chansons> playListChanson, List<Albums> playlistAlbum, Artistes artiste, Statut statut) {
        this.playListChanson = playListChanson;
        this.playlistAlbum = playlistAlbum;
        this.artiste = artiste;
        this.statut = statut;
    }

    public List<Chansons> getPlayListChanson() {
        return playListChanson;
    }

    public void setPlayListChanson(List<Chansons> playListChanson) {
        this.playListChanson = playListChanson;
    }

    public List<Albums> getPlaylistAlbum() {
        return playlistAlbum;
    }

    public void setPlaylistAlbum(List<Albums> playlistAlbum) {
        this.playlistAlbum = playlistAlbum;
    }

    public Artistes getArtiste() {
        return artiste;
    }

    public void setArtiste(Artistes artiste) {
        this.artiste = artiste;
    }

    public Statut getStatut() {
        return statut;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }

    public void addToPlaylist (Chansons chansons) {
        playListChanson.add(chansons);
    }

    public void removeById(Chansons chansons) {
        playListChanson.remove(chansons.getId());
    }

    public void exclude(Chansons chansons, Playlist newPlaylistChanson, String genre) {
        if (chansons.getGenre() == genre) {

        }
    }

}
