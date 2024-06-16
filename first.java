import java.util.Scanner;

public class first {

    
    // here we are applying first dp problem to create optimize code based on fibnanci series problem
    public static int Fibomemories(int n,int[]q){
        if(n==0||n==1){
            return n;
        }

       if(q[n]!=0){
        return q[n];
       }

       

        int fi=Fibomemories(n-1, q)+Fibomemories(n-2, q);
        q[n]=fi;
        return fi;


    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter no to be in fibonanci values");

        int n=sc.nextInt();

       

        int fibo=Fibomemories(n,new int[n+1]);

        System.out.println(fibo);
        
    }
}
