package unsorted;

public class Arr {
    static int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
    static int n = 10, min = 5;

    public static void main(String[] args) {
        for (int i = 0; i < n; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println(min);
    }
}
