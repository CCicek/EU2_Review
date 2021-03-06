package JavaReview.Assignments;

import SeleniumReview.TestBase;
import SeleniumReview.pages.AmzPage;
import org.testng.annotations.Test;

import java.util.Scanner;

public class Assignment_9 extends TestBase {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("Enter start letter:");
        char start = scan.next().charAt(0);
        System.out.print("Enter end letter letter:");
        char end = scan.next().charAt(0);

        for (; start <= end; start++) {
            System.out.print(start);
        }
        System.exit(1);

        swiftmail("mike_tyson@gmail.com");
        System.exit(1);
        firstHalf("javvasva");
        System.exit(1);
        reverse("aaaabs");
        System.exit(1);
        three("abx", "abx");
        System.exit(1);

        middleThree("asdfg0a");
        print("xxaaxxx");
        pcBuilder();
        tipCalculator(true, 6, 560, "Excellent");
    }

//    Assignment-9
//    Question-1
//    Create a method called tipCalculator which accepts parameters: boolean isSplit, int
//    numberPeople, double checkAmount, String serviceQuality
//    Ask the user to enter each value.
//    User should select service quality that will correspond to tip percent.
//            Poor = 5%
//    Fair = 10%
//    Good = 15%
//    Great = 20%
//    Excellent = 25%
//    The program should display the following information based on the user input:
//    Split or No split
//    Number of people entered: &&&&
//    Service Quality:
//    Total to pay:
//    Total tip:
//    Total per person:
//    Tip per person:
//    Input:
//    Split:Yes
//    Number of people:4
//    Check amount:476.0
//    Service Quality:Excellent
//    Output:
//    Number of people entered: &&&&
//    Total to pay: 595.0
//    Total tip: 119.0
//    Total per person: 148.75
//    Tip per person: 29.75


    static void tipCalculator(boolean isSplit, int numberPeople, double checkAmount, String serviceQuality) {
        double tip = 0;
        if (serviceQuality == "Poor") {
            tip = 0.05;
        } else if (serviceQuality == "Fair") {
            tip = 0.10;
        } else if (serviceQuality == "Good") {
            tip = 0.15;
        } else if (serviceQuality == "Great") {
            tip = 0.20;
        } else if (serviceQuality == "Excellent") {
            tip = 0.25;
        }
        if (isSplit == true) {
            double totalPay = ((checkAmount * tip) + checkAmount);
            double totalTip = (checkAmount * tip);
            System.out.println("Number of people entered :" + numberPeople);
            System.out.println("Total to pay: " + totalPay);
            System.out.println("Total tip : " + totalTip);
            System.out.println("Total per Person:" + totalPay / numberPeople);
            System.out.println("Tip per person:" + totalTip / numberPeople);
        } else if (isSplit == false) {
            double totalPay = ((checkAmount * tip) + checkAmount);
            double totalTip = (checkAmount * tip);
            System.out.println("Number of people entered :" + numberPeople);
            System.out.println("Total to pay: " + totalPay);
            System.out.println("Total tip : " + totalTip);
            System.out.println("Total per Person:" + totalPay);
            System.out.println("Tip per person:" + totalTip);
        }

    }


