import java.util.HashMap;
import java.util.Map;

public class UPBEATGame {
    private int numRows;
    private int numCols;
    private int numPlayers;
    private int startingBudget;
    private int initialDeposit;
    private int maxDeposit;


    private GameBoard gameBoard;

    public UPBEATGame(int numRows, int numCols, int numPlayers, int startingBudget, int initialDeposit, int maxDeposit) {
        this.numRows = numRows;
        this.numCols = numCols;
        this.numPlayers = numPlayers;
        this.startingBudget = startingBudget;
        this.initialDeposit = initialDeposit;
        this.maxDeposit = maxDeposit;


        this.gameBoard = new GameBoard(numRows, numCols);
    }

    public void startGame() {
        initializePlayers();
        gameBoard.placeInitialCityCenters(getPlayers());
        gameBoard.initializeDeposits(initialDeposit);
        playGame();
    }

    private void initializePlayers() {
        for (int i = 0; i < numPlayers; i++) {
            String playerName = "Player " + (i + 1);
            Player player = new Player(playerName, startingBudget);
            gameBoard.addPlayer(player);
        }
    }

    private void playGame() {
        while (!gameBoard.isGameOver()) {
            for (Player player : gameBoard.getPlayers()) {
                executePlayerTurn(player);
            }
        }
    }

    private void executePlayerTurn(Player player) {
        // Implement player's turn logic
    }

    private Map<String, Player> getPlayers() {
        Map<String, Player> players = new HashMap<>();
        for (Player player : gameBoard.getPlayers()) {
            players.put(player.getName(), player);
        }
        return players;
    }
}