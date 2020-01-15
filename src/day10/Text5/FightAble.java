package day10.Text5;

public interface FightAble {
    public abstract void spencialFight();

    public default void commonFight(){
        System.out.println("普通打击");
    }
}
