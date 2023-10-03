package com.music.musicStreamer.core.util.validator;

import com.music.musicStreamer.api.v1.model.MusicModel;
import com.music.musicStreamer.api.v1.repository.MusicRepository;
import com.music.musicStreamer.entity.music.MusicRequest;
import com.music.musicStreamer.enums.MusicMessages;
import com.music.musicStreamer.exception.MusicException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MusicValidator {

    private final MusicRepository musicRepository;

    public void validateMusic(MusicRequest musicRequest) {
        if (musicRequest.getName().isBlank()) throw new MusicException(MusicMessages.NAME_REQUIRED);
        if (musicRequest.getArtist().isBlank()) throw new MusicException(MusicMessages.ARTIST_REQUIRED);
        if (musicRequest.getAlbum().isBlank()) throw new MusicException(MusicMessages.ALBUM_REQUIRED);
        if (musicRequest.getGenre().isBlank()) throw new MusicException(MusicMessages.GENRE_REQUIRED);
        if (musicRequest.getMusic().length == 0 || musicRequest.getMusic() == null) throw new MusicException(MusicMessages.MUSIC_REQUIRED);
    }

    public void validateIfMusicIsNotNull(MusicModel musicModel) {
        if (musicModel == null) throw new MusicException(MusicMessages.NOT_FOUND);
    }

    public void validateIfExistById(int id) {
        if (!musicRepository.existsById(id)) throw new MusicException(MusicMessages.NOT_FOUND);
    }
}