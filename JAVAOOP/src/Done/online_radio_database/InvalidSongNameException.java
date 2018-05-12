package online_radio_database;

public class InvalidSongNameException extends InvalidSongException {

    private static final String MESSAGE = "Song name should be between 3 and 30 symbols.";

    public InvalidSongNameException() {
        super(MESSAGE);
    }
}