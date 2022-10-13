import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int sum = 0;
        int inputNumber;
        do{
            inputNumber=scanner.nextInt();
            sum +=inputNumber;
        }
        while(inputNumber != 0);
        System.out.println(sum);
    }
}