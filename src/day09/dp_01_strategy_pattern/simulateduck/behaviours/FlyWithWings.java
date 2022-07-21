package day09.dp_01_strategy_pattern.simulateduck.behaviours;

public class FlyWithWings implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println(this.getClass().getSimpleName()+": Flying with wings...");
    }
}
