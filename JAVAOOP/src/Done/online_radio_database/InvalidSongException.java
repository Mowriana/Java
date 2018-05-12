package online_radio_database;

public class InvalidSongException extends Exception {

    private static final String MESSAGE = "Invalid song.";

    public InvalidSongException() {

        super(MESSAGE);
    }

    public InvalidSongException(String message) {

        super(message);
    }
}