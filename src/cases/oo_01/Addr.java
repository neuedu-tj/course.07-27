package cases.oo_01;

import lombok.Data;

@Data
public class Addr {

    private String code;
    private String detail;



    public Addr(String code, String detail) {
        this.code = code;
        this.detail = detail;
    }



}
