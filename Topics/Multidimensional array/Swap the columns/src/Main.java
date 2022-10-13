import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] multiArray = new int[n][m];
        for(int i = 0; i<n; i++){
            for(int j = 0; j< m; j++){
                multiArray[i][j] = scanner.nextInt();
            }
        }

        int swappedColumnIndex1 = scanner.nextInt();
        int swappedColumnIndex2 = scanner.nextInt();

        int[] tempArray1 = new int[n];
        int[] tempArray2 = new int[n];

        for(int i = 0; i<n; i++){
            tempArray1[i] = multiArray[i][swappedColumnIndex1];
            tempArray2[i] = multiArray[i][swappedColumnIndex2];
            multiArray[i][swappedColumnIndex2] = tempArray1[i];
            multiArray[i][swappedColumnIndex1] = tempArray2[i];
        }

        for(int i = 0; i<n; i++){
            for(int j = 0; j< m; j++){
                System.out.print(multiArray[i][j]+" ");
            }
            System.out.println();
        }


    }
}