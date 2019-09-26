package ru.mirea.lab2;

import java.lang.*;
public class dog {
    private String name;
    private int age;
    private int height;
    public dog(String n, int a, int h){
        name = n;
        age = a;
        height = h;
    }
    public dog(String n) {
        name = "pup";
        age = 0;
        height = 50;
    }
    public dog(){
        name = "pup";
        age = 0;
        height = 50;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public String getName(String name){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getHeight(){
        return height;
    }
    public String toString(){
        return this.name+", age "+this.age + this.height;
    }
    public void intoHumanAge(){
        System.out.println(name+"'s age in human years is "+age*7+" years"+" and the height is "+height);
    }

}
