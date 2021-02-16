package TP3;

import java.util.ArrayList;
import java.util.Random;

public class MySetProf {

    protected ArrayList<Double> data;

    public MySetProf() {
        data = new ArrayList<Double>();
    }


    public MySetProf(MySetProf set) {
        data = new ArrayList<Double>(set.data);
    }

    public void clear() {
        data.clear();
    }


    public int size() {
        return data.size();
    }


    public boolean isEmpty() {
        return data.isEmpty();
    }


    public void add(double elem) {
        if (!data.contains(elem)) {
            data.add(elem);
        }
    }

    public boolean remove(double element) {
        if (data.contains(element)) {
            data.remove(element);
            return true;
        }
        return false;
    }


    public boolean contains(double elem) {
        return data.contains(elem);
    }


    public double random() {
        assert (!isEmpty()) : "random impossible, ensemble vide";
        Random rand = new Random();
        int i = rand.nextInt(size());
        double choice = data.get(i);
        return choice;
    }


    public String toString() {
        return data.toString();
    }

    public boolean equals(Object o) {
        if (o == null)
            return false;
        if (o == this)
            return true;
        if (!(o instanceof MySetProf))
            return false;
        MySetProf comparedSet = (MySetProf) o;
        if (this.size() != comparedSet.size())
            return false;
        boolean egal = true;
        for (int i = 0; i < this.data.size() && egal; i++) {
            if (!comparedSet.contains(this.data.get(i)))
                egal = false;
        }
        return egal;
    }}