package geekbrains.homework.java2.lesson1;

import java.awt.*;

public class Background {

    private int sleepTurn = 0;
    private Color color = new Color((int)(Math.random() * 255),
                                    (int)(Math.random() * 255),
                                    (int)(Math.random() * 255));

     Background(){
    }

    void update(float deltaTime,Sprite [] sprites){
         if (sleepTurn == 60) {
             color = new Color((int) (Math.random() * (deltaTime * 10000)),
                     (int) (Math.random() * (deltaTime * 10000)),
                     (int) (Math.random() * (deltaTime * 10000)));
         }
    }

    void render(GameCanvas canvas){
         if (sleepTurn == 60){
             canvas.setBackground(color);
             sleepTurn = 0;
         }else sleepTurn++;
    }
}
