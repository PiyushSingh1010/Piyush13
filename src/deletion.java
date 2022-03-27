import java.util.Scanner;

public class deletion {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        Scanner sc=new Scanner(System.in);
        int index=sc.nextInt();
        int i;
        try {
            for (i = index; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[i] = 0;
            for (int i1 = 0; i1 < arr.length; i1++) {
                System.out.println(arr[i1]);
            }
        }catch(ArrayIndexOutOfBoundsException obj){
            System.out.println("Invalid index");
        }
    }
}