//    Question-2
//    Write a program that will calculate laptop price based on the components.
//    First, ask user for screen size. If screen size equals to 13.3, add $200 to the laptop price.
//    If screen size equals to 15.0 - add $300 to the laptop price. If screen size equals to 17.3 -
//    add $400 to the laptop price.
//    Then ask the user for CPU type. If CPU type equals to i3, add $150 to the laptop price. If
//    CPU type equals to i5, add $250 to the laptop price. If CPU type equals to i7, add $350 to
//    the laptop price.
//    Then ask the user for RAM size. Add $50 for every 4GB of ram to the laptop price.
//            Then, ask the user for the storage type. There are 2 options: SSD and HDD. If it's HDD -
//    add $50 to the laptop price for every 500gb. If it's SSD - add $100 to the laptop price for
//    every 500GB.
//    Then ask the user for screen resolution. There are 2 options: FULLHD and 4K. Add $100
//if it's FULLHD screen and $200 if it's 4K screen.
//    Sample Output:
//    Display message: Select screen size:
//    input: 13.3
//    Display message: Select CPU type:
//    input: i7
//    Display message: Select RAM size:
//    input: 8
//    Display message: Select storage type:
//    input: SSD
//    Display message: Enter memory size:
//    input: 1000
//    Display message: Enter screen resolution:
//    input: 4K
//    Display message: Laptop price is: $1050.0
//    Example #2
//    Display message: Select screen size:
//    input: 13.3
//    Display message: Select CPU type:
//    input: i3
//    Display message: Select RAM size:
//    input: 4
//    Display message: Select storage type:
//    input: HDD
//    Display message: Enter memory size:
//    input: 500
//    Display message: Enter screen resolution:
//    input: FULLHD
//    Display message: Laptop price is: $550.0

    static void pcBuilder() {

        Scanner scan = new Scanner(System.in);

        double price = 0;
        String storageType, screenType, cpu;
        int ram = 0;

        System.out.println("Select screen size:");
        double sSize = scan.nextDouble();

        if (sSize == 13.3) {
            price += 200;
        } else if (sSize == 15.0) {
            price += 300;
        } else {
            price += 400;
        }

        scan.nextLine();
        System.out.println("Select CPU type:");
        cpu = scan.nextLine();

        if (cpu.equals("i3")) {
            price += 150;
        } else if (cpu.equals("i5")) {
            price += 250;
        } else if (cpu.equals("i7")) {
            price += 350;
        }

        System.out.println("Select RAM size:");
        ram = scan.nextInt();
        price = price + (ram / 4 * 50);

        scan.nextLine();
        System.out.println("Select storage type:");
        storageType = scan.nextLine();
        if (storageType.equals("HDD")) {
            System.out.println("Enter memory size:");
            int mSize = scan.nextInt();
            price = price + (mSize / 500 * 50);
        } else if (storageType.equals("SSD")) {
            System.out.println("Enter memory size:");
            int mSize = scan.nextInt();
            price = price + (mSize / 500 * 100);
        }

        scan.nextLine();
        System.out.println("Enter screen resolution:");
        String sResolution = scan.nextLine();
        if (sResolution.equals("FULLHD")) {
            price += 100;
        } else if (sResolution.equals("4K")) {
            price += 200;
        }

        System.out.println("Laptop price is: $" + price);


    }


//    Question-3
//    You have a word, do the following:
//            1. When word has odd number of characters and:
//            - 3 or more characters, print middle letter
//    oak ==> a
//    javav ==> v
//- Single character, print that character 3 times
//# ==> ###
//    q ==> qqq

//2. When word has even number of characters and:
//            - 4 or more characters, print middle 2
//    java ==> av
//    apples ==> pl
//#$%^&* ==> %^
//            - 2 characters, print those 2 characters twice
//    @@ ==>@@@@
//            $$ ==>$$$$
//    hi ==> hihi

    static void print(String s) {
        if (s.length() == 1) {
            System.out.println(s + s + s);
        } else if (s.length() == 2) {
            System.out.println(s + s);
        } else if (s.length() % 2 == 0) {
            System.out.println(s.substring((s.length() / 2 - 1), (s.length() / 2 + 1)));

        } else if (s.length() % 2 == 1) {
            System.out.println(s.charAt(s.length() / 2));
        }
    }


//    Question-4
//    You have a word, do the following:
//    If the word has odd number of characters and has 5 or more characters, print the middle
//    three characters of the word. Otherwise, print "invalid".
//    Sample Output:
//    fifteen ==> fte
//    apple ==> ppl
//    hey ==> invalid
//    java ==> invalid
//    whatsup ==> ats
//    $ ==> invalid

    static void middleThree(String s) {
        if (s.length() < 5 || s.length() % 2 == 0) {
            System.out.println("Null");
        } else {
            System.out.println(s.substring(s.length() / 2 - 1, s.length() / 2 + 2));
        }
    }


//    Question-5
//    You have 2 words, both of them have 3 characters. If either of them does not have
//    exactly 3 characters, print "cannot merge" Merge their characters one by one and print
//    together like below:
//    Sample Output:
//    aok
//            lol
//    alookl
//            ear
//    pie
//            epaire
//    java
//            wow
//    cannot merge


    static void three(String s1, String s2) {
        if (s1.length() == 3 && s2.length() == 3) {
            String str = s1.charAt(0) + "" + s2.charAt(0) + "" + s1.charAt(1) + "" + s2.charAt(1) + "" + s1.charAt(2) + "" + s2.charAt(2);
            //System.out.println(s1.charAt(1)+"" +s2.charAt(1));
            System.out.println(str);
        } else {
            System.out.println("null");
        }

    }


//    Question-6
//    Write a program that will reverse a string. Your program should reverse a string only 5
//    characters long. If the word is shorter, display message: "Too short!". If the word is longer,
//    display the message: "Too long!". Otherwise, reverse this word and print out the result
//    into the console.
//    Sample Output:
//    input: cat
//    output: Too short!
//    input: singularity
//    output: Too long!
//    input: apple
//    output: elppa

    static void reverse(String string) {
        if (string.length() == 5) {
            StringBuffer stringBuffer = new StringBuffer(string);
            System.out.println(stringBuffer.reverse());
        } else if (string.length() < 5) {
            System.out.println("Too short");
        } else if (string.length() > 5) {
            System.out.println("Too long");
        }

    }


