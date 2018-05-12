package online_radio_database;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final String DELIMITER_SONG_DATA = ";";

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int songsCount;

        try {
            songsCount = Integer.valueOf(reader.readLine());
        } catch (NumberFormatException nfe) {
            songsCount = 0;
        }

        SongFactory songFactory = new SongFactory();
        PlayList playList = new PlayList();
        StringBuilder output = new StringBuilder();

        while (songsCount-- > 0) {
            String[] songData = reader.readLine().split(DELIMITER_SONG_DATA);

            try {

                Song song = songFactory.createSong(songData);

                output.append(playList.addSong(song)).append(System.lineSeparator());

            } catch (InvalidSongException ise) {

                output.append(ise.getMessage()).append(System.lineSeparator());
            }
        }

        output.append(playList.getSongsAdded())
                .append(System.lineSeparator())
                .append(playList);

        System.out.println(output);
    }
}