import java.util.Random;
import java.util.random.*;
import java.util.Arrays;



import java.util.Scanner;
class main{
    public static void main(String [] args){


        Scanner sc = new Scanner(System.in);
        boolean cont = true;

        System.out.println("--------Salam--------");
        String command;
        

        while (cont){
            System.out.println("1. Find the max and the min");
            System.out.println("2. Find the average and  how each element of the array differs from the average");
            System.out.println("3. Find the sum of elements with odd- and even-numbered indexes. ");
            System.out.println("4. End");
            System.out.println("Choose an operation:");

        command = sc.nextLine();

        switch (command){
            case "1":

            break;
            case "2":

            break;
            case "3":

            break;
            case "4":
                cont = false;
            break;
            default:
                System.out.println("Choose a valid operation!");
        }

        }


        System.out.println("End!");
    }

    int[] diff(int[] arr){
        int av = 0;
        for(int i = 0; i < arr.length; i++){
            av+=arr[i];
        }
        av/=arr.length;
        for(int i = 0; i < arr.length; i++){
            arr[i]-=av;
        }
        return arr;
    }
    public static int findMinimum(int[] Array) {
        int minimum = 101; // Define minimum with default value

        // Iterate through the entire array and find the minimum element
        for (int i = 0; i < Array.length; i++) {
            // Get current element
            int currentElement = Array[i]; 

            // if current element is less than minimum, set minimum to currentElement
            if ( currentElement < minimum) {
                minimum = currentElement;
            }
        }

        return minimum;
    }

    public static int findMaximum(int[] Array) {
        int maximum = 0; // Define minimum with default value

        // Iterate through the entire array and find the minimum element
        for (int i = 0; i < Array.length; i++) {
            // Get current element
            int currentElement = Array[i];

            // if current element is less than minimum, set minimum to currentElement
            if ( currentElement < maximum) {
                maximum = currentElement;
            }
        }

        return maximum;
    }
    public String sumOfEvenOrOdd(int[] array) {
        int sumE = 0;
        int sumO = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sumE+=array[i];
            }
            else {
                sumO +=array[i];
            }
        }
       return "The even sum: " + sumE + "\n" + "The odd sum: " + sumO;
    } public static int[] array_maker(int size){
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(101);
        }
        return arr;
    }
    public static int[] array_maker(int size){
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(101);
        }
        return arr;
    }
} 
