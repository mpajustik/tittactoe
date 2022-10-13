import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int numMax=0;
        int num;
        do{
            num = scanner.nextInt();
            if(num > numMax){
                numMax = num;
            }
        }
        while(num != 0);
        System.out.println(numMax);
    }
}