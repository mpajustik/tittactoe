import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int numOfTriple = 0;
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        for(int i = 0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }

        for(int j = 0; j<array.length-2; j++){
            if(array[j]+1 == array[j+1] && array[j+1]+1 == array[j+2]  ){
                numOfTriple++;
            }
        }
        System.out.println(numOfTriple);
    }
}