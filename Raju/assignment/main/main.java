package Raju.assignment.main;

import Raju.assignment.data.data;
import Raju.assignment.singleton.singleton;

/**
 * Created by zemoso on 27/6/17.
 */
public class main {
    data a = new data();
    void call () {
        a.print();
        a.print2();
        String f= "Raj";
        singleton g=singleton.method(f);
        g.print();
    }

}
