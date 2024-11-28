package org.example.DesignPattern.BuilderPattern.v2;

import org.example.DesignPattern.BuilderPattern.v2.SubwaySandwich;

public class Client {

    public static void main(String[] args){
        SubwaySandwich b = SubwaySandwich.getBuilder()
                .setBread("cghvjbmn")
                .setCondiments("cghb")
                .setVeggies("gchjkn")
                .build();

    }
}
