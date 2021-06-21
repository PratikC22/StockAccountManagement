package StockService;

import DAO.StockDAO;
import StockModel.Stock;
import java.util.List;

public class StockService implements StockServiceInterface {
    StockDAO stockDAO = new StockDAO();

    @Override
    public void addStock(Stock stock) {
        stockDAO.addStock(stock);
    }

    @Override
    public void viewStockValue(String stockName) {
        stockDAO.viewStockValue(stockName);
    }

    @Override
    public void viewTotalStockValue() {
        stockDAO.viewTotalStockValue();
    }

    @Override
    public List<Stock> findAll() {
        return stockDAO.findAll();
    }
}
