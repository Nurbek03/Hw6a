package com.company;

public class Sanoo <T extends Number> implements Kalkulatr<T> {

    private T treti;

    public T getTreti() {
        return treti;
    }

    public Sanoo(T treti) {
        this.treti = treti;
    }

    @Override
    public void minus(T pervyi, T ftaroi) {
        System.out.println(pervyi.intValue()-ftaroi.intValue()+treti.intValue());
    }
}
