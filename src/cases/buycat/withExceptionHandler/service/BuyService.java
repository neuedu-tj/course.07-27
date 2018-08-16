package cases.buycat.withExceptionHandler.service;

import cases.buycat.withExceptionHandler.exception.LowStockException;
import cases.buycat.withExceptionHandler.handler.ResultBuilder;
import cases.buycat.withExceptionHandler.oo.Product;
import cases.buycat.withExceptionHandler.oo.Result;
import cases.buycat.withExceptionHandler.type.ResultEnum;

public class BuyService {

    //库存
    public static final Integer storage = 10;

    public Result buy(Product product , int amount) {

       try{
           if(storage - amount >= 0 ) {

               Result result = ResultBuilder.success(product);

               return result;
           } else if(  storage - amount  < 0 ) {
               throw new LowStockException(ResultEnum.ERROR_LOWSTOCK);
           }
       } catch (LowStockException e ) {
           Result result = ResultBuilder.error(e.getCode() , e.getMessage() );
           return result;
       }
       return null;
    }


}
