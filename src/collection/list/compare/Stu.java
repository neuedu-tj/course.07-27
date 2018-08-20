package collection.list.compare;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@RequiredArgsConstructor
@ToString
public class Stu /*implements Comparable<Stu>*/ {


    @NonNull private int id;
    @NonNull private String name;
    @NonNull private double score;

//    @Override
//    public int compareTo(Stu o) {
//        Stu s1 = this;
//        Stu s2 = o;
//        if(s1.getScore()>s2.getScore()) return -1;
//        else if (s1.getScore()<s2.getScore()) return 1;
//        else return 0;
//    }


}
