package P1;

public class VidimostObject {
           public static void main(String[] args) {
            Human human6 = new Human("Настя", false, 80);
            Human human7 = new Human("Михаил", true, 80);
            Human human8 = new Human("Галя", false, 80);
            Human human9 = new Human("Иван", true, 80);
            Human father = new Human("Павел", true, 50, human7, human6);
            Human mother = new Human("Оля", false, 55, human9, human8);
            Human human1 = new Human("Аня", false, 21, father, mother);
            Human human2 = new Human("Катя", false, 5, father, mother);
            Human human3 = new Human("Аня", false, 21, father, mother);

            System.out.println(human6.toString());
            System.out.println(human7.toString());
            System.out.println(human8.toString());
            System.out.println(human9.toString());
            System.out.println(father.toString());
            System.out.println(mother.toString());
            System.out.println(human1.toString());
            System.out.println(human2.toString());
            System.out.println(human3.toString());
        }

        public static class Human {
            Human mother;
            Human father;
            String name;
            boolean sex;
            int age;

            public Human(String name, boolean sex, int age, Human father, Human mother ){
                this.name=name;
                this.sex=sex;
                this.age=age;
                this.mother=mother;
                this.father=father;
            }
            public Human(String name, boolean sex, int age){
                this.name=name;
                this.sex=sex;
                this.age=age;
            }

            public String toString() {
                String text = "";
                text += "Имя: " + this.name;
                text += ", пол: " + (this.sex ? "мужской" : "женский");
                text += ", возраст: " + this.age;

                if (this.father1 != null)
                    text += ", отец: " + this.father.name;

                if (this.mother2 != null)
                    text += ", мать: " + this.mother.name;

                return text;
            }
        }
    }
}
