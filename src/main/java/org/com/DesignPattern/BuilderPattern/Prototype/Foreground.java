package org.com.DesignPattern.BuilderPattern.Prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//import lombok.*;
//
//@Data
//@AllArgsConstructor
@Data
@AllArgsConstructor
public class Foreground implements GraphicalObject {

    private Integer x;
    private Integer y;
    private Integer width;
    private Integer height;
    private String color;
    private GraphicalObjectType type;


//    public Foreground(Integer x, Integer y, Integer width, Integer height, String color, GraphicalObjectType type){
//        this.x = x;
//        this.y = y;
//        this.width = width;
//        this.height = height;
//        this.color =  color;
//        this.type = type;
//    }

    @Override
    public Foreground clone() {
        // Directly return a new Foreground object using the constructor
        return new Foreground(x, y, width, height, color, type);
    }
}
