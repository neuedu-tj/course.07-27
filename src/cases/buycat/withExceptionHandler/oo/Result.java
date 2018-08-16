package cases.buycat.withExceptionHandler.oo;


import cases.buycat.withExceptionHandler.type.ResultEnum;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Result {

    private int code;
    private String msg ;
    private Product product;

    public Result() {

    }

    public Result(ResultEnum resultEnum) {
        this.code = resultEnum.getCode();
        this.msg = resultEnum.getMsg();
    }


}
