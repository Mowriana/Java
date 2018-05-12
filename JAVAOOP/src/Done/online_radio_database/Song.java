package online_radio_database;


class Song {

    private static final int MIN_LENGTH_NAME = 3;

    private static final int MAX_LENGTH_ARTIST_NAME = 20;
    private static final int MAX_LENGTH_SONG_NAME = 30;

    private static final long MIN_SONG_MINUTES = 0;
    private static final long MAX_SONG_MINUTES = 14;

    private static final long MIN_SONG_SECONDS = 0;
    private static final long MAX_SONG_SECONDS = 59;

    private String artistName;
    private String name;
    private long lengthInSeconds;

    Song(String artistName, String name, long minutes, long seconds) throws InvalidSongException {

        this.setArtistName(artistName);
        this.setName(name);
        this.setLengthInSeconds(minutes, seconds);
    }

    long getLengthInSeconds() {

        return this.lengthInSeconds;
    }

    private void setArtistName(String artistName) throws InvalidArtistNameException {
        artistName = artistName.trim();

        if (artistName.length() < MIN_LENGTH_NAME
                || artistName.length() > MAX_LENGTH_ARTIST_NAME) {

            throw new InvalidArtistNameException();
        }

        this.artistName = artistName;
    }

    private void setName(String name) throws InvalidSongNameException {

        if (name.length() < MIN_LENGTH_NAME
                || name.length() > MAX_LENGTH_SONG_NAME) {

            throw new InvalidSongNameException();
        }


        this.name = name;
    }

    private void setLengthInSeconds(long minutes, long seconds) throws InvalidSongLengthException {

        if (minutes < MIN_SONG_MINUTES || minutes > MAX_SONG_MINUTES) {

            throw new InvalidSongMinutesException();
        }

        if (seconds < MIN_SONG_SECONDS || seconds > MAX_SONG_SECONDS) {

            throw new InvalidSongSecondsException();
        }

        this.lengthInSeconds = seconds + (minutes * 60);
    }
}