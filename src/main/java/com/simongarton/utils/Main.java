package com.simongarton.utils;

import com.simongarton.utils.image.ImageTool;

import java.awt.*;
import java.nio.file.Path;
import java.util.Random;

public class Main {

    private final Random random;

    public Main() {
        this.random = new Random();
    }

    public static void main(final String[] args) {

        final Main main = new Main();
        main.simpleExample();
        main.complexExample();
    }

    private void simpleExample() {

        final ImageTool imageTool = new ImageTool(800, 800);
        imageTool.setColor(new Color(200, 100, 50));
        imageTool.fillOval(400, 400, 200, 200);
        imageTool.setColor(new Color(100, 50, 25));
        imageTool.fillOval(400, 400, 200, 200);
        imageTool.save(Path.of("temp", "circle.png"));
    }

    private void complexExample() {

        final ImageTool imageTool = new ImageTool(800, 800);

        imageTool.setColor(this.randomColor());
        imageTool.drawLine(this.randomN(), this.randomN(), this.randomN(), this.randomN());

        imageTool.setColor(this.randomColor());
        imageTool.drawRect(this.randomN(), this.randomN(), this.randomN(), this.randomN());

        imageTool.setColor(this.randomColor());
        imageTool.fillRect(this.randomN(), this.randomN(), this.randomN(), this.randomN());

        imageTool.setColor(this.randomColor());
        imageTool.drawRoundRect(this.randomN(), this.randomN(), this.randomN(), this.randomN(), this.randomN(), this.randomN());

        imageTool.setColor(this.randomColor());
        imageTool.fillRoundRect(this.randomN(), this.randomN(), this.randomN(), this.randomN(), this.randomN(), this.randomN());

        imageTool.setColor(this.randomColor());
        imageTool.drawOval(this.randomN(), this.randomN(), this.randomN(), this.randomN());

        imageTool.setColor(this.randomColor());
        imageTool.fillOval(this.randomN(), this.randomN(), this.randomN(), this.randomN());

        final int[] xs = new int[]{this.randomN(), this.randomN(), this.randomN()};
        final int[] ys = new int[]{this.randomN(), this.randomN(), this.randomN()};

        imageTool.setColor(this.randomColor());
        imageTool.fillPolygon(xs, ys, 3);
        imageTool.setColor(this.randomColor());
        imageTool.drawPolygon(xs, ys, 3);

        imageTool.save(Path.of("temp", "complex.png"));

    }

    private Color randomColor() {
        return new Color(this.random.nextInt(255), this.random.nextInt(255), this.random.nextInt(255));
    }


    private int randomN() {
        return this.random.nextInt(800);
    }
}