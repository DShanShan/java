package day09.Text3;

public interface AA {
    public abstract void showA();

    public default void show10(String str){
        for (int i = 0; i < 10; i++) {
            System.out.print(str+"  ");
        }
    }

    public default void showB10(){
        show10("BBBB");
    }
    public default void showC10(){
        System.out.println();
        show10("CCCC");
    }

}
