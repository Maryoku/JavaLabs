package BattleShip;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Ships {
    private final int CELL_SIZE;
    private ArrayList<Ship> ships = new ArrayList<Ship>();
    private final int[] PATTERN = {4, 3, 3, 2, 2, 2, 1, 1, 1, 1};
    private Random rand;
    private boolean hide;

    public Ships(int fieldSize, int cellSize, boolean hide) {
        rand = new Random();
        for (int i = 0; i < PATTERN.length; i++) {
            Ship ship;
            do {
                int x = rand.nextInt(fieldSize);
                int y = rand.nextInt(fieldSize);
                int position = rand.nextInt(2);
                ship = new Ship(x, y, PATTERN[i], position);
            } while (ship.isOutOfField(0, fieldSize - 1) || isOverlayOrTouch(ship));
            ships.add(ship);
        }
        CELL_SIZE = cellSize;
        this.hide = hide;
    }

    boolean isOverlayOrTouch(Ship controlShip) {
        for (Ship ship : ships) {
            if (ship.isOverlayOrTouch(controlShip))
                return true;
        }
        return false;
    }

    boolean checkHit(int x, int y) {
        for (Ship ship : ships) {
            if (ship.checkHit(x, y))
                return true;
        }
        return false;
    }

    boolean checkSurvivors() {
        for (Ship ship : ships) {
            if (ship.isAlive())
                return true;
        }
        return false;
    }

    void paint(Graphics g) {
        for (Ship ship : ships) {
            ship.paint(g, CELL_SIZE, hide);
        }
    }
}
