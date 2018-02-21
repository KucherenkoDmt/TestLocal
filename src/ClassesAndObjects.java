public class ClassesAndObjects {
    public static void main(String[] args) {
      Person person1 = new Person();
      person1.setName("");
      person1.setAge(2);
      System.out.println("Выводим значение в мейн методе"+person1.getName());
      System.out.println("Выводим значение в мейн методе"+person1.getAge());


    }
}
class Person{
//e класса могут быть
// 1. данные(поля)
// 2. Действия, которые он может совершать
   private String name;
   private int age;

  public void setName(String userName){
     if (userName.isEmpty()){
          System.out.println("пустое поле");
      }else{
         name=userName;
      }

  }
  public void setAge(int userAge){
     if (userAge<0){
         System.out.println("пароль должен быть положительным");
     }else{
         age=userAge;
     }


  }
  public String getName(){
      return name;
  }
  public int getAge(){
      return age;
  }


    int calculateYearsToRetirement(){
        int years = 65-age;
        return years;
    }

    void speak(){
        for(int i=0; i<3; i++){
        System.out.println("Меня зовут "+name+",мне "+age+" лет");}
    }
    void sayHello(){
        System.out.println("Привет");
    }
}

