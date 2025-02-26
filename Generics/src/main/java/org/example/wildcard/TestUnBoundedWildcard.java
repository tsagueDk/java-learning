package org.example.wildcard;

import java.util.ArrayList;
import java.util.List;

public class TestUnBoundedWildcard {
    public static void main(String[] args) {
        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle());
        drawAll(rectangles);
    }

    private static <T extends Shape> void  drawAll(List<T> shapes){
        for (Shape shape: shapes ) {
           shape.draw();
        }
    }
}
