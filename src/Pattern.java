import java.util.Scanner;
class pattern {
        public <t> void disp(t x) {
            for (int i = 1; i <= 4; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(x +" ");
                }
                System.out.println("");
            }
        }
    }
    class myclass{
        public static void main(String[] args) {
            pattern obj=new pattern();
            Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();
            //int num=sc.nextInt();
            obj.disp(str);
            //obj.disp(num);
        }
}
