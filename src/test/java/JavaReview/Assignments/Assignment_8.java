package JavaReview.Assignments;

import org.testng.annotations.Test;

import java.util.Scanner;

public class Assignment_8 {

    //    Assignment-8 | Methods
//    Question-1
//    Create a method called "plus", its return is void and it gets no arguments.
//    It asks the user to input two numbers, then it will add them and print the result.
//    Create a scanner within the plus method.
//            Example:
//    enter first number:
//            1
//    enter second number:
//            2
//    result: 3

    public static void main(String[] args) {

        System.out.println(hamletQuote(false, false));
        System.exit(1);
        c_profis(1000,5000);
        fib();
        System.exit(1);
        isPalindrome();
        System.exit(1);
        System.out.println(isEven(55));
        System.exit(1);
        next3();
        sign(5);
        hello();
        world();
        cube();
        plus();

    }

    static void plus() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls enter First number: ");
        int i = scanner.nextInt();

        System.out.println("Pls enter Second number: ");
        int j = scanner.nextInt();
        System.out.println("Result :" + (i + j));
    }

    //    Question-2
//    Create a method called cube. Write all required code inside this method in order to ask
//    the user for a number and then prints the cubed value of that number:
//    Example:
//    input:
//    output: 125
     static void cube() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls enter a number: ");
        int i = scanner.nextInt();

        System.out.println("Result :" + (i * i * i));
    }
//    Question-3
//    Create 2 methods called hello() and world(). Provide an implementation for both of them
//    in order to print an appropriate message. So hello() method should print "Hello" and
//    world() method should print "World!".
//    output: Hello World!
    static void hello(){
        System.out.print("Hello");
    }

    static void world() {
        System.out.println(" World");
    }

    //    Question-4
//    Create a method printHollowRect that prints a 5 on 5 hollow rectangle:
//    hint: you will need to use two nested for loops for that, and an if that checks if its the last
//    or first iteration of the loop (so you will know whet to print "*" or " ")

    @Test
    void hollow() {
        for (int i = 0; i <7 ; i++) {
            for (int j = 0; j <5 ; j++) {
                if((j==0 || j==4) || (i==0 ||i==4)) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }










//    Question-5
//    Create a method called sign. It gets a number and tells you if its positive, negative or
//    zero.
//for example :
//    sign(5) => 1
//    sign(-30)=> -1
//    sign(0) => 0
//    sign gets an int parameter.
//    print out 1,-1 or 0 depending on the input
//    the parameter should be entered by user (create a scanner object)
    static void sign(int i){
        if(i>0){
            System.out.println("+1");
        }else if(i<0){
            System.out.println("-1");
        }else{
            System.out.println("0");
        }

    }

    //    Question-6
//    Create a method called next3 . This method gets an int argument and prints the next 3
//    numbers after that number. Call the method from main method and pass num to it.
//            enter number
//1
//    next 3 are:
//            2 3 4
//            (put a space between numbers)
    static void next3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls enter number :" );
        int i=scanner.nextInt();
        System.out.println("Next 3 are :" + (i+1) + " " + (i+2) + " " + (i+3));
    }
//    Question-7
//    Complete a method isPalindrome() that will check if the number is a palindrome. Print
//    your result as a boolean (true or false).
//    Do not convert int into a string!
//    Example:
//    input: 1001
//    output: true
//    Example:
//    input: 1234
//    output: false

    static void isPalindrome() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input : ");
        int n = scanner.nextInt();
        int reservedNumber=0,r;
        int actualNumber=n;
        while(n>0){
            r=n%10;
            reservedNumber=(reservedNumber*10)+r;
            n=n/10;
        }
        if(actualNumber==reservedNumber){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }











    //    Question-8
//    Complete a method fib() that will compute Fibonacci numbers
//    In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1,
//            2, 3, 5, 8, 13, 21, 34, 55, 89, 144,……... The first two numbers of fibonacci series are 0
//    and 1.
//    Given a number num, print n-th Fibonacci Number.
//            Input : 2
//    Output : 1
//    Input : 9
//    Output : 21

    static void fib() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input: ");
        int input=scanner.nextInt();
        int n=1;
        int m=0;
        int sum=0;
        for (int i = 0; i <input-1 ; i++) {
            sum=n+m;
            n=m;
            m=sum;
        }
        System.out.println(sum);
    }






//    Question-9
//    Create a method called max. It gets two ints, x and max.
//    x is the test case, max is what we test against.
//            if x is bigger then max return max
//    in any other case return x.
//for example:
//    max(1,10)
//    returns 1
//    max(11,5)
//    returns 5

    static void max(int x,int max){
        if(x>max){
            System.out.println(max);
        }else{
            System.out.println(x);
        }
    }





//    Question-10
//    isEven method gets a number(int) if its even (2,4,8...) returns true.
//            if its odd return false.
//            for example:
//    isEven(1) --> false
//    isEven(8) --> true

    static boolean isEven(int i) {
        if(i%2==0){
            return true;
        }else {
            return false;
        }
    }



