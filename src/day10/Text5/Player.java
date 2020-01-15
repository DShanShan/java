package day10.Text5;

public class Player {
    public FightAble select(String str){
        if ("法术角色".equals(str)){
            System.out.println("选择："+str);
            Master m=new Master();
            m.spencialFight();
            m.commonFight();
        }else if ("武力角色".equals(str)){
            System.out.println("选择："+str);
            Soldier s=new Soldier();
            s.spencialFight();
            s.commonFight();
        }
        return null;
    }
}
