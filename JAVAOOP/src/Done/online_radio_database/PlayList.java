package online_radio_database;

import java.util.ArrayList;
import java.util.List;

class PlayList {

    private static final String MSG_SONG_ADDED = "Song added.";

    private static final int SECONDS_IN_HOUR = 3600;
    private static final int SECONDS_IN_MINUTE = 60;

    List<Song> songs;

    PlayList() {

        this.songs = new ArrayList<>();
    }

    String getSongsAdded() {
        return "Songs added: " + this.songs.size();
    }

    String addSong(Song song) {

        this.songs.add(song);

        return MSG_SONG_ADDED;
    }

    private String calcLengthValue() {

        long totalSeconds = this.songs.stream().mapToLong(Song::getLengthInSeconds).sum();

        long hours =  totalSeconds / SECONDS_IN_HOUR;
        long minutes = (totalSeconds % SECONDS_IN_HOUR) / SECONDS_IN_MINUTE;
        long seconds = totalSeconds % SECONDS_IN_MINUTE;

        return String.format("%sh %sm %ss", hours, minutes, seconds);
    }

    @Override
    public String toString() {
        return "Playlist length: ".concat(this.calcLengthValue());
    }
}