public class Player {
    private char symbol;
    private String name;

    public Player(char symbol, String name){
        this.symbol = symbol;
        this.name = name;
    }

    public void SetSymbol(char symbol){
        this.symbol = symbol;
    }
    public char GetSymbol(){
        return this.symbol;
    }

    public void SetName(String name){
        this.name = name;
    }
    public String GetName(){
        return this.name;
    }  
}
