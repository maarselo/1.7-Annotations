package level1.model;

public abstract class Worker {
    private String name;
    private String surname;
    private double pricePerHour;

    public abstract double calculateSalary(double hoursWorked);

    public Worker(String name, String surname, double pricePerHour) {
        this.name = name;
        this.surname = surname;
        this.pricePerHour = pricePerHour;
    }

    public String getName() {return name;}
    public String getSurname() {return surname;}
    public double getPricePerHour() {return pricePerHour;}
    public void setName(String name) {this.name = name;}
    public void setSurname(String surname) {this.surname = surname;}
    public void setPricePerHour(double pricePerHour) {this.pricePerHour = pricePerHour;}
}
