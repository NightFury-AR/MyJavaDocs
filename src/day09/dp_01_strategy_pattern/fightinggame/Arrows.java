package day09.dp_01_strategy_pattern.fightinggame;

public class Arrows implements WeaponBehaviour{
    @Override
    public String useWeapon() {
        return "using arrows!";
    }
}
