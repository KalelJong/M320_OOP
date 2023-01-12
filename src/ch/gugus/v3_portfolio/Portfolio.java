package ch.gugus.v3_portfolio;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {

    private List<Stock> stockList = new ArrayList<>();
    private IStockMarket stockMarket;
    public Portfolio(IStockMarket stockMarket, List<Stock> stockList){
        this.stockList = stockList;
        this.stockMarket = stockMarket;
    }
    public void printStockPrices(){
        for (Stock stock :
                stockList) {
            stockMarket.printStockPrice(stock);
        }
    }
    public List<Stock> getStockList() {
        return stockList;
    }
}
