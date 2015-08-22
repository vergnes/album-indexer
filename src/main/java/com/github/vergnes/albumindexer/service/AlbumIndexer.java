package com.github.vergnes.albumindexer.service;

import com.github.vergnes.albumindexer.domain.Album;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.invoke.MethodHandles;
import java.util.function.Consumer;

/**
 * Created by denis.vergnes on 22/08/2015.
 */
@Component
public class AlbumIndexer implements Consumer<Album> {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Override
    public void accept(Album album) {
        LOGGER.info("New album to index: {}", album);
    }
}