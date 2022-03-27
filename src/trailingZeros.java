import java.util.Scanner;

public class trailingZeros {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        for(int i=5;n/i>=1;i*=5){
            count+=n/i;
          //  System.out.println("loop:  "+count);
        }
        System.out.println(count);
    }
}
