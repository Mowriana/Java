package online_radio_database;

public class InvalidSongMinutesException extends InvalidSongLengthException {

    private static final String MESSAGE = "Song minutes should be between 0 and 14.";

    public InvalidSongMinutesException() {

        super(MESSAGE);
    }
}