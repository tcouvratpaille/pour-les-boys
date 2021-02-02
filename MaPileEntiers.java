package TP1;

public class MaPileEntiers implements IPileEntiers {
    private int taille;
    private int[] pile;

    public MaPileEntiers(int tailleMax) {
        this.pile = new int[tailleMax];
        this.taille = 0;
    }

    public boolean add(int val) {
        if (this.taille < this.pile.length) {
            this.pile[this.taille] = val;
            this.taille ++;
            return true;
        } else {
            return false;
        }
    }

    public boolean remove() {
        if (this.taille > 0) {
            this.taille --;
            return true;
        } else {
            return false;
        }
    }

    public int get() {
        assert this.taille > 0 : "Pile vide, get() impossible";

        return this.pile[this.taille - 1];
    }

    public int size() {
        return this.taille;
    }

    public int capacity() {
        return this.pile.length;
    }

    public boolean isFull() {
        return this.taille == this.pile.length;
    }

    public boolean isEmpty() {
        return this.taille == 0;
    }
    
    public String toString() { 
    	String message = "[";
    	if (this.taille >= 1) {
    		message += this.pile[0] ;
    	}
    	for (int i = 1; i < this.taille; i ++) {
    		message = message + ", " + this.pile[i] + "";
    	}
    	message += "]";
    	return message;
    }
    
    public boolean equals(MaPileEntiers test) {
    	if (test != (MaPileEntiers) test) {
            return false;
        } else if (this.taille != test.taille) {
            return false;
        } else {
            int compteur = 0;

            for(int i = 0; i < this.taille; ++i) {
                if (this.pile[i] == test.pile[i]) {
                    ++compteur;
                }
            }
            if (compteur >= this.taille) {
                return true;
            } else {
                return false;
            }
        }
    }
}
