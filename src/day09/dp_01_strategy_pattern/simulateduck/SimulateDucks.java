package day09.dp_01_strategy_pattern.simulateduck;

import day09.dp_01_strategy_pattern.simulateduck.behaviours.FlyWithWings;
import day09.dp_01_strategy_pattern.simulateduck.behaviours.NoFly;
import day09.dp_01_strategy_pattern.simulateduck.behaviours.Quack;
import day09.dp_01_strategy_pattern.simulateduck.behaviours.QuackBeep;

public class SimulateDucks {

    public static void main(String[] args) {
        Duck realDuck = new OriginalDuck();
        Duck toyDuck  = new PlasticDuck();

        realDuck.setFlyBehaviour(new FlyWithWings());
        realDuck.setQuackBehaviour(new Quack());

        toyDuck.setFlyBehaviour(new NoFly());
        toyDuck.setQuackBehaviour(new QuackBeep());

        System.out.println(" Original Duck ");
        System.out.println(" ============= ");
        realDuck.lookUpSide();
        realDuck.performFly();
        realDuck.performQuack();
        realDuck.swim();
        System.out.println(" ===================================================================================== ");
        System.out.println(" Toy Duck ");
        System.out.println(" ============= ");
        toyDuck.lookUpSide();
        toyDuck.performFly();
        toyDuck.performQuack();
        toyDuck.swim();
        System.out.println(" ===================================================================================== ");

    }

}
