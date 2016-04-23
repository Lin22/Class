package com.company;

import static java.lang.System.out;
public class Inner {
    public String testfield="(testfield)";

    public static class Mynested //account номер и баланс //положить деньгу, снять, вывести всю инфу
    {
        public String nested="(nested)";
        public void nestedshow(){
            out.println("Hi I'm inner class"+nested);}
        }

    public class Myinner
    {
        public String inner="(inner)";
        public void innershow(){
            out.println("Hi I'm inner class 1"+inner);}
        }

    public void show(){
        System.out.println("Hi I'm just class"+testfield);
    }



}
