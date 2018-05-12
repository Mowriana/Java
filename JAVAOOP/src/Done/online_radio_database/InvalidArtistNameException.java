package online_radio_database;

public class InvalidArtistNameException extends InvalidSongException {

    private static final String MESSAGE = "Artist name should be between 3 and 20 symbols.";

    public InvalidArtistNameException() {

        super(MESSAGE);
    }
}