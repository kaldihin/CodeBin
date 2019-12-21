package containers;

import java.util.*;

public class MapPerformance {
//    static Random rand = new Random();
//    static int reps = 1000;
    static List<Test<Map<Integer, Integer>>> tests = new ArrayList<>();
    static {
        tests.add(new Test<Map<Integer, Integer>>("put") {
            int test(Map<Integer, Integer> map, TestParam tp) {
                int loops = tp.loops;
                int listSize = tp.size;
                for (int i = 0; i < loops; i++) {
                    map.clear();
                    for (int j = 0; j < listSize; j++)
                        map.put(j, j);
                }
                return loops * listSize;
            }
        });
        tests.add(new Test<Map<Integer, Integer>>("get") {
            int test(Map<Integer, Integer> map, TestParam tp) {
                int loops = tp.loops;
                int span = tp.size * 2;
                for (int i = 0; i < loops; i++)
                    for (int j = 0; j < span; j++)
                        map.get(j);
                return loops * span;
            }
        });
        tests.add(new Test<Map<Integer, Integer>>("iterate") {
            int test(Map<Integer, Integer> map, TestParam tp) {
                int loops = tp.loops * 10;
                for (int i = 0; i < loops; i++) {
                    Iterator it = map.entrySet().iterator();
                    while (it.hasNext())
                        it.next();
                }
                return loops * map.size();
            }
        });
    }

    public static void main(String[] args) {
        if (args.length > 0)
            Tester.defaultParams = TestParam.array(args);
        Tester.run(new TreeMap<>(), tests);
        Tester.run(new HashMap<>(), tests);
        Tester.run(new LinkedHashMap<>(), tests);
        Tester.run(new IdentityHashMap<>(), tests);
        Tester.run(new WeakHashMap<>(), tests);
        Tester.run(new Hashtable<>(), tests);
    }
}
