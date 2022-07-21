package day09.dp_01_strategy_pattern.simulateduck;

import day09.dp_01_strategy_pattern.simulateduck.behaviours.NoFly;
import day09.dp_01_strategy_pattern.simulateduck.behaviours.QuackBeep;

public class PlasticDuck extends Duck{

    public PlasticDuck() {
        quackBehaviour = new QuackBeep();
        flyBehaviour = new NoFly();
    }

    @Override
    void lookUpSide() {
        System.out.println(this.getClass().getSimpleName()+": rolled upside down 🐝");
    }
}
