package cases.oo_01;

import lombok.Data;

import java.util.Arrays;

@Data
public class Person {

    //性别、年龄、婚否、身份证号、地址、电话、伴侣、女朋友   gf
    private String id;   // ?
    private String name;
    private Integer gender;
    private boolean isMarried;
    private String tel;

    private Addr[] addr;

    private Person[] gf;

    private Person duixiang;


    //提供检查方法
    public boolean isIllegality(Person person) {

        Person self = this;
        Person target = person;

        boolean flag_self = false;
        boolean flag_target = false;

        if(!self.isMarried && (self.getGf()==null || self.getGf().length <1 ) ) {
            flag_self = true;
        }

        if(!target.isMarried && (target.getGf()==null || target.getGf().length <1 ) ) {
            flag_target = true;
        }

        if(!flag_self) {
            System.out.println(self.getName()+"不靠谱");
            return flag_self;
        } else if( !flag_target) {
            System.out.println(target.getName()+" 不靠谱");
            return flag_target;
        } else {
            System.out.println("百年修得同船渡 ，千年修得共枕眠 , 恭喜新人 . ");
            return true;
        }


    }


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
