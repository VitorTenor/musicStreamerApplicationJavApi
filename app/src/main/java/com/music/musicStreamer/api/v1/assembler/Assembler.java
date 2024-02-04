package com.music.musicStreamer.api.v1.assembler;

/**
 * Interface to facilitate the conversion of {@code entities} to {@code DTOs/Output}.
 */
public interface Assembler<E, O> {
    O toOutput(E entity);
}
