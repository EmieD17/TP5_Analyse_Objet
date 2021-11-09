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

        do
        {            
            while(!tictactoe.isEnded)
            {
                do{
                    System.out.print(tictactoe.getCurrentPlayer().GetName() + ": Entrez la rangée (x) (1,2,3)  : ");  
                    x = sc.nextInt() - 1; 
                }while(x < 0 || x > 2) ;
                do{
                    System.out.print(tictactoe.getCurrentPlayer().GetName() + ": Entrez la colonne (y) (1,2,3) : ");  
                    y = sc.nextInt() - 1; 
                }while(y < 0 || y > 2) ;

                tictactoe.play(x, y);
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
            }
            else
            {
                playAgain = false;
                System.out.println(" On ne joue pas encore");
            }
            
        }while(playAgain);
        
        System.out.print("\nAu revoir! ( ´ ▽ ` )ﾉ \n");
        
        sc.close();
    } 
}
