package JavaReview.Day_1;

public class LogicalOperators {
    public static void main(String[] args) {
        //& && | || ! ^ (anything return to boolean)

        System.out.println(true & false);
        System.out.println(false& false);
        System.out.println(true & true);
        System.out.println(false & true);
        System.out.println("*********");
        System.out.println(true | false);
        System.out.println(false| false);
        System.out.println(true | true);
        System.out.println(false | true);
        System.out.println("*********");
        System.out.println(!false & true);
        System.out.println("*********");
        System.out.println(true ^ false);
        System.out.println(false^ false);
        System.out.println(true ^  true);
        System.out.println(false ^ true);
        //PrecedenceOf Logical operators
        //! is evaluated first
        //&& is evaluated second
        //|| is evaluated third
        System.out.println("********");
        System.out.println(!(false) || true && false);
    }
}
