public class Car { //Superclass
    public void drive() { //Method from the superclass
        System.out.println("The car drives!");
    }
}
//Subclass(Ford)
class Ford extends Car { // subclass(Ford) extends the superclass(Car)
    public void carModel() { //Method from the subclass
        System.out.println("The car model is a Ford!");
    }
}