//    Question-7
//    Write a program that will print out the first half of the word twice.
//    Sample Output:
//    input: java
//    output: jaja

    static void firstHalf(String string) {
        String firstHalf=string.substring(0,string.length()/2);
        System.out.println(firstHalf + firstHalf);
    }

//    Question-8
//    Alejandro have started learning java, he knows what you know about ifs and strings. He
//    has a large number of text emails, going through all of them will take a lot of time. To save
//    time he will only read the emails that refer to him by name. He wants to write a program
//    that gets a string (the email) and determines if his name "Alejandro" appears in that
//    string. if so it will output "read this mail" else it will output "don't read".
//    Sample Output:
//    input: "dear alejandro.....alot of text"
//    output: "read this mail"
//    input: "thunder blaz is the best drink in the galaxy..."
//    output: "don't read"
//    input: "subject: important project, Alejandro we refer to you this ...."
//    output: "read this mail"

    static void mailCheck(String string) {
        if(string.contains("alejandro")){
            System.out.println("read");
        }else {
            System.out.println("Dont read");
        }
    }

//    Question-9
//    In this task, you need to swap the first name with the last name in the email. If the email
//    doesn't contain underscore - do not anything.
//    Sample Output:
//    input: mike_tyson@gmail.com
//    output: tyson_mike@gmail.com
//    input: barakobama@gmail.com
//    output: barakobama@gmail.com (mailto:barakobama@gmail.com)


    static void swiftmail(String email) {
        String[] name=email.split("_");
        String[] surname=name[1].split("@");
        String reversename=surname[0]+"_"+name[0]+"@"+surname[1];
        System.out.println(reversename);
    }



    @Test
    void test1() {
        String x,y,str = "aaaa_bbb@dsadas";
        String[]name=str.split("_");
        System.out.println(name[0]);
        String[]mail=name[1].split("@");
        System.out.println(mail[1]);
    }


    @Test
    void test() {
        System.out.println(new AmzPage().getNumber("selenium"));
    }









//    Question-10
//    Write a program that will print out information about the user based on email. Print first
//    and last name from the upper case.
//    Sample Output:
//    Input: craig_federighi@apple.com
//    Output:
//    First name: Craig
//    Last name: Federighi
//    Domain: apple
//    Top-Level Domain: com










