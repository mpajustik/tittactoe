import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[][] multiArray = new int[num][num];
        for(int i = 0; i<num; i++){
            for(int j = 0; j< num; j++){
                multiArray[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < num; i++)
        {
            for (int j = 0; j < num; j++)
            {
                if(multiArray[i][j] != multiArray[j][i])
                {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");


    }
}