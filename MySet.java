package TP1;

import java.util.ArrayList;

public class MySet {
    protected ArrayList<Double> ensembleDeFloat; //on l'initialise a un pointeur a NULL
    public MySet() {
        this.ensembleDeFloat = new ArrayList<Double>();
    }

    public boolean add(double e) {
        return this.ensembleDeFloat.add(e);
    }

    public int size() {
        return this.ensembleDeFloat.size() ;
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
    	String message = "[";
    	if (this.ensembleDeFloat.size() >= 1) {
    		message += this.ensembleDeFloat.get(0);
    	}
    	for (int i = 1; i < this.ensembleDeFloat.size() ; i ++) {
    		message = message + ", " + this.ensembleDeFloat.get(i) + "";
    	}
    	message += "]";
    	return message;
    }

    public void clear() {
        this.ensembleDeFloat.clear();
    }

    public int getRandomInt(int max) {
        return (int)Math.floor(Math.random() * Math.floor((double)max));
    }

    public double random() {
        return this.ensembleDeFloat.get(this.getRandomInt(this.ensembleDeFloat.size() - 1));
    }

    public boolean equals(MySet test) {
        if (test != (MySet) test) {
            return false;
        } else if (this.ensembleDeFloat.size() != test.ensembleDeFloat.size()) {
        	return false;
        } else {
            int compteur = 0;

            for(int i = 0; i < this.ensembleDeFloat.size(); ++i) {
                if (this.ensembleDeFloat.get(i) == test.ensembleDeFloat.get(i)) {
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
