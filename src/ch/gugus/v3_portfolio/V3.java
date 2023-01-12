package ch.gugus.v3_portfolio;

import java.util.ArrayList;
import java.util.List;

public class V3 {
    public void run(){
        Stock apple = new Stock("Apple");
        Stock microsoft = new Stock("Microsoft");
        Stock meta = new Stock("Meta");

        List<Stock> stocks = new ArrayList<>();
        stocks.add(apple);
        stocks.add(microsoft);
        stocks.add(meta);

        Portfolio nycPortfolio = new Portfolio(new NewYorkStockMarket(), stocks);
        nycPortfolio.printStockPrices();
        System.out.println("==================================================");
        Portfolio zrhPortfolio = new Portfolio(new ZurichStockMarket(), stocks);
        zrhPortfolio.printStockPrices();
    }
}
