package JavaReview.Assignments;

import org.testng.annotations.Test;

public class Assignment_10 {

    public static void main(String[] args) {

    }
//    Assignment-10
//    Due No Due Date Points 0 Submitting a text entry box
//    Submit Assignment
//    Question-16
//    Given a string word, print true if "java" appears starting at index 0 or 1 in the string, such
//    as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string should be 4 and more
//    characters.
//    Sample Output:
//    input: javapython
//    output: true
//    input: cjavac++
//    output: true
//    input: c#javaruby
//    output: false
//    Question-17
//    Write a program that will print out letters in the alphabetic order accordingly to the given
//    range within 2 chars.
//    Sample Output:
//    input: A
//    input: Z
//    output: ABCDEFGHIJKLMNOPQRSTUVWXYZ
//    input: a
//    input: f
//    output: abcdef
//    input: a
//    input: d
//    output: abcd
//24.02.2020 Cybertek School | Learn
//    https://learn.cybertekschool.com/courses/309/assgnments/1239 2/7
//    input: B
//    input: O
//    output: BCDEFGHIJKLMNO
//    Question-18
//    Given two strings, word and a separator sep, return a big string made of count
//    occurrences of the word, separated by the separator string.
//    Sample Output:
//    input: Word
//    input: X
//    input: 3
//    output: WordXWordXWord
//    input: This
//    input: And
//    input: 2
//    output: ThisAndThis
//    input: This
//    input: And
//    input: 1
//    output: This
//    Question-19
//    Return the number of times that the string "java" appears anywhere in the given string
//    word.
//    Sample Output:
//    input: javaxjava
//    output: 2
//    input: javaxjavaapplepearjavaegg
//    output: 3
//    Question-20
//    In mathematics, the factorial of a positive integer n, denoted by n!, is the product of all
//    positive integers less than or equal to n. Calculate factorial and output result to the
//24.02.2020 Cybertek School | Learn
//    https://learn.cybertekschool.com/courses/309/assgnments/1239 3/7
//    console.
//    Sample Output:
//    input: 5
//    output: 120
//    Question-21
//    Given a string, consider the prefix string made of the first n chars of the string. Does that
//    prefix string appear somewhere else in the string?
//    Assume that the string is not empty and that n is in the range from 1 till str.length().
//    Sample Output:
//    input: abXYabc
//    input: 1
//    output: true
//    a appears twice
//    input: abXYabc
//    input: 2
//    output: true
//    ab appears twice
//    input: abXYabc
//    input: 3
//    output: false
//    abX appears once only
//    Question-22
//            24.02.2020 Cybertek School | Learn
//    https://learn.cybertekschool.com/courses/309/assgnments/1239 4/7
//    Hypertext Markup Language (HTML) is the standard markup language for creating web
//    pages and web applications. HTML is the language in which most websites are written.
//    HTML is used to create pages and make them functional.
//    Write a program, that will read HTML variable and output attribute value of id attribute
//            (tag) into the console. Input will be provided in a single line as outlined below. If HTML
//    variable doesn't contain <html> attribute, print out into the console message: "Invalid
//    input!".
//    Sample Output:
//    input: <!DOCTYPE html><html><head><title>Java</title></head><body><p
//    id="myid"></p></body></html>
//    output: myid
//    Question-23
//    A sandwich is two pieces of bread with something in between. Print the string that is
//    between the first and last appearance of "bread" in the given string, or return string
//"nothing" if there are not two pieces of bread.
//    Sample Output:
//    input: breadjambread
//    output: jam
//    input: xxbreadjambreadyy
//    output: jam
//24.02.2020 Cybertek School | Learn
//    https://learn.cybertekschool.com/courses/309/assgnments/1239 5/7
//    input: xxbreadapple
//    output: nothing
//    input: breadbutterbread
//    output: butter
//    Question-24
//    Given a string, print out true if the number of appearances of "java" anywhere in the string
//    is equal to the number of appearances of "python" anywhere in the string (case
//                                                                              sensitive).
//    Sample Output:
//    input: We study java not python
//    output: true
//    input: What's the difference between java, javascript and python?
//    output: false
//    Question-25
//    When gears merge and work together, one tooth from each one goes in order.
//    Write a method mergeStrings that will return the strings merged, one letter at a time,
//    starting with one. Please note one and two can be of different lengths. Please look at
//    below examples:
//    s1 ==> "12345"
//    s2 ==> "abcde"
//    mergeStrings(s1,s2) ==> "1a2b3c4d5e"
//    mergeStrings("wooden", "spoon") ==> "wsopoodoenn"
//    mergeStrings("java", "selenium") ==> "jsaevlaenium"
//    Question-26
//    uniqueChars is a method that you will code now, should be able to accept any string in
//    the word and return unique characters from the parameter.
//    Sample Output:
//    uniqueChars("java") ==> "jav"
//    uniqueChars("mama") ==> "ma"
//            24.02.2020 Cybertek School | Learn
//    https://learn.cybertekschool.com/courses/309/assgnments/1239 6/7
//    uniqueChars("spoon") ==> "spon"
//    Question-27
//    coverString method will take 2 string parameters from the caller.
//    Your job is to write an important code that will :
//            - to search and find each appearance of coverME within main
//- then surround it with [coverMe] (square brackets)
//            - if you cannot find the coverME within main after tirelessly looping then just return whole
//    main itself covered [main].
//            - keep in mind that coverME value can be of any length.
//    Sample Output:
//    coverString("java methods", "me") ) ; ==> "java [me]thods"
//    coverString("Certified Wooden Spoon", "o") ) ; ==> "Certified W[o][o]den Sp[o][o]n"
//    coverString("hello hello", "ello") ) ; ==> "h[ello] h[ello]"
//    coverString("apples", "pears") ) ; ==> "[apples]"
//    Question-28
//    This method gets two strings (text and badWord) and returns a string. Basicly what it
//    does is take out all the occurrences of badWord in text.
//    Sample Output:
//    clean ("one two three","two")
//    returns "one three"
//    clean ("foo bar","foo")
//    returns "bar"
//    clean ("he said bla bla bla","bla")
//    returns "he said "

    static String minus(String actualString, String delete) {

        String newString =actualString.replaceAll(delete,"");
        return newString;
    }


    @Test
    void test1() {
        String m = "deneme yanilma";
        String a=m.replaceAll("deneme","");
        System.out.println(a);
    }



//    Question-29
//    This method gets a string and an int, it returns a string. What it does is to limit the
//    inputted string to a creating number of characters.
//    Sample Output:
//            24.02.2020 Cybertek School | Learn
//    https://learn.cybertekschool.com/courses/309/assgnments/1239 7/7
//    limit("abcd",2)
//    returns "ab"
//    limit("bla bla",3)
//    returns "bla"
//    Question-30
//    at3 method gets two strings and returns a string. The first string is the one that will be
//    manipulated. At the 3rd char position of the target you will insert the word argument.
//    Sample output:
//    at3("longword","foo")
//return: "lonfoogword"
//    at3("blabla","a")
//return: "blaabla"
//    Question-31
//    Palindrome is a word, phrase, or sequence that reads the same backward as forward,
//    e.g., madam or nurses run.
//    So method isPalindrome checks that and returns true if check is palindrome and false if it
//    is not.
//            - make your conditions case insensitive. ex: Civic and civic are both palindromes
//- make your conditions space insensitive. Race car is a palindrome even though there is
//    space in between.
//    Sample Output:
//    isPalindrome("Noon") ==> true
//    isPalindrome("I am not palindrome") ==> false
//    isPalindrome("wooden") ==> false
//    isPalindrome("Nurses Run") ==> true
}

