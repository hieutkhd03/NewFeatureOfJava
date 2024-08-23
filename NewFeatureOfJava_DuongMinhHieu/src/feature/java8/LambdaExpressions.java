package feature.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Sau khi dùng Lambda

	/*	Chuyển danh sách xe vào phương thức stream() 
	 => gọi thực hiện phương thức filter(..) để lọc theo điều kiện đưa ra ,
	  ở đây tham số car ứng với các phần tử trong danh sách 
	 => Lọc xong gọi collect để chuyển toàn bộ nội dung stream thành danh sách 
	 và trả về danh sách Car được chọn */
	public class LambdaExpressions {

	    public static List<Car> findCarsOldWay(List<Car> cars) {
	        List<Car> selectedCars = new ArrayList<>();
	        for (Car car : cars) {
	            if (car.kilometers < 50000) {
	                selectedCars.add(car);
	            }
	        }
	        return selectedCars;
	    }

	    public static void main(String[] args) {
	        List<Car> cars = new ArrayList<>();
	        cars.add(new Car("Toyota", 45000));
	        cars.add(new Car("Honda", 60000));
	        cars.add(new Car("Ford", 30000));
	        cars.add(new Car("BMW", 70000));
	        cars.add(new Car("Tesla", 25000));

	        List<Car> selectedCars = findCarsOldWay(cars);

	        System.out.println("Cars with less than 50,000 kilometers:");
	        for (Car car : selectedCars) {
	            System.out.println(car);
	        }
	    }
	}