package day09.dp_01_strategy_pattern.simulateduck;

import day09.dp_01_strategy_pattern.simulateduck.behaviours.NoFly;
import day09.dp_01_strategy_pattern.simulateduck.behaviours.QuackBeep;

public class OriginalDuck extends Duck {

    public OriginalDuck() {
        flyBehaviour = new NoFly();
        quackBehaviour = new QuackBeep();
    }

    @Override
    void lookUpSide() {
        System.out.println(this.getClass().getSimpleName()+": Looking the sky...🦆");
    }
}
