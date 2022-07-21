package day09.dp_03_decorator_pattern.startbuzz.condiments;

import day09.dp_03_decorator_pattern.startbuzz.Beverage;
import day09.dp_03_decorator_pattern.startbuzz.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " , Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }

}
