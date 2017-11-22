import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("\t***LEARN MULTIPLICATION TABLES IN STYLE***");
        
        System.out.println("\tenter the number you want to learn table of :");
        int N = in.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println("\t" +  N + " X " + i+" = " +  N*i);
            System.out.println();
        }
    }
}