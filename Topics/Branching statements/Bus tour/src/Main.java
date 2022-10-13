import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int busHeight = scanner.nextInt();
        int numOfBridges = scanner.nextInt();
        String text = "Will not crash";
        int bridgeHeight;

        for(int i = 1; i<=numOfBridges; i++){
            bridgeHeight = scanner.nextInt();
            if(bridgeHeight <= busHeight){
                text = "Will crash on bridge "+ i;
                break;
            }
        }
        System.out.println(text);
    }
}