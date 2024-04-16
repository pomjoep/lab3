package src;

import java.awt.Color;
import java.util.Scanner;

public abstract class Shape {
    protected int x = 0;
    protected int y = 0;
    protected Color color = Color.WHITE;

    //constructors
    public Shape(){};
    public Shape(int x, int y, Color color){
        this.color = color;
        newX(x);
        newY(y);
    }
    public Shape(Shape anotherShape){
        x = anotherShape.x;
        y = anotherShape.y;
        color = anotherShape.color;
    }

    //x y checking
    public void newX(int x){
        if(x < 0){
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Invalid x, enter a new one 0 or above: ");
            newX(keyboard.nextInt());
        } else{
            this.x = x;
        }
    }
    public void newY(int y){
        if(y < 0){
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Invalid y, enter a new one 0 or above: ");
            newY(keyboard.nextInt());
        } else{
            this.y = y;
        }
    }

}
