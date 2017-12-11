package Polymorphism;

import javax.swing.*;
import java.awt.*;

public class ShapeFrame extends JFrame {
    public ShapeFrame() {
        setLayout(new GridLayout(2, 3));

        add(new Circle());
        add(new Rectangle());
        add(new Triangle());
        add(new Triangle());
        add(new Circle());
        add(new Rectangle());


        setBounds(200, 200, 450, 350);
    }
}
