package com.kenzie.app.classes.celebrity;

import java.util.HashMap;

public class HoD {

    // Birds eye view of stuff
    static final String NAME = "House of the Dragon";

    // Episode 1 ... 11
    String episode1 = "S1E1";
    String episode2 = "S1.E2";
    String episode3 = "S1.E3564";
    String episode4 = "S1.E8";
    String episode5 = "S1.e5";

    HashMap<EpisodeList, String> videoFile = new HashMap<>() {{
        videoFile.put(EpisodeList.S1E1, "087968tgl.mp4");
    }};


    public enum EpisodeList {
        S1E1,
        S2E2,
        S3E3
    }

    public static void main(String[] arg) {

    }















}

