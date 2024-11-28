package org.example.DesignPattern.BuilderPattern.v0;

public class Client {

    public static void main(String[] args){

       Builder b = new Builder();
       b.bread = "rggdh";
       b.condiments = "vehrfj";
       SubwaySandwich st = new SubwaySandwich(b);

    }
}
