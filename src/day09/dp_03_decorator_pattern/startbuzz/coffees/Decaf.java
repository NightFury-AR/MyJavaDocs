package day09.dp_03_decorator_pattern.startbuzz.coffees;

import day09.dp_03_decorator_pattern.startbuzz.Beverage;

public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf ";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
