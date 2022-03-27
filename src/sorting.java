import java.util.Arrays;
import java.util.Scanner;

public class sorting {
    public static void main(String[] args)
    {
        String s1="ant";
        String s2="nay";
        char[] ch1=new char[s1.length()];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i <ch1.length ; i++)
        {
            ch1[i]=s1.charAt(0);
        }
        char ch=sc.next().charAt(0);
        char arr1[]=s1.toCharArray();
        char arr2[]=s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1,arr2));
    }
}