//    Question-11
//    c_profits gets the buyPrice(int) and sellPrice(int) and determines if there was a profit or
//    loss.
//    it returns a string value that can be "profit","loss","no loss"
//            for example:
//    c_profis(100,1500)
//    returns : "profit"
//    c_profis(20,5)
//    returns : "loss"
//    c_profis(100,100)
//    returns : "no loss"


    static void c_profis(int i, int j) {
        if(i<j){
            System.out.println("profit");
        }else if(i>j){
            System.out.println("loss");
        }else {
            System.out.println("no loss");
        }
    }

//    Question-12
//    The danish prince most famous quote is "to be or not to be". thats a classic example of
//    boolean logic.
//    the hamletQuote method only returns true if one of or both of the boolean parameters is
//true.
//    example:
//    hamletQuote(true, false)
//    returns true
//    hamletQuote(false,true)
//    returns true
//    hamletQuote(true,true)
//    returns true
//    hamletQuote(false,false)
//    returns false
//    hint: use the truth table for this one, this can be done with one if and a logical operator.

        static boolean hamletQuote(boolean a,boolean b) {

        if (a || b ){
            return true;
        }
            return false;
        }




//    Question-13
//    This method calculates a water bill, the method gets a double and returns a double.
//    The more water you use the more it will cost you (as a fine for wasting water).
//            for example:
//    waterTax(50)
//    returns 30
//    waterTax(55)
//    returns 49.5
//    waterTax(101)
//    returns 140.9
//    waterTax(151)
//    returns 235.9
//    the regular calculation under 50 is
//            bill = units * 0.60;
//    above 50 is:
//    bill = units * 0.90;
//    above 100 the calculation is like above 50 but with a 50 as fine
//    and above 150 it is the same as above 50 (units *0.90) but with a 100 fine added to the
//    price.


    static double waterWax(double i) {

        if (i <= 50) {
            i=i*0.6;
        }else if(i>50){
            i=i*0.9;
        }else{
            i=0.0;
        }
        return i;
    }




//            Question-14
//    This one is about truth table logic, threeLocks gets 3 booleans and returns a boolean.
//    It returns true only if both a and b are true or c is true.

    static boolean threeLocks(boolean a, boolean b, boolean c) {
        if((a==true && b==true) || (c==true)){
            return true;
        }else{
            return false;
        }
    }





//    Question-15
//    We have a to do list app, every time a user adds a task - a few things needed to be
//    checked.
//    It should not be empty. boolean parameter needs to be true
//    taskId should be only 1 greater than currentID. for example if we have 7 tasks(currentId is
//7) so the next task id is 8 , it can't be 10.
//            for example:
//    validateTask(true,2,1)
//    returns true
//    validateTask(true,3,1)
//    returns false
//    validateTask(false,3,2)
//    returns false

    static boolean validateTask(boolean a, int i, int j) {

        if ((a==true) && (i==(j+1))){
            return true;
        }else{
            return false;
        }



    }

//    Question-16
//    To book a room first it needs to be available for rent and make sure its available at the
//    date selected:
//    the room is already booked between 7/1/2018 - 7/8/2018 and not available accepting
//    bookings only for year of 2018
//    example:
//    simpleRoomBook(false,2,1,2018)
//return false
//    simpleRoomBook(true,2,1,2018)
//return true
//    simpleRoomBook(true,7,2,2018)
//return false

    public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year)
    {
        if (isAvailable == true && year==2018) {
            if ((month==7) && (day>=1 && day<=8)) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }

    }





//    Question-17
//
//    There are a few ways to get this galacticly popular drink if it is available at the store you
//    can buy it. or you can get it as a gift.
//    the third option is to mix its ingredients (its a secret formula):
//            1 from ingredient1,2 from ingredient2 and 3 from ingredient3.
//    or the alternate recipe: 3 from ingredient1, 1 from ingredient2 and 2 from ingredient3.
//            this ain't coca-cola...
//    You need to have exact amount of ingredients for making the drink. not less or more
//    getThunderBlazz(boolean avilable,boolean gift, int ingredient1 , int ingredient2, int
//            ingredient3)
//    available = available at store
//            gift = got it as a gift
//    both are booleans.
//    then theres the three ingredients as ints
//    example use:
//    getThunderBlazz(true,false,1,2,3)
//    returns true
//    getThunderBlazz(false,false,1,2,3)
//    returns true
//    getThunderBlazz(false,false,1,5,3)
//    returns false
//    getThunderBlazz(false,false,3,1,2)
//    returns true
//    getThunderBlazz(false,false,3,1,1)
//    returns false
//    getThunderBlazz(false,true,9,7,3)
//    returns true
//    hint: use parenthesis to separate logical arguments:
//            (true|| false && true)||(false&&TRUE) etc
//    or put them in their own variables, everything to make it easy to read.
//



    public static boolean getThunderBlazz(boolean available,boolean gift, int ingredient1 , int ingredient2, int ingredient3){

        boolean getThunder;
        if(available == true){
            getThunder=true;
        }else if(gift == true){
            getThunder=true;
        }else{
            if(ingredient2==(2*ingredient1) && (ingredient3==(3*ingredient1))){
                getThunder=true;
            }else if(ingredient3==(2*ingredient2) && (ingredient1==3*ingredient2)){
                getThunder=true;
            }else{
                getThunder=false;
            }
        }
        return getThunder;

    }
}
