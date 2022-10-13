import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        int sum = 0;

        for(int i = 0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }
        int controlNum = scanner.nextInt();

        for(int n : array){
            if(n == controlNum){
                sum++;
            }
        }
        System.out.println(sum);
    }
}