package day09.dp_01_strategy_pattern.fightinggame;

public class Sword implements WeaponBehaviour{
    @Override
    public String useWeapon() {
        return "using sword!";
    }
}
