package collections.twoListInMap;

public class User {
    private String name;
    private int age;
    private boolean isMale;
    public Specialty specialty;

    public User(String name, int age, boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    @Override
    public String toString() {
        return
                " name ='" + name + '\'' +
                ", age = " + age +
                ", isMale = " + isMale +
                '}';
    }
}
