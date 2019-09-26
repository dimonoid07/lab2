package ru.mirea.lab2;

public class test_dog {
    public static void main(String[] args){
        dog d1 = new dog ("Titan", 5, 40);
        dog d2 = new dog ("Ferra", 2, 30 );
        dog d3 = new dog ("Tuta");
        d3.setAge(2);
        d3.setHeight(50);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
