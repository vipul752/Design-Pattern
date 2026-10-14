package IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private final List<Song> songs = new ArrayList<>();

    public void addSong(Song song){
        songs.add(song);
    }

    public MyIterator<Song> iterator(){
        return new PlaylistIterator();
    }

    private class PlaylistIterator implements MyIterator<Song>{

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index<songs.size();
        }

        @Override
        public Song next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException(
                        "No more songs"
                );
            }
            return songs.get(index++);
        }
    }
}
