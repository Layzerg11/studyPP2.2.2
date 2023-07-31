package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private String model;

    private int age;

    private int mileAge;

    public Car() {
    }

    public Car(String model, int age, int mileAge) {
        this.model = model;
        this.age = age;
        this.mileAge = mileAge;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMileAge() {
        return mileAge;
    }

    public void setMileAge(int mileAge) {
        this.mileAge = mileAge;
    }

    @Override
    public String toString() {
        return "model='" + model + '\'' +
                ", age=" + age +
                ", mileAge=" + mileAge;
    }
}


