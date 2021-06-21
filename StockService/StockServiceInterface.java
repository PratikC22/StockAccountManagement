package StockService;

import StockModel.Stock;

import java.util.List;

public interface StockServiceInterface {

    void addStock(Stock stock);
    void viewStockValue(String stockName);
    void viewTotalStockValue();

    List<Stock> findAll();
}
