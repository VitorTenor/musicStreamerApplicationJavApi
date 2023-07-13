package com.music.musicStreamer.core.utils.factories;

import com.music.musicStreamer.api.v1.models.PlaylistModel;
import com.music.musicStreamer.api.v1.models.PlaylistMusicModel;
import com.music.musicStreamer.entities.playlist.MusicPlaylistRequest;
import com.music.musicStreamer.entities.playlist.Playlist;
import com.music.musicStreamer.entities.playlist.PlaylistRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@RequiredArgsConstructor
public class PlaylistFactory {

    public Playlist createPlaylist(PlaylistModel playlistModel) {
        return new Playlist(playlistModel.getName(), playlistModel.getUserId(), playlistModel.getId());
    }

    public PlaylistModel createPlaylistModel(PlaylistRequest playlistRequest) {
        return new PlaylistModel(playlistRequest.getName(), playlistRequest.getUserId(), new Date(), new Date());
    }

    public PlaylistMusicModel createPlaylistMusicModel(MusicPlaylistRequest musicPlaylistRequest) {
        return new PlaylistMusicModel(musicPlaylistRequest.getPlaylistId(), musicPlaylistRequest.getUserId(), musicPlaylistRequest.getMusicId(), new Date(), new Date());
    }

}