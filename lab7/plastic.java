package lab7;

import java.util.*;

class TwoD{
 int a,b;

 void calc(int c, int d){
 a = c;
 b = d;
    System.out.println("The cost of the 2D plastic is :" + (40*a*b)+ "rs");;
 }

}

class ThreeD extends TwoD{
    int x,y,z;

    void calc (int e, int f, int g){
        x = e;
        y = f;
        z = g;
        System.out.println("The cost of the 3D plastic is " + (60*x*y*z) + "rs");
    }
}

public class plastic {
    public static void main(String args[]){

    ThreeD t = new ThreeD();
    t.calc(10,30);
    t.calc(40,50,60);
    }

 }
