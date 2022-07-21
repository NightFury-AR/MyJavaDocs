package day09.dp_03_decorator_pattern.startbuzz.coffees;

import day09.dp_03_decorator_pattern.startbuzz.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast ";
    }

    @Override
    public double cost() {
        return .99;
    }
}
