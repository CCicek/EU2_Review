package JavaReview.InterviewQuestions;

import java.util.Arrays;
import java.util.Collections;

public class Frequency_of_Characters {


//    Write a return method that can find the frequency of characters
//
//    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

    public static void main(String[] args) {
        System.out.println(Foc("deeenniiiiii"));
        Foc("deeenniiiiii");
    }

    static String Foc(String str) {


            String nonDup="", result="";

            for(int i=0; i < str.length(); i++)

                if(! nonDup.contains(""+str.charAt(i)))

                    nonDup += ""+str.charAt(i);


            for(int i=0; i < nonDup.length(); i++) {

                // method counts the frequency of the specified element in the given list.
                int num = Collections.frequency( Arrays.asList(str.split("") ) ,    ""+nonDup.charAt( i ) );

                result += ""+nonDup.charAt(i) + num;

            }

        return result;
    }

}
