package com.kenzie.app;

import com.kenzie.app.datastructures.PlaylistGenreSorter;
import org.junit.jupiter.api.Test;

import java.util.*;

import static com.kenzie.app.datastructures.PlaylistGenreSorter.labelPlaylists;
import static com.kenzie.app.datastructures.PlaylistGenreSorter.makeGenres;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class PlaylistGenreSorterTest {

    @Test
    public void makeGenresTest() {
        // I need 6 very specific strings inside of
        // From the genre list that I am making

        ArrayList<String> actual = PlaylistGenreSorter.makeGenres();
    }

    @Test
    public void labelPlaylistTest() {
        // Arrange
        ArrayList<String> genreNames = new ArrayList<>();
        genreNames.add("rock");
        genreNames.add("indie");
        genreNames.add("pop punk");
        genreNames.add("rap");
        genreNames.add("alt rock");
        genreNames.add("country");
        genreNames.add("r&b");

        // Act(ual) LOL doing the thing
        HashMap<Integer, String> actual = labelPlaylists();
        // rock
        // rock
        // r&b
        // country
        // indie rock

        // Hash______ all of the entries unique
        HashSet<String> genreWeFound = new HashSet<>();

        for(Map.Entry<Integer, String> playlistEntry : actual.entrySet()) {
            int id = playlistEntry.getKey();
            String genre = playlistEntry.getValue();

            genreWeFound.add(genre);
        }

        // Assert

        // key       value
        // Integer   String
        // 879678 -> r&b


        for(String desiredGenre : genreNames) {
            if(!genreWeFound.contains(desiredGenre)) {
               assert(false);
            }
        }
    }

    @Test
    public void testKeys() {
        // cute little test down here
    }
}
