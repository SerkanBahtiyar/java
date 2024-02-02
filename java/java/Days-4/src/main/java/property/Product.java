package property;

import lombok.Data;
import lombok.Setter;

@Data
public class Product {

    private int pid;
    private String title;
    private String detail;
    private int price;
    private boolean status;

}
