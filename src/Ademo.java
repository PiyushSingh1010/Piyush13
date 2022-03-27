import java.util.Arrays;

public class Ademo {
    public static void main(String[] args) {
   //by using String check the anagram or not
        String s1 = "any";
        String s2 = "nay";
        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1, arr2));
    }
}
