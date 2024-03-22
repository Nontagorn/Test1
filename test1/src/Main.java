
interface Statement {
    void execute();
}

public class Main {
    public static void main(String[] args) {
        int numRows = 9;
        int numCols = 18;
        int numPlayers = 2;
        int startingBudget = 100;
        int initialDeposit = 10;
        int maxDeposit = 100;


        UPBEATGame game = new UPBEATGame(numRows, numCols, numPlayers, startingBudget, initialDeposit, maxDeposit);
        game.startGame();

    }
}

