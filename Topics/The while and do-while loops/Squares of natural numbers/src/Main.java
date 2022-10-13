import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int num = scanner.nextInt();
        int sqr = 1;
        int numPow = 1;

        while (numPow * numPow <= num){
            System.out.println(numPow * numPow);
            numPow++;
        }

    }
}