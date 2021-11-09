public class Board {
    private Player winner;
    private char[][] board;
    private int turns;

    public Board(){
        // peuple le tableau de charactères espace
        board = new char[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                board[i][j] = ' ';
            }
        }
        
        winner = null;
        turns = 0;
    }

    public void SetMove(Player player, int x, int y){
        board[x][y] = player.GetSymbol();
        turns++;

        // vérifier s'il y a un winner

        if(isThereTTT(player.GetSymbol())){
            winner = player;
        }
    }
    public void Display(){

        System.out.println("Hello Board!");
        System.out.println(" _________________ \n|     |     |     |");
        System.out.println("|  " + board[0][0] + "  |  " + board[1][0] + "  |  " + board[2][0] + "  |");
        System.out.println("|_____|_____|_____|\n|     |     |     |");
        System.out.println("|  " + board[0][1] + "  |  " + board[1][1] + "  |  " + board[2][1] + "  |");
        System.out.println("|_____|_____|_____|\n|     |     |     |");
        System.out.println("|  " + board[0][2] + "  |  " + board[1][2] + "  |  " + board[2][2] + "  |");
        System.out.println("|_____|_____|_____|\n");
    
    }
    private boolean isThereTTT(char symbole){
        // ligne verticales
        if(board[0][0] == symbole && board[0][1] == symbole && board[0][2] == symbole) return true;
        if(board[1][0] == symbole && board[1][1] == symbole && board[1][2] == symbole) return true;
        if(board[2][0] == symbole && board[2][1] == symbole && board[2][2] == symbole) return true;
        
        // ligne horizontales
        if(board[0][0] == symbole && board[1][0] == symbole && board[2][0] == symbole) return true;
        if(board[0][1] == symbole && board[1][1] == symbole && board[2][1] == symbole) return true;
        if(board[0][2] == symbole && board[1][2] == symbole && board[2][2] == symbole) return true;
  
        // ligne diagonales
        if(board[0][0] == symbole && board[1][1] == symbole && board[2][2] == symbole) return true;
        if(board[2][0] == symbole && board[1][1] == symbole && board[0][2] == symbole) return true;
        
        return false;
    }
    public boolean isCaseEmpty(int x, int y){
        return board[x][y] == ' ';
    }
    public Player GetWinner(){
        return winner;
    }
    public int GetTurns(){
        return turns;
    }
}
