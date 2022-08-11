package com.sparta.gs;

public class TheBox <T> {

    // create classes and methods where we give it a type but when it comes to instantiating it we specify the type
    private T t;

    public T getT() {
        return t;
    }

    public void setT() {
        this.t = t;
    }

    public static void main(String[] args) {
        // in the <> we can only use class types and not an integer
        // we can also use <?> which represents anything

        // <?> using this we can add retrictions by doing extends and the type we want ie Number
        // this holds Integer, Float, Double etc and we can onlu put in numbers
        TheBox<Integer> box = new TheBox<Integer>();
        box.setT();
        System.out.println(box.getT());

        // using <super> will allow you to use any of the parents and this Class
        // ie <? super Integer>
    }
}
