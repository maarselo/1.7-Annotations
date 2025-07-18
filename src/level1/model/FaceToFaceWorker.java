package level1.model;

public class FaceToFaceWorker extends Worker{
    public static double gasoline = 75.0;

    public FaceToFaceWorker(String name, String surname, double pricePerHour) {
        super(name, surname, pricePerHour);
    }

    @Override
    public double calculateSalary(double hoursWorked) {
        return (hoursWorked * super.getPricePerHour() + gasoline);
    }

    @SuppressWarnings("deprecated")
    @Deprecated
    public void greet(){
        System.out.println("Whats up, I'm " + super.getName() + " a super face-to-face worker.");
    }

    public void greetPolite(){
        System.out.println("Hi, nice to meet you, my name is " + super.getName()+ ". I worked at this office to support all my team.");
    }

}
