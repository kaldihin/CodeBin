package strings;

public class Format4types {
    private int integer;
    private long longValue;
    private float floatValue;
    private double doubleValue;

    public Format4types(int i, long l, float f, double d) {
        integer = i;
        longValue = l;
        floatValue = f;
        doubleValue = d;
    }
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("%d ", integer));
        res.append(String.format("%d ", longValue));
        res.append(String.format("%.2f ", floatValue));
        res.append(String.format("%.10f ", doubleValue));
        return res.toString();
    }

    public static void main(String[] args) {
        Format4types f = new Format4types(3, 56700000, 5.7f, 3.785659443);
        System.out.println(f);
    }
}
