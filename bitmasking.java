
import java.util.Scanner;
public class bitmasking {
    public static void main(String[] args) {
        //bit masking alogrithm goes like this:
        //bit mask=1<<i(i stands for the position at which the bit is to be found)
        //then perform and operation with the original number and eureka you get an integer number and when you get the integer number, you can convert it to binary and find the result by yourself
        //This algorithm is used for fetching the bit at the nth position
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        System.out.println("Enter the position at which the value is to be found");
        int n=sc.nextInt();
        int b=1<<n;
        if((b & a)==0){
            System.out.println("The number at the nth position is 0");
        }
        else{
            System.out.println("The number at the nth position is 1");
        }
        

        //Algorithm to reverse nth bit at a certain poisition
        
        System.out.println(a|b);

        //clear a bit

        System.out.println((~b)&a);

        //update a bit5
        //if we want to update a bit to one we will perform the not operation with the bit mask and and the resultant with the given integer
        //if we want to update the bit to zero we will just or the bit mask and the given number
        System.out.println((~b)&a);
        System.out.println(b | a);

    }
    
}
