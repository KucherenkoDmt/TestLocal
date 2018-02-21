import java.util.Scanner;

public class ScanerSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи возраст");
        int age = scanner.nextInt();
         switch (age){
             case 0:
                 System.out.println("ты родился");
                 break;
             case 7:
                 System.out.println("ты пошел в школу");
                 break;
             case 18:
                 System.out.println("ты закончил школу");
                 break;
             default:
                 System.out.println("ничего нет");

         }

    }
}
    /*
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    String day = bufferedReader.readLine(4);
    int d = Integer.parseInt(day);
*/
    //BufferedReader bf = new BufferedReader(InputStreamReader(System.in));
  //  int i = Integer.parseInt(bf.readLine());