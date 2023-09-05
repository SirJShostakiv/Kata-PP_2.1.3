package app;

public class Cat {
    private String name;
    private String sex;

    public Cat() {
    }
    public Cat(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }
}
