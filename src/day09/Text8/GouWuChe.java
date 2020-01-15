package day09.Text8;

import java.util.ArrayList;

public class GouWuChe {
    ArrayList<Goods> good=new ArrayList<>();

    public void addGoods(Goods goods){
        good.add(goods);
        System.out.println("加入 "+goods.getName()+" 成功");
    }
    public void showGood(){
        for (int i = 0; i < good.size(); i++) {
            System.out.println("     "+good.get(i).getId()+","+good.get(i).getName()+","+good.get(i).getPrice());
        }
    }
    public void total(){
        Double tot=0d;
        for (int i = 0; i < good.size(); i++) {
            tot+=good.get(i).getPrice();
        }
        System.out.println("原 价为："+tot+"元");
        System.out.println("折后价为："+tot*0.88+"元");
    }
}
