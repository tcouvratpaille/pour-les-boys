package TP1;

import java.util.ArrayList;

public class MySet {
    protected ArrayList<Double> ensembleDeFloat; //on l'initialise a un pointeur a NULL
    public MySet() {
        this.ensembleDeFloat = new ArrayList<Double>();
    }
    public MySet(MySet m) {
        this.ensembleDeFloat = new ArrayList<Double>();
        for (int i = 0; i < m.ensembleDeFloat.size(); i++) {
            this.ensembleDeFloat.add(m.ensembleDeFloat.get(i));
        }
    }
    public boolean add(double e) {
        if (this.contains(e)) {
            return false;
        }
        return this.ensembleDeFloat.add(e);
    }

    public int size() {
        return this.ensembleDeFloat.size();
    }

    public boolean isEmpty() {
        return this.ensembleDeFloat.size() == 0;
    }

    public boolean remove(double e) {
        return this.ensembleDeFloat.remove(e);
    }

    public boolean contains(double a) {
        return this.ensembleDeFloat.contains(a);
    }

    public String toString() {
        return this.ensembleDeFloat.toString();
    }

    public void clear() {
        this.ensembleDeFloat.clear();
    }

    public int getRandomInt(int max) {
        return (int)Math.floor(Math.random() * Math.floor((double)max));
    }

    public double random() {
        assert !this.isEmpty() : "pile vide";
        return this.ensembleDeFloat.get(this.getRandomInt(this.ensembleDeFloat.size()));
    }

    public boolean equals(MySet test) {
        if (test == null) {
            return false;
        }
        if (this.ensembleDeFloat.size() != test.ensembleDeFloat.size()) {
            return false;
        } else {
            int compteur = 0;
            for(int i = 0; i < this.ensembleDeFloat.size(); ++i) {
                if (this.ensembleDeFloat.contains(test.ensembleDeFloat.get(i))) {
                    ++compteur;
                }
            }
            if (compteur >= this.ensembleDeFloat.size()) {
                return true;
            } else {
                return false;
            }
        }
    }
}
