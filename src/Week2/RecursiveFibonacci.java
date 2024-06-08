package Week2;

public class RecursiveFibonacci {

    // Eğer n değeri 1 veya 2 ise, Fibonacci serisindeki her bir sayı 1'dir.
    static int fib (int n){
        if(n==1 || n== 2) {
            return 1;
        }

        // Eğer n değeri 1 veya 2 değilse, Fibonacci serisindeki n. sayı, n-1. sayı ile n-2. sayının toplamıdır.
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {

        System.out.println(fib(6));

    }
}
