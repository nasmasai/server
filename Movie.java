package com.server.demo.Models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "movie_name")
    private String movieName;

    @Column(name = "sub_category")
    private String subCategory;

    @Column(name = "duration")
    private int duration;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToMany (mappedBy = "movies")
    private Set<User> clients = new HashSet<>();

    public Movie(String movieName, int duration,Category category) {
        this.movieName = movieName;
        this.category = category;
        this.duration = duration;
    }

    public Movie() {
    }

    public Set<User> getClients() {
        return clients;
    }

    public void setClients(Set<User> clients) {
        this.clients = clients;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", movieName='" + movieName + '\'' +
                ", subCategory='" + subCategory + '\'' +
                ", category=" + category +
                ", duration=" + duration +
                ", client=" + clients +
                '}';
    }
}

