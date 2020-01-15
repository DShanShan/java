package day14.work2.Text2.Text1;

public class Son extends Father {
    /*public static void eat() throws TonguePainException{

    }*/
    /*public static void eat() throws PainExecption{

    }*/
    /*public static void eat() throws ToothPainException{

    }*/
    /*public static void eat() throws BigToothPainException{

    }*/
    public static void eat() throws BigToothPainException,FrontToothPainExcption{

    }
    /*public static void drink() throws ToothPainException{

    }*/
    public static void drink(){
        try {
            System.out.println("喝到了100度的水");
            throw new TonguePainException();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
