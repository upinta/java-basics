package com.generics.firstGeneric;

public class GenericFirst<T,S> {
    T x;
    S y;

    public GenericFirst(T x, S y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public S getY() {
        return y;
    }

    public void setY(S y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "GenericFirst{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
