package com.kenzie.app.classes.celebrity;

public class Celebrity {
    // if it's final, maybe don't need to
    // unless you want to hide the data
    // static getter, nonstatic getter on the same data
    static final boolean IS_FAMOUS = true;

    boolean isRich = true;
    protected String filmGuildName;
    protected final int birthday;

    // preview pane
    protected String[] episodes = new String[3];

    public Celebrity(String filmGuildName, int birthday) {
        this.filmGuildName = filmGuildName;
        this.birthday = birthday;
    }

    public String getFilmGuildName() {
        return filmGuildName;
    }

    public void setFilmGuildName(String filmGuildName) {
        this.filmGuildName = filmGuildName;
    }

    public void addEpisode(String show) {
        for(int i = 0; i < this.episodes.length; i++) {
            if(this.episodes[i] == null) {
                this.episodes[i] = show;
                break;
            }
        }
    }

    public String[] getTop3Episodes() {
        return this.episodes;
    }
}
