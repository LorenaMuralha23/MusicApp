package com.kingcode.demo.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "tb_single")
public class Single implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String image;
    private Date releaseData;

    public Single() {
    }

    public Single(Integer id, String title, String image, Date releaseData) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.releaseData = releaseData;
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

    public Date getReleaseData() {
        return releaseData;
    }

    public void setReleaseData(Date releaseData) {
        this.releaseData = releaseData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Single single = (Single) o;
        return Objects.equals(id, single.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

