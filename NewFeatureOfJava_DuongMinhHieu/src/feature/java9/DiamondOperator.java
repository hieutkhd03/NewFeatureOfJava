package feature.java9;

//Cú pháp diamond
public class DiamondOperator {

	//Dấu "<>" ở java9 biểu thị cho kiểu dữ liệu String nên không cần nhét kiểu vào ()
    StringAppender<String> appending = new StringAppender<>() {
        @Override
        public String append(String a, String b) {
            return new StringBuilder(a).append("-").append(b).toString();
        }
    };
    
    public abstract static class StringAppender<T> {
        public abstract T append(String a, String b);
    }
}