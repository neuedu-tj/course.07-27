package design.singleton.thead;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class Handler implements Runnable {

    Set<Connection> conns = new HashSet<>();

    @Override
    public void run() {
        Connection c = Connection.getInstance();
        conns.add(c);
    }



}
