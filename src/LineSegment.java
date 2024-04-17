package src;

public class LineSegment {
    private Point2D start;
    private Point2D end;
    //0 and up alr ensured by point class

    public LineSegment(){
        start = new Point2D(0, 0);
        end = new Point2D(0, 0);
    }
    public LineSegment(Point2D start, Point2D end){
        this.start = start;
        this.end = end;
    }
    public LineSegment(LineSegment anotherLine){
        start = new Point2D(anotherLine.start);
        end = new Point2D(anotherLine.end);
    }

    public void setStartPoint(Point2D start) {
        this.start = start;
    }
    public void setEndPoint(Point2D end) {
        this.end = end;
    }

    public Point2D getStart(){
        return new Point2D(start);
    }
    public Point2D getEnd(){
        return new Point2D(end);
    }

    @Override
    public boolean equals(Object other){
        if(!(other instanceof LineSegment)){
            return false;
        }
        LineSegment that = (LineSegment) other;
        if(this == that){
            return true;
        }
        return start.equals(((LineSegment) other).start) && end.equals(((LineSegment) other).end);
    }
    @Override
    public String toString(){
        return "Line start: " + start.toString() + ", line end: " + end.toString();
    }
    public double distance(){
        return Math.abs(Math.sqrt(Math.pow(end.getX() - start.getX(), 2)
            + Math.pow(end.getY() - start.getY(), 2)
            ));
    }
}