//    Question-11
//    We have a message variable already declared and assigned value in this format
//    Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programming and
//        problem solving}
//    Declare variables: sender, phoneNumber, messageBody
//    By using String methods: retrieve related information from SMS message string and
//    assign it to those 3 variables and print each variable in a separate line
//    Sample Output:
//    Sender: Mike Smith
//    Phone Number: 202-123-3456
//    Message body: I love programming and problem solving
//    Question-12
//            24.02.2020 Cybertek School | Learn
//    https://learn.cybertekschool.com/courses/309/assgnments/1238 7/11
//    Given a string word, if the first or last chars are 'x' or 'X', print the string without those 'x'
//    or 'X' chars, otherwise print the string unchanged.
//    Sample output:
//    input: xHiX
//    output: Hi
//    input: apple
//    output: apple
//    input: xUxL
//    output: UxL
//    input: JavaX
//    output: Java
//    Question-13
//    Write a program that will print out route instructions. Your program should take 2
//    parameters: start point and endpoint. Use left, right, up and down for navigation. Insert
//">" between commands. If start point equals to endpoint - display: "start/end(start or end
//    variable!) found".
//    Note: you may move only clockwise.
//    Sample Output:
//    Input: A
//    Input: D
//    Output: right > down > left: D found
//24.02.2020 Cybertek School | Learn
//    https://learn.cybertekschool.com/courses/309/assgnments/1238 8/11
//    Input: C
//    Input: C
//    Output: C found
//    Question-14
//    Write a program that will calculate car insurance premium.
//    Steps to write a program:
//    First things first, your program should ask the customer to provide a name, so display a
//    message: "Enter your name".
//    Then ask the user about ownership of the US driver's license. Display message: "Do you
//    have a US driver license?". If the user doesn't have a US driver's license - display
//    warning message: "Invalid data!" and stop the program (use System.exit(0) after
//    displaying warning message to stop the program).
//    Then ask the user to provide a zip code. If zip code equals to 20910 or 20740, add $60 to
//    the premium (an amount to be paid for an insurance policy).
//    If zip code equals to 22102 or 22103, add $30 to the premium. Otherwise, add $50 to the
//    premium.
//    Then ask the user about car ownership. Display message: "Is this vehicle Owned,
//    Financed, or Leased?". If the car is owned, add $10 to the premium, otherwise, add $20
//    to the premium.
//    Then ask the user about car usage. Display message: "How is this vehicle primarily
//    used?". If the car used for Business, add $50 to the premium. If the car is for pleasure
//    add $10 to the premium. If the car is for Commute - add $20 to the premium.
//    Then ask the user how many days per week user drives to work. Display message: "Days
//    Driven To Work And/Or School". Add $5 to the premium for every day driven to work.
//    Then, ask the user about how many miles customers drive to work or school. Display
//    message: "Miles Driven To Work And/Or School". Increase premium per $1 for every 1
//    mile.
//    Then ask the customer about his age. Display message: "How old are you?".
//    If age is less than 16, display the message: "Invalid data!", and stop the program.
//    If age is between 16 and 18 (exclusive), multiply premium by 20.
//    If age is between 18 (inclusive) and 21 (inclusive), multiply premium by 6.
//    If age is between 21 (exclusive) and 25 (exclusive), multiply premium by 2.
//            24.02.2020 Cybertek School | Learn
//    https://learn.cybertekschool.com/courses/309/assgnments/1238 9/11
//    Then, ask the customer about the driving experience. Make sure that experience is
//    greater than 0 and the result of subtraction age from experience is greater or equals to
//16. If no, display the message: "Invalid data!" and stop the program. Reduce premium on
//    $5 for every year of experience.
//    Then, ask the customer about car accidents. Display message: "Have you had any
//    accidents in the last 5 years?". If the answer equals "Yes" or "YES", ask customer about
//    amount of accidents. Display message: "How many?", in order to get information about
//    the amount of accidents. Add 20% to the premium price for every accident.
//    Then, ask the customer if he had continuous insurance for the past 12 months. Display
//    message: "Have you had continuous insurance for the past 12 months?". If the customer
//    provides a negative answer (No) - double the premium.
//    Then ask the user about the level of education. Display message: "What is the highest
//    level of education you have completed?".
//    If the level of education equals to "Ph.D." or "Bachelors" or "Masters" - reduce the
//    premium by 5%.
//    If the level of education equals "Doctors" reduce the premium by 10%.
//    If the level of education equals "Less than High School" increase the premium by 5%.
//    After all, display the message "customer, here's your quote!". Instead of the customer,
//    you need to insert customers' name. The display message: "Start Your Policy Today For:
//    $premium". Instead of premium, your program should print the premium's variable value.
//    Then display the message with reference number: "Reference number:
//    referenceNumber". In order to build reference number variable (referenceNumber),
//    concatenate first 2 letters of customer's name, age, last 2 letters of customer's name, zip
//    code, and level of education without spaces. This value should be all upper case!
//    Sample Output:
//    Display message: Welcome to the CountyFarm car insurance!
//    Display message: Enter your name
//    input from user: David
//    Display message: Do you have a US driver license?
//    input from user: Yes
//    Display message: Enter your zip code
//    input from user: 20910
//    Display message: Is this vehicle Owned, Financed, or Leased?
//            24.02.2020 Cybertek School | Learn
//    https://learn.cybertekschool.com/courses/309/assgnments/1238 10/11
//    input from user: Owned
//    Display message: How is this vehicle primarily used?
//    input from user: Pleasure
//    Display message: How old are you?
//    input from user: 25
//    Display message: How many years you've been driving?
//    input from user: 5
//    Display message: Have you had any accidents in the last 5 years?
//    input from user: No
//    Display message: Have you had continuous insurance for the past 12 months?
//    input from user: Yes
//    Display message: What is the highest level of education you have completed?
//    input from user: PhD
//    Display message: David, here's your quote!
//    Display message: Start Your Policy Today For: $52.25
//    Display message: Reference number: DA25ID20910PHD
//    Example #2
//    Display message: Welcome to the CountyFarm car insurance!
//    Display message: Enter your name
//    input from user: Robin Van Bobbin
//    Display message: Do you have a US driver license?
//    input from user: No
//    Display message: Invalid data!
//    Example #3
//    Display message: Welcome to the CountyFarm car insurance!
//    Display message: Enter your name
//    input from user: Max Payne
//    Display message: Do you have a US driver license?
//    input from user: Yes
//    Display message: Enter your zip code
//    input from user: 20740
//    Display message: Is this vehicle Owned, Financed, or Leased?
//    input from user: Owned
//    Display message: How is this vehicle primarily used?
//            24.02.2020 Cybertek School | Learn
//    https://learn.cybertekschool.com/courses/309/assgnments/1238 11/11
//    input from user: Commute
//    Display message: Days Driven To Work And/Or School
//    input from user: 5
//    Display message: Miles Driven To Work And/Or School
//    input from user: 10
//    Display message: How old are you?
//    input from user: 15
//    Display message: Invalid data!
//    Question-15
//    Print true if the string "cat" and "dog" appear the same number of times in the given string
//    word.
//    Sample Output:
//    input: catdog
//    output: true
//    input: catcat
//    output: false
//    input: cat-cheetah-dog-cat
//    output: false
}
