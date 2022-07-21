package day09.dp_01_strategy_pattern.fightinggame;

abstract class Character {
    WeaponBehaviour weaponBehaviour;
    abstract void fight();
    public void setWeaponBehaviour(WeaponBehaviour weaponBehaviour) {
        this.weaponBehaviour = weaponBehaviour;
    }
}
