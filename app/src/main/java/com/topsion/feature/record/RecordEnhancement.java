package com.topsion.feature.record;


public class RecordEnhancement {
    public void patternRecord(Object object) {
        if (object instanceof Point(int x, int y)) {
            System.out.printf("x is :%d, y is: %d, sum is %d\n", x, y, x+y);
        }
    }

    public record Point(int x, int y) {
    }

    public void printSwitch(Object object) {
        switch (object) {
            case Point(int x, int y) -> System.out.printf("object is a point %d/%d%n", x, y);
            case String s -> System.out.printf("object is string: %s%n", s);
            default -> System.out.printf("object is other: %s%n", object.getClass());
        }
    }
}
