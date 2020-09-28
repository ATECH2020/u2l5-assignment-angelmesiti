import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
      Scanner in = new Scanner(System.in);
      
      double lumberCost = 8;
      double windowCost = 11;
      double taxRate;
      double total;
      int boards;
      int windows;

      System.out.println("Enter the sales tax rate: ");
      taxRate = in.nextDouble();

      System.out.println("How many boards do you need? ");
      boards = in.nextInt();

      System.out.println("How many windows do you need? ");
      windows = in.nextInt();

      Construction bobby = new Construction(lumberCost, windowCost, taxRate);

      total = bobby.lumberCost(boards) + bobby.windowCost(windows);
      System.out.println("Total: " + total);

      System.out.print("Grand Total: " + bobby.grandTotal(total));
    
    }
}
