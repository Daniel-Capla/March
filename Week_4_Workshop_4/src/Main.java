import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner (System.in);

        System.out.println("Please submit any number until 100");

        int numberUserAdd = sc.nextInt();


        sumCount(numberUserAdd);


    }


    public static void sumCount(int numberAdd) {

        int i;
        int sum = 0;
        for (i=1; i<=numberAdd; i++) {

            sum = sum + i;
        }

        System.out.println("The sum of all the numbers until your number is " + sum);



    }
}
