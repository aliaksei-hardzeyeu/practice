package home_work_1;

public class User implements Comparable<User> {
    String name;
    int age;
    private Gender gender;

    public User(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public Gender getSex() {
        return gender;
    }

    public void setSex(Gender gender) {
        this.gender = gender;
    }

    @Override
    public int compareTo(User o) {
        return this.age - o.age;
    }
}
