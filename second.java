
import java.util.Scanner;
public class second {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter whichever tablets you need to print");
        int n=sc.nextInt();

        int cpb=countPath(n,new int[n+1]);
        System.out.println(cpb);


    }
    // static int countPathValue(int n){
    //     //by iteration method solving the problem

    //     int dp[];
    //     for(int i=1;i<n;i++){
    //         if(n==0){
    //             return 1;
    //         }
    //         int dp[i]=dp[n-1]+dp[n-2]+dp[n-3];
    //     }


    // }

    public static int countPath(int n,int[]qb){
      
        if(n==0){
            return 1;

        }
        else if(n<0){
            return 0;
        }
        
        int f1=countPath(n-1, qb);
        int f2=countPath(n-2, qb);
        int f3=countPath(n-3, qb);
        if(qb[n]>0){
            return qb[n];
        }
        int count=f1+f2+f3;
        qb[n]=count;
        return count;
        
    }
}
