import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boolean {
    public class Solution {
        public static void main(String[] args) throws Exception {
            //напишите тут ваш код
            BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(buf.readLine());

            boolean m = (num < 0);
            boolean n = ((num % 2) == 0);
            boolean q = (num == 0);

            if (q) System.out.println("ноль");
            else if (m && n) System.out.println("отрицательное четное число");
            else if (m && !n) System.out.println("отрицательное нечетное число");
            else if (!m && n) System.out.println("положительное четное число");
            else if (!m && !n) System.out.println("положительное нечетное число");
        }
    }
}
