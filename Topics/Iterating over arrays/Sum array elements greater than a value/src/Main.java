import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int sum = 0;
        int arrayLength =scanner.nextInt();
        int[] array = new int[arrayLength];
        for(int i = 0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();

        for(int j = 0; j<array.length; j++){
            if(array[j]> n){
                sum += array[j];
            }
        }
        System.out.println(sum);
    }
}