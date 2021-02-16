package TP3;

import java.awt.*;

public class Rectangle {
    protected Point topLeft; //haut gauche
    protected Point botRight; // bas droite
    public Rectangle(Point p1, Point p2) {
        this.botRight = new Point(p2);
        this.topLeft = new Point(p1);
    }

    public void translate(int x, int y) {
        this.botRight.translate(x,y);
        this.topLeft.translate(x,y);
    }

    public Point getBotRight() {
        return this.botRight;
    }

    public Point getTopLeft() {
        return this.topLeft;
    }

    public String toString() {
        return ("[" + this.botRight.toString() + " ," + this.topLeft.toString() + "]");
    }

    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (!(o instanceof Rectangle)) {
            return false;
        }
        Rectangle r = (Rectangle) o;
        return (this.topLeft.equals(r.topLeft) && this.botRight.equals(r.botRight) || this.topLeft.equals(r.botRight) && this.botRight.equals(r.topLeft));
    }
}
