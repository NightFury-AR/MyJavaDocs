package day09.dp_03_decorator_pattern.startbuzz;

public abstract class Beverage {
    protected String description = "Unknown Beverage 😑";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
