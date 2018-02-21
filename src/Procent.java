

public class Procent {

    //а потом присваивает переменной x остаток от деления введенного числа на 5, таким образом получает кол-во минут прошедшее с начала очередного пятиминутного цикла
    //double x = n%5;

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String A = reader.readLine();
    double n = Integer.parseInt(A);
    double x = n%5;

        if (x>=0.0 && x<3.0)
    {
        System.out.println("зёленый");
    }
        else if ((x>=3.0)&&(x<4.0))
    {
        System.out.println("жёлтый");
    }
        else if ((x>=4.0)&&(x<5.0))
    {
        System.out.println("красный");
    }

}
