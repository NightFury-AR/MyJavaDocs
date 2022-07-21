package day09.dp_03_decorator_pattern.startbuzz.condiments;

import day09.dp_03_decorator_pattern.startbuzz.Beverage;
import day09.dp_03_decorator_pattern.startbuzz.CondimentDecorator;

public class SteamedMilk extends CondimentDecorator {

    private Beverage beverage;

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " , Milk";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }

}
