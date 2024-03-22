import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int budget;
    private List<Region> cityCenters;

    public Player(String name, int budget) {
        this.name = name;
        this.budget = budget;
        this.cityCenters = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getBudget() {
        return budget;
    }

    public void addCityCenter(Region region) {
        cityCenters.add(region);
        region.setOwner(this);
    }

    public void removeCityCenter(Region region) {
        cityCenters.remove(region);
        region.setOwner(null);
    }

    public List<Region> getCityCenters() {
        return cityCenters;
    }
}