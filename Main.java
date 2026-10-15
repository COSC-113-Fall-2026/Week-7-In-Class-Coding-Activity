public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eats(); //Inherited from superclass(Animal)
        myDog.offspring(); //Dog subclass

        //Ford and SuperCar classes
        Ford myFord = new Ford(); //Creating an object of the subclass(Ford)
        myFord.drive(); //Inherited from superclass(Car)
        myFord.carModel(); //Ford subclass
    }
}
