package feature.java8;

class Car {
    String model;
    int kilometers;

    public Car(String model, int kilometers) {
        this.model = model;
        this.kilometers = kilometers;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", kilometers=" + kilometers +
                '}';
    }
}