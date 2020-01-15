package day14.work1.Text2;

import java.util.HashMap;
import java.util.Set;

public class Text10 {
    public static void main(String[] args) {
        String[] arr1={"黑龙江省","浙江省","江西省","广东省","福建省"};
        String[] arr2={"哈尔滨","杭州","南昌","广州","福州"};
        HashMap<String,String> map=new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            map.put(arr1[i],arr2[i]);
        }

        Set<String> keys = map.keySet();
        for (String str:keys){
            System.out.println(str+"="+map.get(str));
        }
    }
}
