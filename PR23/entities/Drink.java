package PR23.entities;
import PR23.interfaces.*;

public final class Drink implements Item {
    private final double cost;
    private final String name;
    private final String description;

    public static final double DEFAULT_COST = 0.0;

    public Drink(String name, String description) {
        this(DEFAULT_COST, name, description);
    }

    public Drink(double cost, String name, String description) {
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
