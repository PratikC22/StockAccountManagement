package Util;

import StockModel.Stock;
import java.util.Scanner;
import java.util.List;

public class UserInputOutput {

    private static final Scanner scanner = new Scanner(System.in);

    public static String getStockName() {
        System.out.println("Enter the stock name :");
        return scanner.next();
    }

    public static Double getStockPrice() {
        System.out.println("Enter the stock price :");
        return scanner.nextDouble();
    }

    public static Double getStockQuantity() {
        System.out.println("Enter the stock quantity :");
        return scanner.nextDouble();
    }



    public static int getUserChoice() {

        System.out.println("Press 1 - Add stock");
        System.out.println("Press 2 - View stock value");
        System.out.println("Press 3 - View total stock value");

        return scanner.nextInt();
    }

    public static String viewStock() {
        System.out.println("Enter stock name :");
        return scanner.next();
    }

    public static void display(List<Stock> stockList) {
        System.out.println(stockList);
    }
}
