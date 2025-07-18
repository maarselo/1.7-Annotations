package level1.model;

public class OnlineWorker extends Worker{
    public static final double INTERNET = 35.0;
    public OnlineWorker(String name, String surname, double pricePerHour) {
        super(name, surname, pricePerHour);
    }

    @Override
    public double calculateSalary(double hoursWorked) {
        return (hoursWorked * super.getPricePerHour() + INTERNET);
    }

    @Deprecated
    public void greet(){
        System.out.println("Whats up, I'm " + super.getName() + " a super online worker.");
    }

    public void greetPolite(){
        System.out.println("Hi, nice to meet you, my name is " + super.getName() + ". I worked online from mmy house to support all my team.");
    }
}
