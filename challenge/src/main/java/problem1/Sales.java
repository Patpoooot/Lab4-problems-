package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        // a globale positon for the scanner
        Scanner scan = new Scanner(System.in);

        // Ask the user to enter the number of selespeople
        System.out.println("Enter the number of SalesPeople : ");
        final int SALESPEOPLE = scan.nextInt();
        int[] sales = new int[SALESPEOPLE];
        int sum;

        // maxId and maxSale needed for traking the max saleperson
        int maxId = -1;
        int maxSale = 0;

        // minId and minSale needed for traking the min saleperson
        int minId = -1;
        int minSale = Integer.MAX_VALUE;

        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i+1) + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        for (int i=0; i<sales.length; i++)
        {

            // the conditon to find the max\min elements
            if (sales[i] >= maxSale) {
                maxId = i;
                maxSale = sales[i];
            } if (sales[i] <= minSale) {
                minId = i;
                minSale = sales[i];
            }

            System.out.println(" " + (i+1) + " " + sales[i]); // the modificatoin so the ids run form 1-5 is to increment i by one while printing
            sum += sales[i];
        }
        System.out.println("\nTotal sales: " + sum);
        
        //Average sale
        System.out.println("\nAverage sales: " + sum/sales.length);

        //Max saleperson
        System.out.println("\nSalesperson " + (maxId+1) + " had the highesst sale with $" + maxSale);

        //Min saleperson
        System.out.println("\nSalesperson " + (minId+1) + " had the lowest sale with $" + minSale);

        // Salepersons of value abouve given by user
        System.out.println("\nEnter an integer value : ");
        int v = scan.nextInt();
        System.out.println("\nSalesperson whoes sales exceeded ur given value are : ");
        System.out.println("--------------------------------------------------------");
        int counter = 0;

        for(int i=0; i<sales.length; i++) {
            if (sales[i] > v) {
                System.out.println(" " + (i+1) + " " + sales[i]);
                counter++;
            }
        }

        System.out.println("\nIn a total of : " + counter + " Salepersons.");
    }
}