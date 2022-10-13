import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        long factorial = 1;
        long n = 1;
        long num = scanner.nextLong();

        while(factorial<=num){
            n++;
            factorial = factorial*n;

        }
        System.out.println(n);
    }
}