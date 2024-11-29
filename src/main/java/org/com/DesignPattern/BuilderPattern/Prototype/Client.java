package org.com.DesignPattern.BuilderPattern.Prototype;

public class Client {
    public static void main(String[] args){
        Foreground prototype = new Foreground(100, 100, 200, 300, "blue", GraphicalObjectType.FOREGROUND);
        Foreground clone = prototype.clone();
        clone.setX(1234);
        clone.setY(4212);
    }


}
