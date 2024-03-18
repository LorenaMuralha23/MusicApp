package com.kingcode.entities;

public class Playlist {

    private Integer id;
    private String title;
    private String image;

    public Playlist() {
    }

    public Playlist(Integer id, String title, String image) {
        this.id = id;
        this.title = title;
        this.image = image;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


}
