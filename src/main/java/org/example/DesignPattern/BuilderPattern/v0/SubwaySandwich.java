package org.example.DesignPattern.BuilderPattern.v0;

public class SubwaySandwich {

    public String bread;
    public String veggies;
    public String fillings;
    public String condiments;


    public SubwaySandwich(Builder b ){
        this.bread = b.bread;
        this.veggies = b.veggies;
        this.condiments = b.condiments;
        this.fillings = b.fillings;
    }
}
