package BattleShip;

import java.awt.*;

public class Cell {
    private final Color RED = Color.red;
    private int x, y;
    private Color color;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
        this.color = Color.gray;
    }

    int getX() { return x; }
    int getY() { return y; }

    boolean checkHit(int x, int y) {
        if (this.x == x && this.y == y) {
            color = RED;
            return true;
        }
        return false;
    }

    boolean isAlive() {
        return color != RED;
    }

    void paint(Graphics g, int cellSize, boolean hide) {
        if (!hide || (hide && color == RED)) {
            g.setColor(color);
            g.fill3DRect(x * cellSize + 1, y * cellSize + 1,
                    cellSize - 2, cellSize - 2, true);
        }
    }
}
