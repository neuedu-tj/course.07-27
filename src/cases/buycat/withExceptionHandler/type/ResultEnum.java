package cases.buycat.withExceptionHandler.type;

public enum ResultEnum {

    SUCCESS(1 , "ok ") ,
    ERROR_UNKNOWN(-1 , "unknow error"),
    ERROR_LOWSTOCK(2 , " low stock error ");


    private Integer code;
    private String msg;

    ResultEnum(Integer code , String msg ) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
