package day09.dp_01_strategy_pattern.simulateduck.behaviours;

public class Quack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println(this.getClass().getSimpleName()+": quack...quack...quack...");
    }
}
