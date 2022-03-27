import java.util.Scanner;
class firstexception extends Exception {
    firstexception(String s){
        super();
        System.out.println(s);
    }
}
class Main{
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=a+b;
            if (c<150) {
                throw new firstexception("Exception 1");
            }
            else{
               System.out.println(c);
            }
        }
        catch (firstexception obj)
        {
        }
    }
}
