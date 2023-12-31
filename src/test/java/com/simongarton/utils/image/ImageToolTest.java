package com.simongarton.utils.image;

import org.junit.jupiter.api.Test;

import java.awt.*;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ImageToolTest {

    @Test
    void clear() {

        // given
        final ImageTool imageTool = new ImageTool(300, 200);
        final Path path = Path.of("temp", "300x200-black.png");

        // when
        imageTool.clear();
        final Path result = imageTool.save(path);

        // then
        assertNotNull(result);
    }


    @Test
    void clearWithColor() {

        // given
        final ImageTool imageTool = new ImageTool(100, 200);
        final Path path = Path.of("temp", "100x200-red.png");

        // when
        imageTool.clear(Color.RED);
        final Path result = imageTool.save(path);

        // then
        assertNotNull(result);
    }
}