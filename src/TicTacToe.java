public class TicTacToe {
    public boolean isEnded = false;

    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Board board;


    public TicTacToe(Player p1, Player p2){
        player1 = p1;
        player2 = p2;
        initialize();
    }
    
    public void initialize(){
        currentPlayer = player1;
        board = new Board();
        isEnded = false;
        //board.Display();
    }

    public boolean play(int x, int y){

        if(!board.isCaseEmpty(x, y))
        {
            return false;
        }
        else
        {
            board.SetMove(currentPlayer, x, y);
            
            //board.Display();
            
            if(board.GetWinner() != null || board.GetTurns() >= 9)
            {
                isEnded = true;
            }

            currentPlayer = currentPlayer == player1? player2: player1;  

            return true;
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

    // user case number 1-3
    public char getBoardCase(int x, int y){
        return board.GetCase(x, y);
    }
}

