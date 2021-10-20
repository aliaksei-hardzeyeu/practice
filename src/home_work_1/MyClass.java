package home_work_1;

public class MyClass {
    int number;

    public MyClass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "MyClass number= " + number + " | ";
    }
}
