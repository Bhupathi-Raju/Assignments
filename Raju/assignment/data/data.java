package Raju.assignment.data;

/**
 * Created by zemoso on 27/6/17.
 */
public class data {
    public int a;
    public char b;
    public void print ()
    {
        System.out.println(a);
        System.out.println(b);
    }
    /*public void print2() 
    {
        int c,d;
        System.out.println(c);
        System.out.println(d);
    }*/
}

/*Explanation : 
In the above code, the blocked part of the code gives compile time error becuase the variables c & d were not initialised. Default
initialisation in Java takes place only in fields that are in a class but not that are in a method. In the above code, a & b gets 
initialised but not c & d.*/
