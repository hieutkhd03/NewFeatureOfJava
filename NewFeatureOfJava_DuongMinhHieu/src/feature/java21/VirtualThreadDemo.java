package feature.java21;

public class VirtualThreadDemo {
    public static void main(String[] args) {
        // Tạo và khởi động virtual thread đầu tiên
        // Virtual thread là một dạng thread nhẹ được hỗ trợ bởi JVM,
        // cho phép tạo ra số lượng lớn các thread mà không tốn nhiều tài nguyên.
        Thread vThread1 = Thread.ofVirtual().start(() -> {
            // Vòng lặp in ra các giá trị từ 0 đến 9
            for (int i = 0; i < 10; i++) {
                System.out.println("Virtual Thread 1: " + i);
            }
        });

        // Tạo và khởi động virtual thread thứ hai
        Thread vThread2 = Thread.ofVirtual().start(() -> {
            // Vòng lặp in ra các giá trị từ 0 đến 9
            for (int i = 0; i < 10; i++) {
                System.out.println("Virtual Thread 2: " + i);
            }
        });

        // Sử dụng phương thức join() để đảm bảo thread chính chờ cả hai virtual thread kết thúc
        // join() giúp thread chính không kết thúc trước khi các virtual thread hoàn thành công việc của chúng.
        try {
            vThread1.join();
            vThread2.join();
        } catch (InterruptedException e) {
            // Xử lý ngoại lệ nếu quá trình chờ bị gián đoạn
            e.printStackTrace();
        }
    }
}
