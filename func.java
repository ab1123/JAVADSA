import java.util.Scanner;

public class func {
    public static int adder(int a, int b) {
        int c=a+b;
        return c;
    }
    public static int mul(int a, int b) {
        int c=a*b;
        return c;
    }
    public static int fact(int n) {
        if(n==1){
            return 1;
        }
        else{
            int c=n*fact(n-1);
            return c;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        //int b=sc.nextInt();
        //System.out.println(adder(a,b));
        //System.out.println(mul(a,b));
        System.out.println(fact(a));
        sc.close();
    }
}
