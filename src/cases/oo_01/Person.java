package cases.oo_01;

import lombok.Data;

import java.util.Arrays;

@Data
public class Person {

    //性别、年龄、婚否、身份证号、地址、电话、伴侣、女朋友   gf
    private String id;   // ?
    private String name;
    private int gender;
    private boolean isMarried;
    private String tel;

    private Addr[] addr;

    private Person[] gf;

    private Person duixiang;



    //提供结婚的方法.


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", gender=").append(gender);
        sb.append(", isMarried=").append(isMarried);
        sb.append(", tel='").append(tel).append('\'');
        sb.append(", addr=").append(Arrays.toString(addr));
        sb.append(", gf=").append(Arrays.toString(gf));
        sb.append(", duixiang=").append(duixiang);
        sb.append('}');
        return sb.toString();
    }
}
