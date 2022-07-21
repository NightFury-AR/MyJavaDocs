package day09.dp_01_strategy_pattern.fightinggame;

public class King extends Character {

    @Override
    void fight() {
        System.out.println(" King is " + weaponBehaviour.useWeapon());
    }
}
