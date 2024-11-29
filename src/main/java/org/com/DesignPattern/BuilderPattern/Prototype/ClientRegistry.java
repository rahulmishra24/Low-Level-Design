package org.com.DesignPattern.BuilderPattern.Prototype;

public class ClientRegistry {

    public static void  main(String[] args) {
        GameRegistry registry = new GameRegistry();

        Foreground prototype = new Foreground(100, 100, 200, 300, "blue", GraphicalObjectType.FOREGROUND);
        registry.addPrototype(GraphicalObjectType.FOREGROUND,prototype);

        Foreground clone = registry.getProtoype(GraphicalObjectType.FOREGROUND).clone();


    }

}
