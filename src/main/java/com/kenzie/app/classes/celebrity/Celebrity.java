package com.kenzie.app.classes.celebrity;

public class Celebrity {

    protected String filmGuildName;
    protected int age;

    // preview pane
    protected String[] episodes = new String[3];

    public Celebrity() {

    }

    public Celebrity(String filmGuildName) {
        this.filmGuildName = filmGuildName;
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
