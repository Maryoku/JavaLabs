package BattleShip;

import java.awt.*;

public class Shot {
    private int x, y;
    private boolean shot;

    public Shot(int x, int y, boolean shot) {
        this.x = x;
        this.y = y;
        this.shot = shot;
    }

    int getX() { return x; }
    int getY() { return y; }
    boolean isShot() { return shot; }

    void paintShot(Graphics g, int cellSize) {
        g.setColor(Color.gray);
        if(shot) {
            g.fillRect(x * cellSize + cellSize/2 - 3, y * cellSize + cellSize/2 - 3, 8, 8);
        }
        else {
            g.drawRect(x * cellSize + cellSize/2 - 3, y * cellSize + cellSize/2 - 3, 8, 8);
        }
    }
}
