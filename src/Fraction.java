package src;

public class Fraction {
    public final int numerator;
    public final int denominator;

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public Fraction(Fraction anotherFraction){
        numerator = anotherFraction.numerator;
        denominator = anotherFraction.denominator;
    }

    @Override
    public String toString(){
        return numerator + "/" + denominator;
    }

    public Fraction add(Fraction that){
        int newDen = denominator * that.denominator;
        int newNum =  numerator * that.denominator + that.numerator * denominator;
        int devBy = 1;
        //simplifies
        for(int i = newDen; i > 0; i--){
            if(newNum % i == 0 && newDen % i == 0){
                devBy = i;
            }
        }
        newNum /= devBy;
        newDen /= devBy;
        return new Fraction(newNum, newDen);
    }

    @Override
    public boolean equals(Object other){
        if(!(other instanceof Fraction)){
            return false;
        }
        Fraction that = (Fraction) other;
        if(this == that){
            return true;
        }
        return that.numerator == numerator && that.denominator == denominator;
    }

    public int getNum() {
        return numerator;
    }
    public int getDenom(){
        return denominator;
    }
}
