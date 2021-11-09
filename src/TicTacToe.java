public class TicTacToe {
    public boolean isEnded = false;

    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Board board;


    public TicTacToe(Player p1, Player p2){
        player1 = p1;
        player2 = p2;
        currentPlayer = player1;
        board = new Board();
        board.Display();
    }
    
    public void initialize(){
        currentPlayer = player1;
        board = new Board();
        isEnded = false;
        board.Display();
    }

    public void play(int x, int y){

        if(!board.isCaseEmpty(x, y))
        {
            System.out.println("Hey! Cette case est déjà prise! Choisis s'en une autre! (︶︿︶)");
        }
        else
        {
            board.SetMove(currentPlayer, x, y);
            
            board.Display();
            if(board.GetWinner() != null)
            {
                isEnded = true;
            }
            else if(board.GetTurns() >= 9)
            {
                isEnded = true;
            }

            currentPlayer = currentPlayer == player1? player2: player1;   
        }         
    }   

    public void setPlayer1(Player player){
        player1 = player;
    }
    public void setPlayer2(Player player){
        player2 = player;
    }

    public Player getWinner(){
        return board.GetWinner();
    }

    public Player getCurrentPlayer(){
        return currentPlayer;
    }
}

