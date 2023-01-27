package com.music.musicStreamer.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Setter
@Getter
@Table(name = "musics")
public class MusicModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, length = 100)
    private String artist;

    @Column(nullable = false, length = 100)
    private String album;

    @Column(nullable = false, length = 100)
    private String genre;

    @Column(nullable = false, length = 100)
    private String path_name;

    @Column(nullable = false, length = 100)
    private Date created_at;

    @Column(nullable = false, length = 100)
    private Date updated_at;

}
