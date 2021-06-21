package StockModel;

public class Stock {
    private String stockName;
    private double stockPrice;
    private double stockQuantity;

    @Override
    public String toString() {
        return "Stock{" +
                "stockName='" + stockName + '\'' +
                ", stockPrice=" + stockPrice +
                ", stockQuantity=" + stockQuantity +
                '}';
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public Double getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(Double stockPrice) {
        this.stockPrice = stockPrice;
    }

    public Double getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(Double stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
}
