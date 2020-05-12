package JavaReview.Day_1;

public class CastingPrimitives {
    //A type cast takes a value of one type and converts to another
    public static void main(String[] args) {

        int i = (int) 3.9;
        System.out.println("i = " + i);

        //Implicit Casting
        //byte>short>int>long>float>double
        double d1 =200;
        long l=i;
        System.out.println(d1);
        //Explicit Casting
        byte b1 = 5;
        short sh1 =400;
        b1=(byte)sh1;
        System.out.println("b1 = " + b1);

        int a =(int) (5/2.0);
    }
}
