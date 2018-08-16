package cases.buycat.withExceptionHandler.handler;

import cases.buycat.withExceptionHandler.oo.Product;
import cases.buycat.withExceptionHandler.oo.Result;
import cases.buycat.withExceptionHandler.type.ResultEnum;

public class ResultBuilder {


    public static Result success(Product product) {
        Result result = new Result(ResultEnum.SUCCESS);
        result.setProduct(product);
        return result;
    }

    public static Result error( Integer code , String msg ) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }



}
