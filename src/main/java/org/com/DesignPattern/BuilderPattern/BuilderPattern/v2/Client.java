package org.com.DesignPattern.BuilderPattern.BuilderPattern.v2;

public class Client {

    public static void main(String[] args){
        SubwaySandwich b = SubwaySandwich.getBuilder()
                .setBread("cghvjbmn")
                .setCondiments("cghb")
                .setVeggies("gchjkn")
                .build();

    }
}
