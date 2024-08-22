package OOP.MusicLibrary;
public class MusicLibraryMain {
    public static void main(String[] args) {
        MusicLibrary musicLibrary = new MusicLibrary();
        Song song1 = new Song("Song1", "Artist1", "Author1");
        Song song2 = new Song("Song2", "Artist2", "Author2");
        Song song3 = new Song("Song3", "Artist3", "Author3");
        Song song4 = new Song("Song4", "Artist4", "Author4");
        Song song5 = new Song("Song5", "Artist5", "Author5");
        Song song6 = new Song("Song6", "Artist6", "Author6");
        Song song7 = new Song("Song7", "Artist7", "Author7");
        musicLibrary.addSong(song1);
        musicLibrary.addSong(song2);
        musicLibrary.addSong(song3);
        musicLibrary.addSong(song4);
        musicLibrary.addSong(song5);
        musicLibrary.addSong(song6);
        musicLibrary.addSong(song7);
        System.out.println("Music Library: ");
        musicLibrary.printMusicLibrary(musicLibrary);
        musicLibrary.removeSong(song2);
        musicLibrary.removeSong(song5);
        System.out.println("Music Library after removing a song: ");
        musicLibrary.printMusicLibrary(musicLibrary);
        System.out.println("Playing a random song:" + "\n");
        musicLibrary.playRandomSong();
    }
}