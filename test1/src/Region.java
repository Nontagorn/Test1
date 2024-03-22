import java.util.ArrayList;
import java.util.List;

public class Region {
    private int row;
    private int column;
    private int deposit;
    private Player owner;

    public Region(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }



    public List<Region> getAdjacentRegions() {
        List<Region> adjacentRegions = new ArrayList<>();


        adjacentRegions.add(new Region(row, column - 1));
        adjacentRegions.add(new Region(row, column + 1));

        if (row % 2 == 0) {

            adjacentRegions.add(new Region(row - 1, column));
            adjacentRegions.add(new Region(row - 1, column + 1));
            adjacentRegions.add(new Region(row + 1, column));
            adjacentRegions.add(new Region(row + 1, column + 1));
        } else {

            adjacentRegions.add(new Region(row - 1, column - 1));
            adjacentRegions.add(new Region(row - 1, column));
            adjacentRegions.add(new Region(row + 1, column - 1));
            adjacentRegions.add(new Region(row + 1, column));

        return adjacentRegions;
    }
        return adjacentRegions;
}
}