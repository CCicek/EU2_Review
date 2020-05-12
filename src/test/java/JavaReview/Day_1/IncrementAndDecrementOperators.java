package JavaReview.Day_1;

public class IncrementAndDecrementOperators {
    public static void main(String[] args) {
        int apples =0;
        System.out.println(apples);
        System.out.println(++apples);
        System.out.println(apples++);
        System.out.println("apples = " + apples);
        apples--;
        System.out.println("apples = " + apples);

        int pears =3;
                    // 4    * 5 / 4    +  2 => 7
        int basket = ++pears*5/pears-- + --pears;
        System.out.println("pears = " + pears);
        System.out.println("basket = " + basket);


    }
}
