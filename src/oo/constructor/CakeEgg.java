package oo.constructor;

import lombok.Data;

@Data
public class CakeEgg {

    private int egg;
    private boolean  isLa;
    private int jiPai;

    public CakeEgg() {

    }

    public CakeEgg(int egg , boolean isLa , int jiPai) {
        this.egg = egg;
        this.isLa = isLa;
        this.jiPai = jiPai;
    }

    public CakeEgg(int egg ) {
        this.egg = egg;
        this.isLa = false ;
        this.jiPai = 1;
    }

}
