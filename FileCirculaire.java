package TP2;



public class FileCirculaire implements IFileBornee{
    protected double[] donnees;
    protected int head;
    protected int tail;
    protected int nbrElem;
    public FileCirculaire(int tailleMax) {
        this.donnees = new double[tailleMax];
        this.head = 0;
        this.tail = 0;
        this.nbrElem = 0;
    }



    @Override
    public boolean add(double a ) {
        if (this.isFull()) {
            return false;
        }
        this.donnees[this.tail] = a;
        this.tail = (this.tail % this.capacity()) + 1;
        this.nbrElem ++;
        return true;
    }

    @Override
    public boolean remove() {
        if (this.isEmpty()) {
            return false;
        }
        this.head = (this.head % this.capacity()) + 1;
        this.nbrElem --;
        return true;
    }

    @Override
    public boolean isEmpty() {
        if (nbrElem == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int size() {
        return this.nbrElem;
    }

    @Override
    public double get() {
        assert !this.isEmpty() : "pile vide";
        return this.donnees[this.head];
    }

    @Override
    public boolean isFull() {
        if (this.nbrElem >= this.capacity()) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public int capacity() {
        return this.donnees.length;
    }

    public boolean equals(Object o) {
        if (!(o instanceof FileCirculaire)) {
            return false;
        }
        FileCirculaire g = (FileCirculaire) o;
        int compteur = 0;
        if (this.size() == g.size()) {
            for (int i = 0; i < nbrElem; i++) {
                if (this.donnees[(this.head + i)% this.capacity()] == g.donnees[(g.head + i)%this.capacity()]) {
                    compteur ++;
                }
            }
        }
        return (compteur == nbrElem);
    }

    public String toString() {
        String message = "[";
        if (this.size() >= 1) {
            message += this.donnees[this.head] ;
        }
        int i = 1;
        while( i < nbrElem) {
            message += ", " + this.donnees[(this.head + i)] ;
            i++;
        }
        return message + "]";
    }
}
