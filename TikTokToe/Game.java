import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Board board = new Board();
        boolean exit = false;
        int turn = 0;
        System.out.println("Welcome to Tik Tok Toe!!!");
        while(!exit) {
            int x, y;
            if(turn % 2 == 0) {
                System.out.println("X turn");
                x = scanner.nextInt();
                y = scanner.nextInt();
                while(!board.update(x, y, CellStatus.X)) {
                    System.out.println("Please choose another cell");
                    x = scanner.nextInt();
                    y = scanner.nextInt();
                }

            }
            else {
                System.out.println("O turn");
                x = scanner.nextInt();
                y = scanner.nextInt();
                while(!board.update(x, y, CellStatus.O)) {
                    System.out.println("Please choose another cell");
                    x = scanner.nextInt();
                    y = scanner.nextInt();
                }
            }
            board.print();
            if(board.isWin()) {
                if(turn % 2 == 0) {
                    System.out.println("X Win");
                }
                else System.out.println("O Win");
                System.out.println("Do you want to replay? Yes[Y] or No[N]?");
                String choice = scanner.next();
                if(choice.equals("Y")) {
                    turn = 0;
                    board = new Board();
                }
                else {
                    exit = true;
                    System.out.println("Exitting...");
                }
            }
            else turn++;
            System.out.println("-------------------------------------------");
        }
    }
}
