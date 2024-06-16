import java.util.Scanner;

public class first {

    public static int Fibo(int n){
        if(n==0||n==1){
            return n;
        }


        return Fibo(n-1)+Fibo(n-2);

    }

    // here we are applying first dp problem to create optimize code based on fibnanci series problem
    public static int Fibomemories(int n,int[]q){
        if(n==0||n==1){
            return n;
        }

       if(q[n]!=0){
        return q[n];
       }
       System.out.println("hello"+n);

       int f1=Fibomemories(n-1, q);
int f2=Fibomemories(n-2, q);
        int fi=f1+f2;
        q[n]=fi;
        return fi;
       
    }
//we are taking another recursion example to solve by using dp

public static int factorial(int n,int[]qb)
{
    if(n==0||n==1){
        return 1;
    }
    int fact1=factorial(n-1, qb);

    // int fact2=factorial(n-2, qb);

    int fact=n*fact1;
    // int fact=n*fact1*fact2;

    qb[n]=fact;
    return fact;
}

//without recursion also we can aslo

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        
        // System.out.println("enter no to be in fibonanci values");
        System.out.println("enter no to be in factorial values");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

       

        // int fibo=Fibomemories(n,new int[n+1]);

        // System.out.println(fibo);

        int fact=factorial(n, new int[n+1]);
        System.out.println(fact);
        
    }
}
