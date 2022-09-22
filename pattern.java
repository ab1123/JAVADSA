import java.util.*;
public class pattern {
    public static void main(String[]  args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();


        //pattern 1

        // int m=sc.nextInt();
        // for(int i=1;i<n+1;i++){
        //     for(int j=1;j<m+1;j++){
        //         if(i==1 || i==n){
        //             System.out.print("*");

        //         }
        //         else if(j==1 || j==m){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }

        //     }
        //     System.out.println("");
        // }


        //Pattern 2


        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

        // pattern 3


        // for(int i=n;i>0;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }
        
        //pattern 4


        // for(int i=1;i<=n;i++){
        //     for(int j=n-i;j>0;j--){
        //         System.out.print(" ");
        //     }
        //     for(int k=1;k<=i;k++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

        // pattern 5

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);

        //     }
        //     System.out.println("");
        // }

        //pattern 6

        // for(int i=n;i>0;i--){
        //         for(int j=1;j<=i;j++){
        //             System.out.print(j);
        //         }
        //         System.out.println("");
        //     }

        //pattern 7
        
        // int c=1;
        // for(int i=1;i<=n;i++){
        //         for(int j=1;j<=i;j++){
        //             System.out.print(c+" ");
        //             c++;
    
        //         }
        //         System.out.println("");
        //     }

        //pattern 8

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         if(i%2==0){
        //             if(j%2==0){
        //                 System.out.print("1");
        //             }
        //             else{
        //                 System.out.print("0");

        //             }

        //         }
        //         else{
        //             if(j%2==0){
        //                 System.out.print("0");

        //             }
        //             else{
        //                 System.out.print("1");
        //             }
        //         }
        //     }
        //     System.out.println("");
        // }

        //another way of solving pattern 8

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         int sum=i+j;
        //         if(sum%2==0){
        //             System.out.print("1");
        //         }
        //         else{
        //             System.out.print("0");
        //         }

        //     }
        //     System.out.println("");
        // }

        //advance pattern 1

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     for(int k=n-(i);k>0;k--){
        //         System.out.print(" ");
        //     }
        //     for(int f=n-(i);f>0;f--){
        //         System.out.print(" ");
        //     }
        //     for(int l=1;l<=i;l++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");


        // }
        
        // for(int p=n;p>=1;p--){
            
        //     for(int q=1;q<=p;q++){
        //         System.out.print("*");
        //     }
        //     for(int r=n-(p);r>0;r--){
        //         System.out.print(" ");
        //     }
        //     for(int s=n-(p);s>0;s--){
        //         System.out.print(" ");
        //     }
        //     for(int t=1;t<=p;t++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");


        // }

        //advance pattern 2

        // for(int i=1;i<=5;i++){
        //     for(int j=n-i;j>0;j--){
        //         System.out.print(" ");
        //     }
        //     for(int k=1;k<=n;k++){
        //         System.out.print("*");
        //     }
        //     for(int l=1;l<=i;l++){
        //         System.out.print(" ");
        //     }
        //     System.out.println("");
        // }
        
        //advance pattern 3

        // for(int i=1;i<=n;i++){
        //     for(int j=n-i;j>0;j--){
        //         System.out.print(" ");
                
        //     }
        //     for(int k=1;k<=i;k++){
        //         System.out.print(i);
        //         System.out.print(" ");
        //     }
        //     for(int l=n-i;l>0;l--){
        //         System.out.print(" ");
        //     }
        //     System.out.println("");
        // }

        //advance problem 4

        // for(int i=1;i<=n;i++){
        //     for(int j=n-i;j>0;j--){
        //         System.out.print(" ");
                
        //     }
        //     for(int k=0;k<i;k++){
        //         System.out.print(i-k);
                
        //     }
        //     for(int s=2;s<=i;s++){
        //         System.out.print(s);
        //     }
        //     for(int l=n-i;l>0;l--){
        //         System.out.print(" ");
        //     }
        //     System.out.println("");
        // }

        //advance pattern problem 5


        // for(int i=1;i<=n;i++){
        //         for(int j=n-i;j>0;j--){
        //             System.out.print(" ");
                    
        //         }
        //         for(int k=0;k<i;k++){
        //             System.out.print("*");
                    
        //         }
        //         for(int s=2;s<=i;s++){
        //             System.out.print("*");
        //         }
        //         for(int l=n-i;l>0;l--){
        //             System.out.print(" ");
        //         }
        //         System.out.println("");


        //     }
        // for(int i=n;i>=1;i--){
        //         for(int j=n-i;j>0;j--){
        //             System.out.print(" ");
                    
        //         }
        //         for(int k=0;k<i;k++){
        //             System.out.print("*");
                    
        //         }
        //         for(int s=2;s<=i;s++){
        //             System.out.print("*");
        //         }
        //         for(int l=n-i;l>0;l--){
        //             System.out.print(" ");
        //         }
        //         System.out.println("");


        //     }


        sc.close();
    
}}
