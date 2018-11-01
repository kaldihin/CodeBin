//: net/mindview/util/SixTuple.java
package net.mindview.util;

public class SixTuple <A,B,C,D,E,F> extends FiveTuple<A,B,C,D,E> {
    public final E sixth;
    public SixTuple(A a, B b, C c, D d, E e, F f) {
        super(a, b, c, d, e);
        sixth = e;
    }
    public String toString() {
        return "(" + first + ", " + second + ", " +
                third + ", " + fourth + ", " + fifth + ", " + sixth + ")";
    }
} ///:~