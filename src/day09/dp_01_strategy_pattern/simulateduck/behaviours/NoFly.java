package day09.dp_01_strategy_pattern.simulateduck.behaviours;

public class NoFly implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println(this.getClass().getSimpleName()+": I don't have wings, can't fly 😑");
    }
}
