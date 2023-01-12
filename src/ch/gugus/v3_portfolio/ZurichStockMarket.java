package ch.gugus.v3_portfolio;

import java.lang.annotation.Annotation;
import java.util.Hashtable;

public class ZurichStockMarket implements IStockMarket{
    Hashtable<String, Double> stockPrices = new Hashtable<String, Double>();

    public ZurichStockMarket(){
        stockPrices.put("Meta", 123.91);
        stockPrices.put("Microsoft", 219.81);
        stockPrices.put("Apple", 196.72);
    }

    @Override
    public double getStockPrice(Stock stock) {
        return stockPrices.get(stock.getCompanyName());
    }

    @Override
    public void printStockPrice(Stock stock) {
        System.out.println(stock.getCompanyName() + ": " + getStockPrice(stock) + " CHF");
    }

}
