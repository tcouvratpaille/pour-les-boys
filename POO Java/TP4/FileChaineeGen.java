package TP4;

import TP2.FileArrayList;

public class FileChaineeGen<E> implements IFileGen<E> {
    private class Cellule {
        E valeur;
        Cellule suivant;
        // construteur de la cellule
        Cellule(E e) {
            valeur = e;
            suivant = null;
        }
    }
    //attributs de la file chainée
    Cellule premier;
    Cellule dernier;
    int taille;
    //constructeur
    public FileChaineeGen() {
        this.taille = 0;
        this.premier = null;
        this.dernier = null;
    }


    @Override
    public boolean add(E e) {
        Cellule tete = new Cellule(e);
        if (this.taille == 0) { //on initialise le premier et dernier element a la cellule;
            this.premier = tete;
            this.dernier = tete;
        } else {
            this.dernier.suivant = tete;
            this.dernier = tete;
        }
        this.taille++;
        return true;
    }

    @Override
    public boolean remove() {
        assert (this.taille > 0) : "pile vide, error remove";
        if (this.taille == 1) {
            this.premier = null;
            this.dernier = null;
            this.taille = 0;
        } else {
            this.premier = this.premier.suivant;
            this.taille--;
        }
        return true;
    }

    @Override
    public boolean isEmpty() {
        return (this.taille == 0);
    }

    @Override
    public int size() {
        return (this.taille);
    }

    @Override
    public E get() {
        assert (!this.isEmpty()) : "pile vide, erreur get";
        return (this.premier.valeur);
    }

    public boolean equals(Object o) {
        boolean compteur = true;
        if (o == null) {
            return false;
        }
        if (!(o instanceof FileChaineeGen)) {
            return false;
        }
        FileChaineeGen f = (FileChaineeGen) o;
        if (this.size() != f.size()) {
            return false;
        }
        Cellule courant = this.premier;
        Cellule fcourant = f.premier;
        for (int i = 0; i < this.size(); i++) {
            if (!(courant.valeur.equals(fcourant.valeur))) {
                compteur = false;
            }
            courant = courant.suivant;
            fcourant = fcourant.suivant;
        }
        return compteur;
    }

    public String toString() {
        if (this.isEmpty()) {
            return "[]";
        }
        String message = "[";
        Cellule courant = this.premier;
        message = message + courant.valeur;
        for (int i = 1; i < this.size(); i++) {
            message = message + ", " + courant.valeur;
            courant = courant.suivant;
        }
        return message + "]";
    }
}