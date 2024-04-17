package src;

import java.util.Scanner;

public class Point2D {
    private int x;
    private int y;

    public Point2D(Point2D point2D){
        this.x = point2D.x;
        this.y = point2D.y;
    }
    public Point2D(int x, int y){
        newX(x);
        newY(y);
    }

    //ensures at least 0
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

    public void resetToOrigin(){
        x = 0;
        y = 0;
    }
    public void translate(int dx, int dy){
        x += dx;
        y += dy;
    }

    @Override
    public String toString(){
        return "(" + x + "," + y + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Point2D otherPoint2D = (Point2D) obj;
        return x == otherPoint2D.x && y == otherPoint2D.y;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}
