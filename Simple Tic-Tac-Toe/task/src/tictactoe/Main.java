package tictactoe;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        //String word = scanner.nextLine();
        //Kindlasti saab kasutada ka char[] charArray = scanner.nextLine().toCharArray();
        //Pärast seda loopida läbi ja tulemused nii kuvada
        //System.out.println(String.format("| %c %c %c |", charArray[i], charArray[i+1], charArray[i+2]));

        //Siin saan oma array kätte
        //int indexCounter = 0;
        char[][] tictactoeArray = new char[3][3];
        for(int i = 0; i<tictactoeArray.length; i++){
            for(int j = 0; j<tictactoeArray[i].length; j++){
                tictactoeArray[i][j]= ' ';
                //indexCounter++;
            }
        }


        System.out.println("---------");
        for(int i = 0; i<tictactoeArray.length; i++){
            System.out.print("| ");
            for(int j = 0; j<tictactoeArray[i].length; j++){
                System.out.print(tictactoeArray[i][j]+" ");
            }
            System.out.println("|");
        }
        System.out.println("---------");

        boolean testingNumber = true;
        int coordinateX = 0;
        int coordinateY = 0;
        boolean xTurn = true;

        while(testingNumber){
            try {
                coordinateX = scanner.nextInt();
                coordinateY = scanner.nextInt();
                if (coordinateX > 3 || coordinateY > 3) {
                    System.out.println("Coordinates should be from 1 to 3!");
                    continue;
                } else if (tictactoeArray[coordinateX - 1][coordinateY - 1] == 'X' || tictactoeArray[coordinateX - 1][coordinateY - 1] == 'O') {
                    System.out.println("This cell is occupied! Choose another one!");
                    continue;
                }
            } catch (Exception e) {
                System.out.println("You should enter numbers!");
            }
            if(xTurn){
                tictactoeArray[coordinateX-1][coordinateY-1] = 'X';
                xTurn = false;
            } else {
                tictactoeArray[coordinateX-1][coordinateY-1] = 'O';
                xTurn = true;
            }


            System.out.println("---------");
            for(int i = 0; i<tictactoeArray.length; i++){
                System.out.print("| ");
                for(int j = 0; j<tictactoeArray[i].length; j++){
                    System.out.print(tictactoeArray[i][j]+" ");
                }
                System.out.println("|");
            }
            System.out.println("---------");


            if((tictactoeArray[0][0] == 'X' && tictactoeArray[0][1] == 'X' && tictactoeArray[0][2] == 'X') ||
                    (tictactoeArray[1][0] == 'X' && tictactoeArray[1][1] == 'X' && tictactoeArray[1][2] == 'X') ||
                    (tictactoeArray[2][0] == 'X' && tictactoeArray[2][1] == 'X' && tictactoeArray[2][2] == 'X') ||
                    (tictactoeArray[0][0] == 'X' && tictactoeArray[1][0] == 'X' && tictactoeArray[2][0] == 'X') ||
                    (tictactoeArray[0][1] == 'X' && tictactoeArray[1][1] == 'X' && tictactoeArray[2][1] == 'X') ||
                    (tictactoeArray[0][2] == 'X' && tictactoeArray[1][2] == 'X' && tictactoeArray[2][2] == 'X') ||
                    (tictactoeArray[0][0] == 'X' && tictactoeArray[1][1] == 'X' && tictactoeArray[2][2] == 'X') ||
                    (tictactoeArray[2][0] == 'X' && tictactoeArray[1][1] == 'X' && tictactoeArray[0][2] == 'X')) {
                System.out.println("X wins");
                testingNumber = false;

            } else if ((tictactoeArray[0][0] == 'O' && tictactoeArray[0][1] == 'O' && tictactoeArray[0][2] == 'O') ||
                    (tictactoeArray[1][0] == 'O' && tictactoeArray[1][1] == 'O' && tictactoeArray[1][2] == 'O') ||
                    (tictactoeArray[2][0] == 'O' && tictactoeArray[2][1] == 'O' && tictactoeArray[2][2] == 'O') ||
                    (tictactoeArray[0][0] == 'O' && tictactoeArray[1][0] == 'O' && tictactoeArray[2][0] == 'O') ||
                    (tictactoeArray[0][1] == 'O' && tictactoeArray[1][1] == 'O' && tictactoeArray[2][1] == 'O') ||
                    (tictactoeArray[0][2] == 'O' && tictactoeArray[1][2] == 'O' && tictactoeArray[2][2] == 'O') ||
                    (tictactoeArray[0][0] == 'O' && tictactoeArray[1][1] == 'O' && tictactoeArray[2][2] == 'O') ||
                    (tictactoeArray[2][0] == 'O' && tictactoeArray[1][1] == 'O' && tictactoeArray[0][2] == 'O')) {
                System.out.println("O wins");
                testingNumber = false;
            } else if(tictactoeArray[0][0] != ' ' && tictactoeArray[0][1] != ' ' && tictactoeArray[0][2] != ' ' &&
                    tictactoeArray[1][0] != ' ' && tictactoeArray[1][1] != ' ' && tictactoeArray[1][2] != ' ' &&
                    tictactoeArray[2][0] != ' ' && tictactoeArray[2][1] != ' ' && tictactoeArray[2][2] != ' ') {
                System.out.println("Draw");
                testingNumber = false;
            }

        }

        /*
        tictactoeArray[coordinateX-1][coordinateY-1] = 'X';

        System.out.println("---------");
        for(int i = 0; i<tictactoeArray.length; i++){
            System.out.print("| ");
            for(int j = 0; j<tictactoeArray[i].length; j++){
                System.out.print(tictactoeArray[i][j]+" ");
            }
            System.out.println("|");
        }
        System.out.println("---------");

        */

        /*
        System.out.println("---------");
        System.out.println("| " + word.charAt(0) + " " + word.charAt(1) + " " + word.charAt(2) + " |");
        System.out.println("| " + word.charAt(3) + " " + word.charAt(4) + " " + word.charAt(5) + " |");
        System.out.println("| " + word.charAt(6) + " " + word.charAt(7) + " " + word.charAt(8) + " |");
        System.out.println("---------");

        int charXCounter = 0;
        int charOCounter = 0;
        char letterX = 'X';
        char letterO = 'O';

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letterX) {
                charXCounter++;
            }
            if (word.charAt(i) == letterO) {
                charOCounter++;
            }
        }

        if(charXCounter-charOCounter > 1 ||  charOCounter-charXCounter >1 ){
            System.out.println(charXCounter-charOCounter+ " "+ (charXCounter-charOCounter > 1));
            System.out.println(charOCounter-charXCounter+ " "+ (charOCounter-charXCounter >1 ));
            System.out.println(charOCounter-charXCounter+""+(charXCounter-charOCounter != 0));
            System.out.println("Impossible");
            return;
        }

        if (((word.charAt(0) == 'O' && word.charAt(1) == 'O' && word.charAt(2) == 'O') ||
                (word.charAt(3) == 'O' && word.charAt(4) == 'O' && word.charAt(5) == 'O') ||
                (word.charAt(6) == 'O' && word.charAt(7) == 'O' && word.charAt(8) == 'O') ||
                (word.charAt(0) == 'O' && word.charAt(3) == 'O' && word.charAt(6) == 'O') ||
                (word.charAt(1) == 'O' && word.charAt(4) == 'O' && word.charAt(7) == 'O') ||
                (word.charAt(2) == 'O' && word.charAt(5) == 'O' && word.charAt(8) == 'O') ||
                (word.charAt(0) == 'O' && word.charAt(4) == 'O' && word.charAt(5) == 'O') ||
                (word.charAt(6) == 'O' && word.charAt(4) == 'O' && word.charAt(2) == 'O'))
                        && ((word.charAt(0) == 'X' && word.charAt(1) == 'X' && word.charAt(2) == 'X') ||
                (word.charAt(3) == 'X' && word.charAt(4) == 'X' && word.charAt(5) == 'X') ||
                (word.charAt(6) == 'X' && word.charAt(7) == 'X' && word.charAt(8) == 'X') ||
                (word.charAt(0) == 'X' && word.charAt(3) == 'X' && word.charAt(6) == 'X') ||
                (word.charAt(1) == 'X' && word.charAt(4) == 'X' && word.charAt(7) == 'X') ||
                (word.charAt(2) == 'X' && word.charAt(5) == 'X' && word.charAt(8) == 'X') ||
                (word.charAt(0) == 'X' && word.charAt(4) == 'X' && word.charAt(5) == 'X') ||
                (word.charAt(6) == 'X' && word.charAt(4) == 'X' && word.charAt(2) == 'X'))){

            System.out.println("Impossible");

        }else if((word.charAt(0) == 'X' && word.charAt(1) == 'X' && word.charAt(2) == 'X') ||
                (word.charAt(3) == 'X' && word.charAt(4) == 'X' && word.charAt(5) == 'X') ||
                (word.charAt(6) == 'X' && word.charAt(7) == 'X' && word.charAt(8) == 'X') ||
                (word.charAt(0) == 'X' && word.charAt(3) == 'X' && word.charAt(6) == 'X') ||
                (word.charAt(1) == 'X' && word.charAt(4) == 'X' && word.charAt(7) == 'X') ||
                (word.charAt(2) == 'X' && word.charAt(5) == 'X' && word.charAt(8) == 'X') ||
                (word.charAt(0) == 'X' && word.charAt(4) == 'X' && word.charAt(5) == 'X') ||
                (word.charAt(6) == 'X' && word.charAt(4) == 'X' && word.charAt(2) == 'X')) {
            System.out.println("X wins");


        } else if((word.charAt(0) == 'O' && word.charAt(1) == 'O' && word.charAt(2) == 'O') ||
                (word.charAt(3) == 'O' && word.charAt(4) == 'O' && word.charAt(5) == 'O') ||
                (word.charAt(6) == 'O' && word.charAt(7) == 'O' && word.charAt(8) == 'O') ||
                (word.charAt(0) == 'O' && word.charAt(3) == 'O' && word.charAt(6) == 'O') ||
                (word.charAt(1) == 'O' && word.charAt(4) == 'O' && word.charAt(7) == 'O') ||
                (word.charAt(2) == 'O' && word.charAt(5) == 'O' && word.charAt(8) == 'O') ||
                (word.charAt(0) == 'O' && word.charAt(4) == 'O' && word.charAt(5) == 'O') ||
                (word.charAt(6) == 'O' && word.charAt(4) == 'O' && word.charAt(2) == 'O') ) {
            System.out.println("O wins");

        }else if(word.charAt(0) == '_' || word.charAt(1) == '_' || word.charAt(2) == '_' ||
                word.charAt(3) == '_' || word.charAt(4) == '_' || word.charAt(5) == '_' ||
                word.charAt(6) == '_' || word.charAt(7) == '_' || word.charAt(8) == '_') {
            System.out.println("Game not finished");

        }else {
            System.out.println("Draw");
        }

        */


    }
}
