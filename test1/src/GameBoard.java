import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameBoard {
    private int numRows;
    private int numCols;
    private Map<String, Region> regions;
    private List<Player> players;

    public GameBoard(int numRows, int numCols) {
        this.numRows = numRows;
        this.numCols = numCols;
        this.regions = new HashMap<>();
        this.players = new ArrayList<>();
        initializeRegions();
    }

    private void initializeRegions() {
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                Region region = new Region(i, j);
                regions.put(getRegionKey(i, j), region);
            }
        }
    }

    private String getRegionKey(int row, int col) {
        return row + "-" + col;
    }

    public Region getRegion(int row, int col) {
        return regions.get(getRegionKey(row, col));
    }

    public void placeInitialCityCenters(Map<String, Player> players) {
        for (Player player : players.values()) {
            int randomRow = (int) (Math.random() * numRows);
            int randomCol = (int) (Math.random() * numCols);
            Region region = getRegion(randomRow, randomCol);
            player.addCityCenter(region);
        }
    }

    public void initializeDeposits(int initialDeposit) {
        for (Region region : regions.values()) {
            region.setDeposit(initialDeposit);
        }
    }

    public boolean isValidMove(int row, int col) {
        return row >= 0 && row < numRows && col >= 0 && col < numCols;
    }


    public boolean isGameOver() {
        int remainingPlayers = players.size();
        return remainingPlayers == 1;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public List<Player> getPlayers() {
        return players;
    }
}