package collection.set;

import lombok.extern.java.Log;

@Log
public class Emp implements  Comparable<Emp>{

    private int eid;
    private String name;
    private double salary;

    public Emp(int eid, String name, double salary) {
        this.eid = eid;
        this.name = name;
        this.salary = salary;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int hashCode() {
        log.info("hashCode");
        int result;
        long temp;
        result = eid;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result += System.nanoTime();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        log.info("equals");
        return true;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Emp{");
        sb.append("eid=").append(eid);
        sb.append(", name='").append(name).append('\'');
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Emp o) {
        Emp e1 = this;
        Emp e2 = o;
        if(e1.getSalary()>e2.getSalary()) return -1;
        else if(e1.getSalary()<e2.getSalary()) return 1;
        else return 0;
    }
}
