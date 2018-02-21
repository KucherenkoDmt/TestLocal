import java.time.Year;

//конструктор
public class Leeson20 {
    public static void main(String[] args) {
       Human human1 = new Human("Вов",223);
	   Human human3 = new Human("Вов",23);
       Human human2 = new Human("Том",0);
       human1.printNumberOfPeople();
       human2.printNumberOfPeople();
	   human3.printNumberOfPeople();
       Human h3 = new Human("Carl",54);
       h3.printNumberOfPeople();

     //   Human.description="Nicek";
      //  Human.getDescription();
    }
}
    class Human {
        private String name;
        private int age;
     //   public static String description;
        private static int countPeople;

      /*  public Human(){
            System.out.println("привет из первого конструктора!");
            this.name="Имя по умолчанию";
            this.age=0;
        }
        public Human(String name){
            System.out.println("привет из второго конструктора");
            this.name=name;
        }
        */
        public Human(String name, int age){
          //  System.out.println("привет из третьего конструктора"+name+age);
            this.name=name;
            this.age=age;
            countPeople++;
        }
        public  void printNumberOfPeople() {
            System.out.println(" количиство людей "+countPeople);
        }

 //   public void setName(String name){ this.name=name; }
 //   public void setAge (int age){ this.age=age;}
  //  public static void getDescription(){
    //    System.out.println(description);
    }

