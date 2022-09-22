import java.util.Scanner;
public class D_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int ar[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ar[i][j]=sc.nextInt();

            }
        }
        int n=sc.nextInt();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(ar[i][j]==n){
                    System.out.println(i+","+j);
                }

            }
        }

    }
}