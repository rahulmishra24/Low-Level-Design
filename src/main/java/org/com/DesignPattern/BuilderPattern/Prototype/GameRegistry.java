package org.com.DesignPattern.BuilderPattern.Prototype;

import java.util.HashMap;

public class GameRegistry {

HashMap<GraphicalObjectType,Foreground> mp= new HashMap<>();

public void addPrototype(GraphicalObjectType key, Foreground value){
    mp.put(key,value);
}

public Foreground getProtoype(GraphicalObjectType key){
    return mp.get(key);
}


}
