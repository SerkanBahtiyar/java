package models;

import lombok.Data;
import java.util.List;

@Data
public class AllProducts {
    private List<Product> products;
    private long total;
    private long skip;
    private long limit;
}
