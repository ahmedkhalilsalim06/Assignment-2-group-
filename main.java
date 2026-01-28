
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


    public class main {
        public static void main(String[] args) {
            
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
    }

}