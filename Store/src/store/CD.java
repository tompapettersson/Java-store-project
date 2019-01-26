/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store;

/**
 *
 * @author Tommy
 */
public class CD {
       private String artist;
    private String recName;
    private String genre; 
    private int cdId;
   

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getRecName() {
        return recName;
    }

    public void setRecName(String recName) {
        this.recName = recName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getCdId() {
        return cdId;
    }

    public void setCdId(int cdId) {
        this.cdId = cdId;
    }

    @Override
    public String toString() {
        return "Records " + "Artist=" + artist + ", Album=" + recName + 
                ", Genre=" + genre + ", ID=" + cdId + ':';
    }
}
