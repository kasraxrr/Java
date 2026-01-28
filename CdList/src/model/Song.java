package model;

public class Song {
    private String title,artist;
    private Time length;
    public Song(String artist, String title, Time length){
        this.artist=artist;
        this.title=title;
        this.length=length;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public Time getLength() {
        return length;
    }
    @Override
    public String toString(){
        return title+artist;
    }
}
