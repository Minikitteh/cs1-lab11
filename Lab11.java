import java.util.Scanner;

public class lab11 {

    /********************************************************
     * Below are the methods you will be able to use in
     * your main method
     * All of these methods are from Labs 3 and 5
     * so you are already familiar with their functionalities
     * This lab is about learning how to use them as 
     * standalone methods
     *********************************************************/
    
    /***** Method Lab11a *************************************/
    public static int functionality11A(String s) {	//this method tests out strings, and checks whether the string inputted has an 'a'
        if (s.length() == 0) return 0;				//the recursive part of this method checks every character in the string for an 'a', it checks the first character up to when it finds an 'a'
        if (s.charAt(0) == 'a') return 1 + functionality11A(s.substring(1)); //code will return 1 if an 'a' is found, it doesn't need to check the whole string, if it already finds an 'a'
        return functionality11A(s.substring(1)); //the code will retun a '0' (base case) if the string length is 0 or if it doesn't find an 'a' within the characters
    }

    /***** Method Lab11b *************************************/
    public static String functionality11B(String s) {	//this method takes a string and returns the string reversed
        if (s.length() == 0) return "";				//it takes the first character of the string and puts it at the end of the string, until there is no more left (base case)
        return functionality11B(s.substring(1)) + s.charAt(0);
    }

    /***** Method Lab11c *************************************/
    public static Boolean functionality11C(String s) { //this method is pretty much the same as 11a, because it checks the string for a 'z' at every character until it finds it
        if (s.length() == 0) return false; //the method will return false if it doesn't find a 'z' and true if it does
        if (s.charAt(0) == 'z') return true;
        return functionality11C(s.substring(1));
    }

    /***** Method Lab11d *************************************/
    public static int functionality11D(int[] A, int start) { //this method multiplies the array with it's first element times the element next to it, that is next ot it and so on
        if (start >= A.length) return 0; //base case, tells it when to stop, once you have finished going thru the array
        if (start == A.length-1) return A[A.length-1]; //states if the beginning it equal to the last element in the array return the last element in the array
        return A[start] * functionality11D(A, start+1); //the action, multiply the first element in the array times the next element in the array and so on
    }

    /************************************************
     * The main method is provided to you so that you
     * can observe the execution of the methods provided 
     * to you.
     * You are not expected to modify the main method.
     ************************************************/
    public static void main(String[] args) {

        String s1 = "abc";
        String s3 = "abcdefg";
        String s4 = "omnom";
        String s5 = "";
        String s6 = "zzzz";
        String s7 = "  z";
        int[] A = {2,7,8,3,5,9};
        int[] B = {3,5,1,9};
        int[] C = {2,45,100,0,4};
        
        /******** Testing method functionality11A ********/
        System.out.println("The result of applying the 1st functionality on \"abc\" is: " + functionality11A(s1));
        System.out.println("The result of applying the 1st functionality on \"abcdefg\" is: " + functionality11A(s3));
        System.out.println("The result of applying the 1st functionality on \"omnom\" is: " + functionality11A(s4));
        System.out.println("The result of applying the 1st functionality on \"\" is: " + functionality11A(s5));
        System.out.println();
       
        /******** Testing method functionality11B ********/
        System.out.println("The result of applying the 2nd functionality on \"abc\" is: " + functionality11B(s1));
        System.out.println("The result of applying the 2nd functionality on \"abcdefg\" is: " + functionality11B(s3));
        System.out.println("The result of applying the 2nd functionality on \"omnom\" is: " + functionality11B(s4));
        System.out.println("The result of applying the 2nd functionality on \"\" is: " + functionality11B(s5));
        System.out.println();
       
        /******** Testing method functionality11C ********/
        System.out.println("The result of applying the 3rd functionality on \"abc\" is: " + functionality11C(s1));
        System.out.println("The result of applying the 3rd functionality on \"\" is: " + functionality11C(s5));
        System.out.println("The result of applying the 3rd functionality on \"zzzz\" is: " + functionality11C(s6));
        System.out.println("The result of applying the 3rd functionality on \"  z\" is: " + functionality11C(s7));
        System.out.println();
        
        /******** Testing method functionality11D ********/
        System.out.println("The result of applying the 4th functionality on {2,7,8,3,5,9} is: " + functionality11D(A,0));
        System.out.println("The result of applying the 4th functionality on {3,5,1,9} is: " + functionality11D(B,0));
        System.out.println("The result of applying the 4th functionality on {2,45,100,0,4} is: " + functionality11D(C,0));
        System.out.println();
        
    }
        
}