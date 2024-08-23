package feature.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReference {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", 45000));
        cars.add(new Car("Honda", 60000));
        cars.add(new Car("Ford", 30000));
        cars.add(new Car("BMW", 70000));
        cars.add(new Car("Tesla", 25000));

        // Sử dụng method reference để chuyển đổi các đối tượng Car thành chuỗi mô tả
        List<String> methodReference = cars.stream()
                                           .map(Car::toString)
                                           .collect(Collectors.toList());

        // In ra danh sách chuỗi mô tả của các xe
        System.out.println("Cars descriptions:");
        for (String description : methodReference) {
            System.out.println(description);
        }
    }
}