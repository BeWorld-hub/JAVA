package com.streamvoice;

import com.streamvoice.Song;

public class SearchSongLogic extends Song {
    public Song searchSong(String infoAboutSong) {
        Song song = new Song();

        if (song.author.equals(infoAboutSong) || song.nameSong.equals(infoAboutSong)) {
            return song;
        }

        return new Song();
    }
}
