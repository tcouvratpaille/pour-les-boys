package TP3;

import java.awt.*;

public class ColoredRectangle extends Rectangle implements Comparable<ColoredRectangle>{
    protected Color couleur;
    public ColoredRectangle(Point p1, Point p2, Color c) {
        super(p1, p2);
        this.couleur = c;
    }

    public double getSurface() {
        return ( (this.topLeft.getY() - this.botRight.getY()) * (this.botRight.getX() - this.topLeft.getX()) );
    }
    @Override
    //si le rectangle a un plus grande surface que celle du rectangle en parametre, return > 0;
    //sinon return > 0 ou 0 si les deux ont la meme surface
    public int compareTo(ColoredRectangle r) {
        if (this.getSurface() < r.getSurface()) {
            return -1;
        } else if (this.getSurface() > r.getSurface()) {
            return 1;
        }
        return 0;
    }
}
