package day09.dp_01_strategy_pattern.fightinggame;

public class FightingGame {
    public static void main(String[] args) {
        //weapons available
        WeaponBehaviour sword = new Sword();
        WeaponBehaviour arrows = new Arrows();

        Character king = new King();
        king.setWeaponBehaviour(sword);

        Character queen = new Queen();
        queen.setWeaponBehaviour(arrows);

        king.fight();
        queen.fight();

    }
}
