package src;

public class CustomMath {
    //safe because nothing can be done with them
    //accessed with CustomMath.thing
    public static final double PI = 3.14159;
    public static final double E = 2.7182818284590452353602874713527;

    public static double max(double a, double b){
        if(a > b){
            return a;
        } else return b;
    }
    public static double min(double a, double b){
        if(a < b){
            return a;
        }else return b;
    }
    public static int pow(int base, int exp){
        int num = base;
        for(int i = 1; i < exp; i++){
            num *= base;
        }
        return num;
    }
}
