package generics;

import net.mindview.util.*;

class Amphibian {}
class Vehicle {}

public class TupleTest {
    static TwoTuple<String, Integer> f() {
        return new TwoTuple<>("hi", 47);
    }
    static ThreeTuple<Amphibian, String, Integer> g() {
        return new ThreeTuple<>(new Amphibian(), "hi", 47);
    }
    static FourTuple<Vehicle, Amphibian, String, Integer> h() {
        return new FourTuple<>(new Vehicle(), new Amphibian(), "hi", 47);
    }
    static FiveTuple<Vehicle, Amphibian, String, Integer, Double> k() {
        return new FiveTuple<>(new Vehicle(), new Amphibian(), "hi", 47, 11.1);
    }
    static SixTuple<Vehicle, Amphibian, Amphibian, String, Integer, Double> l() {
        return new SixTuple<>(new Vehicle(), new Amphibian(), new Amphibian(), "You", 56, 67.8);
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> ttsi = f();
        System.out.println(ttsi);
        //ttsi.first = "there";
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
        System.out.println(l());
    }
}
