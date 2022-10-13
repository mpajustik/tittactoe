import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        double a, b, c;
        double p, result;
        switch (scanner.nextLine()){
            case "rectangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                result = a*b;
                System.out.println(result);
                break;
            case "circle":
                a = scanner.nextDouble();
                result = a*a*3.14;
                System.out.println(result);
                break;
            case "triangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();
                p = (a+b+c)/2;
                result = Math.sqrt(p*(p-a)*(p-b)*(p-c));
                System.out.println(result);
                break;
            default:
                System.out.println("Write right sape!");
                break;
        }
    }
}