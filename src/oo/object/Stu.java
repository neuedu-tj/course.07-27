package oo.object;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.Date;
import java.util.Objects;

@Data
@RequiredArgsConstructor
public class Stu {

   @NonNull  private Integer id;
   @NonNull  private String name;
   private double score;

    @Override
    public boolean equals(Object o) {
        Stu s1 = this;
        Stu s2 = (Stu)o;

        if(s1.getId() == s2.getId()) return true;
        else return false;
    }


}
