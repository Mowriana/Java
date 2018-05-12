package online_radio_database;

public class InvalidSongLengthException extends InvalidSongException {

    private static final String MESSAGE = "Invalid song length.";

    public InvalidSongLengthException(String message) {

        super(message);
    }

    public InvalidSongLengthException() {

        super(MESSAGE);
    }
}