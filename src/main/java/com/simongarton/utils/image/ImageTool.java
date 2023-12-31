package com.simongarton.utils.image;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.file.Path;

import static java.awt.image.BufferedImage.TYPE_INT_RGB;

/*
 ImageTool

 Simple encapsulation of the AWT BufferedImage / Graphics2D stuff, just a quick way of adding image
 functionality to anything.

 Simon Garton
 simon.garton@gmail.com
 simongarton.com
 January 2024

 */


public class ImageTool {

    private static final String PNG = "PNG";
    private final BufferedImage bufferedImage;
    private final Graphics2D graphics2D;
    private final int width;
    private final int height;

    public ImageTool(final int width, final int height) {
        this.width = width;
        this.height = height;
        this.bufferedImage = new BufferedImage(width, height, TYPE_INT_RGB);
        this.graphics2D = this.bufferedImage.createGraphics();
    }

    public Path save(final Path path) {
        try {
            ImageIO.write(this.bufferedImage, PNG, path.toFile());
            this.graphics2D.dispose();
            return path;
        } catch (final IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void clear() {
        this.clear(Color.BLACK);
    }

    public void clear(final Color color) {
        this.graphics2D.setPaint(color);
        this.graphics2D.fillRect(0, 0, this.width, this.height);
    }

    public Color setColor(final Color color) {
        this.graphics2D.setColor(color);
        return this.getColor();
    }

    public Color getColor() {
        return this.graphics2D.getColor();
    }

    public void drawRect(final int x, final int y, final int width, final int height) {
        this.graphics2D.drawRect(x, y, width, height);
    }

    public void fillRect(final int x, final int y, final int width, final int height) {
        this.graphics2D.fillRect(x, y, width, height);
    }

    public void drawRoundRect(final int x, final int y, final int width, final int height, final int arcWidth, final int arcHeight) {
        this.graphics2D.drawRoundRect(x, y, width, height, arcWidth, arcHeight);
    }

    public void fillRoundRect(final int x, final int y, final int width, final int height, final int arcWidth, final int arcHeight) {
        this.graphics2D.fillRoundRect(x, y, width, height, arcWidth, arcHeight);
    }

    public void drawLine(final int x1, final int y1, final int x2, final int y2) {
        this.graphics2D.drawLine(x1, y1, x2, y2);
    }

    public void drawPolygon(final int[] xPoints, final int[] yPoints, final int nPoints) {
        this.graphics2D.drawPolygon(xPoints, yPoints, nPoints);
    }

    public void fillPolygon(final int[] xPoints, final int[] yPoints, final int nPoints) {
        this.graphics2D.fillPolygon(xPoints, yPoints, nPoints);
    }

    public void drawOval(final int x, final int y, final int width, final int height) {
        this.graphics2D.drawOval(x, y, width, height);
    }

    public void fillOval(final int x, final int y, final int width, final int height) {
        this.graphics2D.fillOval(x, y, width, height);
    }
}
