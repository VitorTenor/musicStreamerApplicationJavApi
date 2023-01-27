package com.music.musicStreamer.models.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlaylistDTO {
    private int id;
    private int userId;
    private String name;
}
