import java.util.*;  

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        boolean playAgain = false;
        String res = "N";

        System.out.println("Hello! Jouons au TicTacToe! :D \n");

        TicTacToe tictactoe = new TicTacToe(new Player('X', "Émie"), new Player('O', "Mathieu"));
        //display
        System.out.println("Hello Board!");
        System.out.println(" _________________ \n|     |     |     |");
        System.out.println("|  " + tictactoe.getBoardCase(1,1) + "  |  " + tictactoe.getBoardCase(2,1) + "  |  " + tictactoe.getBoardCase(3,1) + "  |");
        System.out.println("|_____|_____|_____|\n|     |     |     |");
        System.out.println("|  " + tictactoe.getBoardCase(1,2) + "  |  " + tictactoe.getBoardCase(2,2) + "  |  " + tictactoe.getBoardCase(3,2) + "  |");
        System.out.println("|_____|_____|_____|\n|     |     |     |");
        System.out.println("|  " + tictactoe.getBoardCase(1,3) + "  |  " + tictactoe.getBoardCase(2,3) + "  |  " + tictactoe.getBoardCase(3,3) + "  |");
        System.out.println("|_____|_____|_____|\n");

        do
        {            
            while(!tictactoe.isEnded)
            {
                do{
                    System.out.print(tictactoe.getCurrentPlayer().GetName() + ": Entrez la rangée (x) (1,2,3)  : ");  
                    x = sc.nextInt(); 
                }while(x < 1 || x > 3) ;
                do{
                    System.out.print(tictactoe.getCurrentPlayer().GetName() + ": Entrez la colonne (y) (1,2,3) : ");  
                    y = sc.nextInt(); 
                }while(y < 1 || y > 3) ;

                //Play!
                if(tictactoe.play(x, y)){
                    //board.Display();
                    //display
                    System.out.println("Hello Board!");
                    System.out.println(" _________________ \n|     |     |     |");
                    System.out.println("|  " + tictactoe.getBoardCase(1,1) + "  |  " + tictactoe.getBoardCase(2,1) + "  |  " + tictactoe.getBoardCase(3,1) + "  |");
                    System.out.println("|_____|_____|_____|\n|     |     |     |");
                    System.out.println("|  " + tictactoe.getBoardCase(1,2) + "  |  " + tictactoe.getBoardCase(2,2) + "  |  " + tictactoe.getBoardCase(3,2) + "  |");
                    System.out.println("|_____|_____|_____|\n|     |     |     |");
                    System.out.println("|  " + tictactoe.getBoardCase(1,3) + "  |  " + tictactoe.getBoardCase(2,3) + "  |  " + tictactoe.getBoardCase(3,3) + "  |");
                    System.out.println("|_____|_____|_____|\n");
                }
                else{
                    System.out.println("Hey! Cette case est déjà prise! Choisis-en une autre! (︶︿︶)");
                }
            }

            if(tictactoe.getWinner() != null){
                System.out.println("La partie est terminée, " + tictactoe.getWinner().GetName() + " a gagné(e) !!! \n☆彡(ノ^ ^)ノ Félicitations ヘ(^ ^ヘ)☆彡 \n");
            }
            else{
                System.out.println("La partie est terminée, c'est l'égalité! \n");
            }

            System.out.print("Voulez-vous jouer à nouveaux? (Y/N): ");
            res = System.console().readLine().toUpperCase();
            if(res.equals("Y")){
                System.out.println("YÉ! On joue encore!");
                playAgain = true;
                tictactoe.initialize();
                //display
                System.out.println("Hello Board!");
                System.out.println(" _________________ \n|     |     |     |");
                System.out.println("|  " + tictactoe.getBoardCase(1,1) + "  |  " + tictactoe.getBoardCase(2,1) + "  |  " + tictactoe.getBoardCase(3,1) + "  |");
                System.out.println("|_____|_____|_____|\n|     |     |     |");
                System.out.println("|  " + tictactoe.getBoardCase(1,2) + "  |  " + tictactoe.getBoardCase(2,2) + "  |  " + tictactoe.getBoardCase(3,2) + "  |");
                System.out.println("|_____|_____|_____|\n|     |     |     |");
                System.out.println("|  " + tictactoe.getBoardCase(1,3) + "  |  " + tictactoe.getBoardCase(2,3) + "  |  " + tictactoe.getBoardCase(3,3) + "  |");
                System.out.println("|_____|_____|_____|\n");
            }
            else
            {
                playAgain = false;
                System.out.println(" On ne joue pas à nouveau");
            }
            
        }while(playAgain);
        
        System.out.print("Au revoir! ( ´ ▽ ` )ﾉ \n\n");
        
        sc.close();
    } 
}
