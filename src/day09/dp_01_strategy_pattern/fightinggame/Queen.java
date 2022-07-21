package day09.dp_01_strategy_pattern.fightinggame;

public class Queen extends Character{

    @Override
    void fight() {
        System.out.println(" Queen is "+weaponBehaviour.useWeapon());
    }
}
