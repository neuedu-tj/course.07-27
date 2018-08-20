package collection.list.compare;

import java.io.Serializable;
import java.util.Comparator;

public class StuCompare implements Comparator<Stu> , Serializable {
    @Override
    public int compare(Stu o1, Stu o2) {
        Stu s1 = o1;
        Stu s2 = o2;
        if(s1.getScore()>s2.getScore()) return -1;
        else if (s1.getScore()<s2.getScore()) return 1;
        else return 0;
    }
}
