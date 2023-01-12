package ch.gugus.v3_portfolio;

import java.lang.annotation.Annotation;
import java.util.Hashtable;

public class NewYorkStockMarket implements IStockMarket{
    Hashtable<String, Double> stockPrices = new Hashtable<String, Double>();

    public NewYorkStockMarket(){
        stockPrices.put("Meta", 132.0);
        stockPrices.put("Microsoft", 235.77);
        stockPrices.put("Apple", 211.0);
    }

    @Override
    public double getStockPrice(Stock stock) {
        return stockPrices.get(stock.getCompanyName());
    }

    @Override
    public void printStockPrice(Stock stock) {
        System.out.println(stock.getCompanyName() + ": " + getStockPrice(stock) + " USD");

    }
}
