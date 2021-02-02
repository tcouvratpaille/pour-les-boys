package TP2;

import java.util.ArrayList;

public class FileArrayList implements IFileArrayList {
    protected ArrayList<Double> data = new ArrayList<Double>();

    @Override
    public boolean add(double e) {
        if ( !this.data.contains(e)) {
            this.data.add(e);
            return true;
        }
        return false;
    }

    @Override
    public boolean remove() {
        assert this.data.size() > 0 : "Empty FileArrayList, cannot use remove()";
        this.data.remove(0);
        return true;
    }

    @Override
    public boolean isEmpty() {
        return this.data.size() == 0;
    }

    @Override
    public int size() {
        return this.data.size();
    }

    @Override
    public double get() {
        assert this.data.size() > 0 : "Empty FileArrayList, cannot use get()";
        return this.data.get(0);
    }
    public String toString() {
        return this.data.toString();
    }

    public boolean equals(Object f) {
        if (!(f instanceof FileArrayList)) {
            return false;
        }
        FileArrayList g = (FileArrayList) f;
        if (this.size() == g.size()) {
            return (this.data.containsAll(g.data));
        }
        return false;
    }
}
