package unsorted;

import java.util.*;

public class MakeComplement {
    public static void main(String[] args) {
//        System.out.println(makeComplement("ATTGC"));
//        int[] a = new int[]{14,14,14,5,14,14,14};
//        int[] a1 = new int[]{5,1,1};
//        System.out.println(stray(a));
//        System.out.println(stray(a1));
//        System.out.println(isValid(new char[] {'n','n','n','s','n','s','n','s','n','s'}));
//        System.out.println(solution(10));
//        System.out.println(expandedForm(12));
//        System.out.println(expandedForm(120037));
//        HiIsClone hs = new HiIsClone();
//        HiIsClone obj = hs.clone();
//        System.out.println(obj.str);
//        System.out.println(obj.sc.a);
//        obj.str = new StringBuilder("656856856");
//        System.out.println(obj.str);
//        System.out.println(hs.str);
//        System.out.println(high("man i need a taxi up to ubud"));
//        System.out.println(duplicateCount("indivisibility"));
//        System.out.println(encrypting("Position is true or", 1));
//        System.out.println(decrypting(" uts otsPoer iniior", 10));
        System.out.println(Arrays.toString(dirReducListR(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST", "WEST"})));
        System.out.println(Arrays.toString(dirReducListR(new String[]{"NORTH", "WEST" ,"SOUTH" ,"EAST" })));
    }

    static String[] dirReduc(String[] arr) {
        String[] array = null;
        int north = 0, south = 0, east = 0, west = 0, sum;
        for (String str : arr) {
            if (str.equals("NORTH")) {
                north++;
            }
            if (str.equals("SOUTH")) {
                south++;
            }
            if (str.equals("EAST")) {
                east++;
            }
            if (str.equals("WEST")) {
                west++;
            }
        }
        sum = north + south + east + west;
        if (sum > 0) {
            while (north > 0 && south > 0) {
                north--;
                south--;
            }
            while (east > 0 && west > 0) {
                east--;
                west--;
            }
            sum = north + south + east + west;
            array = new String[sum];
            for (int i = 0; i < sum; i++) {
                if (north > 0) {
                    array[i] = "NORTH";
                    north--;
                } else if (south > 0) {
                    array[i] = "SOUTH";
                    south--;
                } else if (east > 0) {
                    array[i] = "EAST";
                    east--;
                } else if (west > 0) {
                    array[i] = "WEST";
                    west--;
                }
            }
        }
        return array;
    }

    static String[] dirReducList(String[] arr) {
        List<String> list = new LinkedList<String>(Arrays.asList(arr));
        while (list.contains("NORTH") && list.contains("SOUTH")) {
            list.remove("NORTH");
            list.remove("SOUTH");
        }
        while (list.contains("EAST") && list.contains("WEST")) {
            list.remove("EAST");
            list.remove("WEST");
        }
        String[] array = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    static String[] dirReducListR(String[] arr) {
        int oldlength = arr.length;
        int newlength = 0;
        while (newlength != oldlength) {
            oldlength = arr.length;
            arr = reduc(arr);
            newlength = arr.length;
        }
        return arr;
    }

       public static String[] reduc(String[] arr) {
            List<String> list = new ArrayList<String>();
            for(int i= 0; i<arr.length;i++){
                if(i != arr.length-1 && ((arr[i].equals("NORTH") && arr[i+1].equals("SOUTH")) || (arr[i].equals("SOUTH") && arr[i+1].equals("NORTH")))){
                    i++;
                } else if(i != arr.length-1 && ((arr[i].equals("WEST") && arr[i+1].equals("EAST")) || (arr[i].equals("EAST") && arr[i+1].equals("WEST")))){
                    i++;
                } else{
                    list.add(arr[i]);
                }
            }
            String[] stockArr = new String[list.size()];
            stockArr = list.toArray(stockArr);
            return stockArr;
        }

    static String encrypting(String s, int n) {
        char[] chars = s.toCharArray();
        StringBuilder strEven = new StringBuilder();
        StringBuilder strOdd = new StringBuilder();
        String result = "";
        int sum = 0;
        while (n != 0) {
            for (int i = 0; i < chars.length; i++) {
                if (i % 2 == 0)
                strEven.append(chars[i]);
                else strOdd.append(chars[i]);
            }
            n--;
            result = strOdd.toString() + strEven.toString();
            strEven.delete(0, strEven.length());
            strOdd.delete(0, strOdd.length());
            chars = result.toCharArray();
//            System.out.println(sum + " " + result);
            sum++;
        }
        return result;
    }

    static String decrypting(String s, int n) {
        char[] chars = s.toCharArray();
        int countEvens = (chars.length)/2;
        int countOdds = chars.length - countEvens;
        char[] evens = new char[countEvens], odds = new char[countOdds], tmp = new char[chars.length];
        StringBuilder strEven = new StringBuilder();
        String result = "";
        System.out.println(countEvens + " " + countOdds);
        while (n != 0) {
            int itOdd = 0, itEven = 0;
            for (int i = 0; i < chars.length; i++) {
                if (i < countEvens) {
                    evens[itEven] = chars[i];
                    itEven++;
                }
                if (i > countEvens) {
                    odds[itOdd] = chars[i];
                    itOdd++;
                }
            }
            itOdd = 0;
            itEven = 0;
            for (int i = 0; i < chars.length; i++) {
                if (i % 2 == 0) {
                    tmp[i] = odds[itOdd];
                    itOdd++;
                } else {
                    tmp[i] = evens[itEven];
                    itEven++;
                }
            }
            n--;
            result = strEven.append(tmp).toString();
            strEven.delete(0, strEven.length());
            chars = result.toCharArray();
        }
        return result;
    }

    static int duplicateCount(String s) {
        StringBuilder str = new StringBuilder(s.toLowerCase());
        int repeated = 0;
        while (str.length() != 0) {
            String string = str.substring(0,1);
            str.deleteCharAt(0);
            if (str.toString().contains(string))
                repeated++;
            str = new StringBuilder(str.toString().replaceAll(string, ""));
        }
        return repeated;
    }

    static String high(String s) {
        Map<Integer, String> words = new TreeMap<Integer, String>();
        String[] arstr = s.split(" ");
        int sum;
        for (String str : arstr) {
            sum = 0;
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                sum += Character.getNumericValue(ch) - 9;
            }
            if (!words.containsKey(sum))
            words.put(sum, str);
        }
        int big = Integer.MIN_VALUE;
        for (Integer sums : words.keySet()) {
            if (sums > big) {
                big = sums;
            }
        }
        return words.get(big);
    }
    static int stray(int[] numbers) {
        int tmp = numbers[0], counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != tmp) {
                if (counter > 1) {
                    tmp = numbers[i];
                    break;
                }
            } else {
                counter++;
            }

        }
        return tmp;
    }
    static String makeComplement(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'A')
                str.append("T");
            if (c == 'T')
                str.append("A");
            if (c == 'C')
                str.append("G");
            if (c == 'G')
                str.append("C");
        }
        return str.toString();
    }
    static boolean isValid(char[] ch) {
        if (ch.length > 10 || ch.length <= 2)
            return false;
        byte w = 0, s = 0, e = 0, n = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'w') {
                w++;
                e--;
            }
            if (ch[i] == 'e') {
                e++;
                w--;
            }
            if (ch[i] == 's') {
                s++;
                n--;
            }
            if (ch[i] == 'n') {
                n++;
                s--;
            }
        }
        if (w == 0 & e == 0 & s == 0 & n == 0)
            return true;
        else return false;
    }
    static int solution(int number) {
        int sum = 0;
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                sum += i;
        }
        return sum;
    }

    //70312
    static String expandedForm(int num) {
        int q = 10, tmp;
        List<Integer> list = new LinkedList<Integer>();
        while (num != 0) {
            tmp = num % q;
            if (tmp != 0)
            list.add(tmp);
            num -= tmp;
            q *= 10;
        }
        StringBuilder str = new StringBuilder();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            str.append(listIterator.previous());
            str.append(" + ");
        }
        str.replace(str.length() - 3, str.length(), "");
        return str.toString();
    }
}
