package geekbrains.homework.java2.lesson1;

import java.awt.*;

public class Background {

    private int x = 0;
    private int y = 0;
    private int z = 0;
    private float vx = (int) ((Math.random() * 200));
    private float vy = (int) ((Math.random() * 200));
    private float vz = (int) ((Math.random() * 200));
    private Color color = new Color(0,0,0);

    Background() {
    }

    void update(float deltaTime, Sprite[] sprites) {
        if ((x + vx * deltaTime) > 255 || (x + vx * deltaTime) < 0) vx = -vx;
        if ((y + vy * deltaTime) > 255 || (y + vy * deltaTime) < 0) vy = -vy;
        if ((z + vz * deltaTime) > 255 || (z + vz * deltaTime) < 0) vz = -vz;
        x += vx * deltaTime;
        y += vy * deltaTime;
        z += vz * deltaTime;
        color = new Color(x, y, z);
    }

    void render(GameCanvas canvas) {
        canvas.setBackground(color);
    }
}
