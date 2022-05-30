package com.ketul.consumers.primitiveConsumers.type2;

import java.util.Arrays;
import java.util.List;
import java.util.function.ObjLongConsumer;
import java.util.function.ToLongFunction;

class Rectangle {
    private long length;
    private long width;

    public Rectangle(long length, long width) {
        this.length = length;
        this.width = width;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public long getWidth() {
        return width;
    }

    public void setWidth(long width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}

public class ObjLongConsumerDemo1 {
    public static void main(String[] args) {
        List<Rectangle> list = Arrays.asList(
                new Rectangle(10, 20),
                new Rectangle(25, 35),
                new Rectangle(24, 14)
        );

        ObjLongConsumer<Rectangle> updateLength = Rectangle::setLength;

        ToLongFunction<Rectangle> calculateAreaOfRectangle = rectangle -> rectangle.getLength() * rectangle.getWidth();

        long newLength = 19;
        for(Rectangle rectangle : list) {
            updateLength.accept(rectangle, newLength);
            newLength += 19;
        }


        for(Rectangle rectangle : list) {
            System.out.print("Your Rectangle (" + rectangle.getLength() + ", " + rectangle.getWidth() + ") Area is : ---> ");
            System.out.println(calculateAreaOfRectangle.applyAsLong(rectangle));
            System.out.println("---------------------------------------");
        }
    }
}
