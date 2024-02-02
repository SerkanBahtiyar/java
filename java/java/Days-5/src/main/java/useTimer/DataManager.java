package useTimer;

import com.google.gson.Gson;
import models.AllProducts;
import models.Product;
import org.jsoup.Jsoup;

import java.util.TimerTask;

public class DataManager extends TimerTask {

    @Override
    public void run() {
        call();
    }

    public void call() {

        try {
            String url = "https://dummyjson.com/products";
            String stData = Jsoup.connect(url).timeout(15000).ignoreContentType(true).get().body().text();
            Gson gson = new Gson();
            AllProducts allProducts = gson.fromJson(stData, AllProducts.class);
            System.out.println( allProducts.getProducts().size() );
            for (Product item : allProducts.getProducts()) {
                System.out.println( item.getTitle() );
            }
        }catch (Exception ex) {
            System.err.println("Json Data Error: " + ex);
        }

    }
}
