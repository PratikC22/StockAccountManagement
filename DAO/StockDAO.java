package DAO;

import StockModel.Stock;
import StockService.StockServiceInterface;

import java.util.List;

import java.util.ArrayList;

public class StockDAO implements StockServiceInterface {

    ArrayList<Stock> stockList = new ArrayList<>();
    @Override
    public void addStock(Stock stock) {
        stockList.add(stock);
    }

    @Override
    public void viewStockValue(String stockName) {
        for (Stock stock : stockList) {
            if (stock.getStockName().equals(stockName)) {
                double quantity = stock.getStockQuantity();
                double price = stock.getStockPrice();
                double stockValue = quantity * price;
                System.out.println(stockName + " " + " has value : " + " " + stockValue);
                System.out.println();
            }
        }
    }

    @Override
    public void viewTotalStockValue() {
        double totalStockValue = 0;
        for (Stock stock : stockList) {
            double quantity = stock.getStockQuantity();
            double price = stock.getStockPrice();
            double stockValue = quantity * price;
            totalStockValue += stockValue;
            System.out.println("Total stock value is " + totalStockValue);
            System.out.println();
        }
    }

    @Override
    public List<Stock> findAll() {
        return stockList;
    }
}
