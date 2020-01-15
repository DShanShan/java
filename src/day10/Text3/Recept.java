package day10.Text3;

public class Recept {

    Filter f;

    public Recept() {
    }

    public Recept(Filter f) {
        this.f = f;
    }

    public Filter getF() {
        return f;
    }

    public void setF(Filter f) {
        this.f = f;
    }


    public void recept(User u) {
        if (u.getId() >= 10 && u.getId() <= 19) {
            u.setType("v1");
        } else if (u.getId() >= 20 && u.getId() <= 29) {
            u.setType("v2");
        } else {
            u.setType("A");
        }
        System.out.print(u.getId() + "-" + u.getType() + " ");
    }
}
