package IteratorPattern;

public class Main {
    static void main(String[] args) {
        Playlist playlist = new Playlist();

        playlist.addSong(new Song("Sao Paulo"));
        playlist.addSong(new Song("blinding light"));

        MyIterator<Song> iterator = playlist.iterator();

        while (iterator.hasNext()) {
            Song song = iterator.next();
            System.out.println(song.getTitle());
        }
    }

}
