import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        int num = n;
        System.out.print(num+ " ");
        while(num>1){

            if(num%2==0){
                num /=2;
            } else {
                num = num*3+1;
            }
            System.out.print(num+ " ");
        }
    }
}