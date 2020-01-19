package day21.Demo.Demo.Demo2;

public class Student {
    private String name="张三";
    private Integer age;

    static {
        System.out.println("这是静态代码块");
    }

    public Student() {
        System.out.println("public,这是无参构造器");
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
        System.out.println("public，二个参数的构造器->name，age");
    }

    private Student(String name) {
        this.name = name;
        System.out.println("private,一个参数的构造器->name");
    }

    private Student(Integer age) {
        this.age = age;
        System.out.println("private,一个参数的构造器->age");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
