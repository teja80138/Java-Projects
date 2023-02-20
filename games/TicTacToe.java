import java.util.Random;
import java.util.Scanner;

public class TicTacToe{
    private char[][] gameBoard = {
        {' ',' ',' '},
        {' ',' ',' '},
        {' ',' ',' '}
    };

    private  int userInput = 1;
    private  boolean Space = false;
    private  boolean start = true;
    private  String winner = " ";

    public void run(){
        System.out.println("1|2|3");
        System.out.println("-+-+-");
        System.out.println("4|5|6");
        System.out.println("-+-+-");
        System.out.println("7|8|9");
        System.out.println(" ");

        printGameBoard(gameBoard);
        while(start)
        {   
            askUser();
            askComputer();

            
            checkIfWin(gameBoard, 'X');
            checkIfWin(gameBoard, 'O');
            

            if (isGameFinished(gameBoard))
                start = false;

            
        }
    }

    private void printGameBoard(char[][] gameBoard){
        System.out.println(gameBoard[0][0] + "|" + gameBoard[0][1]+"|"+gameBoard[0][2]);
        System.out.println("-+-+-");
        System.out.println(gameBoard[1][0] + "|" + gameBoard[1][1]+"|"+gameBoard[1][2]);
        System.out.println("-+-+-");
        System.out.println(gameBoard[2][0] + "|" + gameBoard[2][1]+"|"+gameBoard[2][2]);
        System.out.println(" ");
    }

    private boolean isGameFinished(char[][] gameBoard){
        for (int i = 0; i<gameBoard.length;i++){
            for (int j = 0; j<gameBoard[i].length;j++){
                if (gameBoard[i][j] == ' ')
                    return false;
            }
        }
        System.out.println("The game ended in a tie!");
        return true;
    }


    private void askUser(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int userinput = scan.nextInt();

        userInput = userinput;

        putInput(userInput, gameBoard, 'X');
    }


    private void askComputer(){
        Random rand = new Random();
        int computerPlay;
        while (true){
            computerPlay  = rand.nextInt(9)+1;
            if (checkIfValid(gameBoard, computerPlay))
            {
                break;
            }
        }

        putInput(computerPlay, gameBoard, 'O');
        printGameBoard(gameBoard);
    }

    private boolean checkIfValid(char[][] gameboard, int pos){
        switch(pos)
        {
            case 1:
                return (gameboard[0][0] == ' ');
            
            case 2:
                return (gameboard[0][1] == ' ');
            
            case 3:
                return (gameboard[0][2] == ' ');
            
            case 4:
                return (gameboard[1][0] == ' ');
            
            case 5:
                return (gameboard[1][1] == ' ');
            
            case 6:
                return (gameboard[1][2] == ' ');
            
            case 7:
                return (gameboard[2][0] == ' ');
            
            case 8:
                return (gameboard[2][1] == ' ');
               
            case 9:
                return (gameboard[2][2] == ' ');
            default:
                return false;
        }
    }


    private void putInput(int pos,char[][] gameboard, char symbol){
        
        switch(pos)
        {
            case 1:
                gameboard[0][0] = symbol;
                break;
            case 2:
                gameboard[0][1] = symbol;
                break;
            case 3:
                gameboard[0][2] = symbol;
                break;
            case 4:
                gameboard[1][0] = symbol;
                break;
            case 5:
                gameboard[1][1] = symbol;
                break;
            case 6:
                gameboard[1][2] = symbol;
                break;
            case 7:
                gameboard[2][0] = symbol;
                break;
            case 8:
                gameboard[2][1] = symbol;
                break;   
            case 9:
                gameboard[2][2] = symbol;
                break; 
            default:
                System.out.println(":(");
        }

    }

    public void checkIfWin(char[][] gameboard, char symbol){
        if (symbol == 'X'){
            //horizontal
            if (gameboard[0][0] == symbol && gameboard[0][1] == symbol && gameboard[0][2] == symbol){
                winner = "Player";
            } 
            else if (gameboard[1][0] == symbol && gameboard[1][1] == symbol && gameboard[1][2] == symbol){
                winner = "Player";
            } 
            else if (gameboard[2][0] == symbol && gameboard[2][1] == symbol && gameboard[2][2] == symbol){
                winner = "Player";
            } 

            // Vertical
            else if (gameboard[0][0] == symbol && gameboard[1][0] == symbol && gameboard[2][0] == symbol){
                winner = "Player";
            } 
            else if (gameboard[0][1] == symbol && gameboard[1][1] == symbol && gameboard[2][1] == symbol){
                winner = "Player";
            } 
            else if (gameboard[0][2] == symbol && gameboard[1][2] == symbol && gameboard[2][2] == symbol){
                winner = "Player";
            } 

            //diagonal

            else if (gameboard[0][0] == symbol && gameboard[1][1] == symbol && gameboard[2][2] == symbol){
                winner = "Player";
            } 
            else if (gameboard[0][2] == symbol && gameboard[1][1] == symbol && gameboard[2][0] == symbol){
                winner = "Player";
            } 


            else{
                System.out.println("Tie!");
            }
        }



        if (symbol == 'O'){
            //horizontal
            if (gameboard[0][0] == symbol && gameboard[0][1] == symbol && gameboard[0][2] == symbol){
                winner = "Computer";
            } 
            else if (gameboard[1][0] == symbol && gameboard[1][1] == symbol && gameboard[1][2] == symbol){
                winner = "Computer";
            } 
            else if (gameboard[2][0] == symbol && gameboard[2][1] == symbol && gameboard[2][2] == symbol){
                winner = "Computer";
            } 

            // Vertical
            else if (gameboard[0][0] == symbol && gameboard[1][0] == symbol && gameboard[2][0] == symbol){
                winner = "Computer";
            } 
            else if (gameboard[0][1] == symbol && gameboard[1][1] == symbol && gameboard[2][1] == symbol){
                winner = "Computer";
            } 
            else if (gameboard[0][2] == symbol && gameboard[1][2] == symbol && gameboard[2][2] == symbol){
                winner = "Computer";
            } 

            //diagonal

            else if (gameboard[0][0] == symbol && gameboard[1][1] == symbol && gameboard[2][2] == symbol){
                winner = "Computer";
            } 
            else if (gameboard[0][2] == symbol && gameboard[1][1] == symbol && gameboard[2][0] == symbol){
                winner = "Computer";
            } 


            else{
                System.out.println("Tie!");
            }
        }

    }
    
}