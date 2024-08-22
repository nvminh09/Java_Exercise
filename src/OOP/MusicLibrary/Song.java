package OOP.MusicLibrary;
public class Song {
    private String titleSong;
    private String artist;
    private String author;
    public Song(String titleSong, String artist, String author) {
        this.titleSong = titleSong;
        this.artist = artist;
        this.author = author;
    }
    public String getTitleSong() {
        return titleSong;
    }
    public void setTitleSong(String titleSong) {
        this.titleSong = titleSong;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
}
