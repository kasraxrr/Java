package model;

import java.util.ArrayList;

public class Cd {
    private String title,artist;
    private ArrayList<Song>songs;

    public Cd(String title, String artist, Song song){
        this.title=title;
        this.artist=artist;
        this.songs=new ArrayList<>();
        this.songs.add(song);
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
    public Time getLength(){
        int cdLength = 0;
        for (int i=0;i<songs.size();i++){
            cdLength+=songs.get(i).getLength().getTimeInSeconds();
        }
        return new Time(cdLength);
    }
    public Song getSong(int index){
       return songs.get(index);
    }
    public int getNumberOfSongs(){
        return songs.size();
    }
    @Override
    public String toString(){
        return title+artist+songs;
    }
}

