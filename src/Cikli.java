public class Cikli {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        //напишите тут ваш код
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("зима");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("весна");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("лето");
        } else {
            System.out.println("осень");
        }
    }
}
// &&(И)  |  |(ИЛИ)
/*int sum = 0;
    int m=0;
        while(m != -1){
                m = Integer.parseInt(b.readLine());
                sum += m;}
                System.out.println(sum);*/
