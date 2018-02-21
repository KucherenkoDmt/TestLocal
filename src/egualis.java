public class egualis {
    public static void main(String[] args) {
        Animals animal = new Animals(1);
        Animals anima2 = new Animals(1);

        System.out.println(animal.equals(anima2));
        //  Object object = new Object()

    }
}
class Animals {
    private int id;

    public Animals(int id){
        this.id = id;
    }
    public boolean equals(Object obj){
        Animals otherAnimals = (Animals) obj;
        return this.id == otherAnimals.id;
    }
}

