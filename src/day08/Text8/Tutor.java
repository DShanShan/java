package day08.Text8;

public class Tutor extends Teacher3 {
    public Tutor() {
    }

    public Tutor(String id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("工号为"+getId()+"的助教"+getName()+"在帮助学生解决问题");
    }
}
