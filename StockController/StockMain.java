/**
 * This program reads in stock names, number of shares, share price and outputs total value
 * of each stock and total value of stock.
 *
 * @author Pratik Chaudhari
 * @since 21/06/2021
 */
package StockController;

import StockModel.Stock;
import StockService.StockService;
import Util.UserInputOutput;

public class StockMain {
    public static void main(String[] args) {

        StockService stockService = new StockService();

        while (true) {
            int choice = UserInputOutput.getUserChoice();

            switch (choice) {
                case 1 -> {
                    Stock stock = readDataFromConsole();
                    stockService.addStock(stock);
                }
                case 2 -> {
                    String stockName = UserInputOutput.viewStock();
                    stockService.viewStockValue(stockName);
                }
                case 3 -> stockService.viewTotalStockValue();
                default -> System.out.println("Invalid choice");
            }
        }
    }

    public static Stock readDataFromConsole() {
        Stock stock = new Stock();
        System.out.println("Add stock");

        String name = UserInputOutput.getStockName();
        stock.setStockName(name);

        double price = UserInputOutput.getStockPrice();
        stock.setStockPrice(price);

        double quantity = UserInputOutput.getStockQuantity();
        stock.setStockQuantity(quantity);

        return stock;
    }
}
