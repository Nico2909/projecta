package logic;

public class Car {

    public int getMileAge() {
        return mileAge;
    }

    public void setMileAge(int mileAge) {
        this.mileAge = mileAge;
    }

    private int mileAge;

    public int getActualSpeed() {
        return actualSpeed;
    }

    public void setActualSpeed(int actualSpeed) {
        this.actualSpeed = actualSpeed;
    }

    private int actualSpeed;

    public Car(int mileAge, int actualSpeed) {
        this.mileAge = mileAge;
        this.actualSpeed = actualSpeed;
    }
}
