package geekbrains.homework.java2.lesson1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

// user input, update, render
public class GameCanvas extends JPanel {

    private final MainCircles gameController;
    private long lastFrameTime;

    public GameCanvas(MainCircles gameController) {
        this.gameController = gameController;
        lastFrameTime = System.nanoTime();
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                addBall();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        long currentTime = System.nanoTime();
        float deltaTime = (currentTime - lastFrameTime) * 0.000000001f;
        lastFrameTime = currentTime;
        gameController.onDrawFrame(this, g, deltaTime);
        try {
            Thread.sleep(16);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        repaint();
    }


    private void addBall() {
        Sprite[] spritesClone = Arrays.copyOf(gameController.sprites, gameController.sprites.length);
        gameController.sprites = new Sprite[spritesClone.length + 1];
        System.arraycopy(spritesClone, 0, gameController.sprites, 0, spritesClone.length);
        gameController.sprites[spritesClone.length] = new Ball();
    }


    public int getLeft() {
        return 0;
    }

    public int getRight() {
        return getWidth() - 1;
    }

    public int getTop() {
        return 0;
    }

    public int getBottom() {
        return getHeight() - 1;
    }
}
