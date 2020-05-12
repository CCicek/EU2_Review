package JavaReview.Day_1;

public class ShorthandAndCompundOperators {
    public static void main(String[] args) {
        int guests =3;
        guests = guests + 2;
        System.out.println("guests = " + guests);

        guests +=3;
        System.out.println("guests = " + guests);

        guests-=4;
        System.out.println("guests = " + guests);

        int apples =3;
        apples = apples *2;
        System.out.println("apples = " + apples);

        apples *=2;
        System.out.println("apples = " + apples);

        int minutes = 315;
        int hours = minutes/60;
        System.out.println("hours = " + hours);

        minutes = minutes%60;
        System.out.println("minutes = " + minutes);

        boolean sweet = false;
        boolean hot = (sweet = true);
        System.out.println("sweet = " + sweet);
        System.out.println("hot = " + hot);
    }
}
