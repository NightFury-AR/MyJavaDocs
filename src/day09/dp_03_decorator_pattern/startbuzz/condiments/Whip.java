package day09.dp_03_decorator_pattern.startbuzz.condiments;

import day09.dp_03_decorator_pattern.startbuzz.Beverage;
import day09.dp_03_decorator_pattern.startbuzz.CondimentDecorator;

public class Whip extends CondimentDecorator {

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " , Whip";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }

}
