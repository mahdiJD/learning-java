package com.company;

class Circle {
    public int r;
    public double getMohit() {
        return 2 * r * 3.14;
    }
    public double getMasahat() {
        return r * r * 3.14;
    }
    public void setR(int theR) {
        if(theR < 0)
            r = -theR;
        else
            r = theR;
    }
    public int getR() {
        return r;
    }
}
