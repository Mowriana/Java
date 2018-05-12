package online_radio_database;


class SongFactory {

    private static final int IND_ARTIST = 0;
    private static final int IND_NAME = 1;
    private static final int IND_LENGTH = 2;
    private static final int IND_MINUTES = 0;
    private static final int IND_SECONDS = 1;

    private static final String DELIMITER_LENGTH = ":";

    Song createSong(String[] songData) throws InvalidSongException {

        if (songData.length != 3) {

            throw new InvalidSongException();
        }

        String artist = songData[IND_ARTIST];
        String name = songData[IND_NAME];

        String[] lengthTokens = songData[IND_LENGTH].split(DELIMITER_LENGTH);

        if (lengthTokens.length != 2) {

            throw new InvalidSongLengthException();
        }

        long minutes;
        long seconds;

        try {

            minutes = Long.valueOf(lengthTokens[IND_MINUTES]);
            seconds = Long.valueOf(lengthTokens[IND_SECONDS]);

        } catch (NumberFormatException nfe) {

            throw new InvalidSongLengthException();
        }

        return new Song(artist, name, minutes, seconds);
    }
}