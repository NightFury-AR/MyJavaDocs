package day09.dp_01_strategy_pattern.simulateduck;

import day09.dp_01_strategy_pattern.simulateduck.behaviours.FlyBehaviour;
import day09.dp_01_strategy_pattern.simulateduck.behaviours.QuackBehaviour;

public abstract class Duck {

     FlyBehaviour flyBehaviour;

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    QuackBehaviour quackBehaviour;

    public void performQuack() {
        quackBehaviour.quack();
    }
    public void performFly() {
        flyBehaviour.fly();
    }

    public void swim() { //all ducks will float
        System.out.println(this.getClass().getSimpleName()+": swimming...");
    }

    abstract void lookUpSide();
}
