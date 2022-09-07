package com.kenzie.app.datastructures;

import java.util.ArrayList;
import java.util.HashMap;

public class PlaylistGenreSorter {
    // A have a bunch of playlists
    // I want to sort these by genre
    // (rock, indie, r&b, pop punk, rap, country)

    public static ArrayList<String> makeGenres() {
        // Some sort of data structure
        // That can hold these six genres
        // StructureClass<Type> name = new StructureClass<Type>();

        ArrayList<String> genreNames = new ArrayList<>();
        genreNames.add("rock");
        genreNames.add("alt rock");
        genreNames.add("indie");
        genreNames.add("r&b");
        genreNames.add("pop punk");
        genreNames.add("rap");
        genreNames.add("country");

        return genreNames;
    }

    // changing this method to produce data
    public static HashMap<Integer, String> labelPlaylists() {
        // A playlist has a ID 879678
        // A playlist has a genre (that's one of the ones above)

        // key       value
        // 879678 -> r&b
        // 898978 -> country
        // 2343 -> rock

        // you need the associated address that comes
        // from a reference variable
        // ALSO need the hashcode
        HashMap<Integer, String> labelPlaylistMap = new HashMap<>();
        labelPlaylistMap.put(987686, "country");
        labelPlaylistMap.put(908978, "rap");
        labelPlaylistMap.put(654342, "indie");
        labelPlaylistMap.put(120939, "rock");

        return labelPlaylistMap;
    }
}
