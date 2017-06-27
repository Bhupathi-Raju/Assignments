package Raju.assignment.singleton;

/**
 * Created by zemoso on 27/6/17.
 */
public class singleton {
    String s;

    public static singleton method(String b) {
        singleton a = new singleton();
        a.s=b;
        return a;
    }
    public void print()
    {
        System.out.println(s);
    }
}
