// Write a Java program to create a class called "MusicLibrary" with a collection of songs and methods to add and
// remove songs, and to play a random song.
package OOP.MusicLibrary;

import java.util.ArrayList;
import java.util.Random;

public class MusicLibrary {
    private ArrayList<Song> songs;
    public MusicLibrary() {
        songs = new ArrayList<>();
    }
    public void addSong(Song song) {
        songs.add(song);
    }
    public void removeSong(Song song) {
        songs.remove(song);
    }
    public ArrayList<Song> getSongs() {
        return songs;
    }
    public void printMusicLibrary(MusicLibrary library) {
        for (Song song : library.getSongs()) {
            System.out.println("Title: " + song.getTitleSong() + ", Artist: " + song.getArtist() + ", Author: " + song.getAuthor());
        }
    }
    public void playRandomSong() {
        int size = songs.size();
        Random rand = new Random();
        int randomIndex = rand.nextInt(size);
        Song randomSong = songs.get(randomIndex);
        System.out.println("Playing: " + randomSong.getTitleSong() + ". Artist: " + randomSong.getArtist() + ". Author: " + randomSong.getAuthor());
    }
}