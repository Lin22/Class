package com.company;

public class Main {

    public static void main(String[] args) {
	Inner a=new Inner();
        a.show();

        Inner.Mynested a1=new Inner.Mynested();
        a1.nestedshow();

        Inner.Myinner a2=a.new Myinner();
        Inner.Myinner a3=a.new Myinner();
        a2.innershow();
        a3.innershow();
    }
}
