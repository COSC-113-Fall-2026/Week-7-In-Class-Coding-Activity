public class LivingThing {
    public void grow() {
        System.out.println("This is a live plant.");
    }
    
}

// Subclass inheriting from LivingThing 
    class Plant extends LivingThing { 
        public void photosynthesize() {
            System.out.println("The uses photosynthesize to make food.");
        }
    }
