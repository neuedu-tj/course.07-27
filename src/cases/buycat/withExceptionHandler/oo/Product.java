package cases.buycat.withExceptionHandler.oo;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@RequiredArgsConstructor
@ToString
public class Product {

    @NonNull  private int pid;
    @NonNull private String name;
    private String detail;
    @NonNull  private BigDecimal price;
}
