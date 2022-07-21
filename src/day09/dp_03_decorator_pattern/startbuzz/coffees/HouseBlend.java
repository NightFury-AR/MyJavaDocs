package day09.dp_03_decorator_pattern.startbuzz.coffees;

import day09.dp_03_decorator_pattern.startbuzz.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend ";
    }

    @Override
    public double cost() {
        return 89;
    }
}
