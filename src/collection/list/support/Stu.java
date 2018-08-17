package collection.list.support;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.Objects;


public class Stu {

    private int id;
    private String name;

    public Stu(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
       Stu s1 = this;
       Stu s2 = (Stu)o;
       if(s1.id == s2.id) return true;
       else return false;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Stu{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
