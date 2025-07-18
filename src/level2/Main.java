package level2;

public class Main {
    public static void main(String []args) {
        Person person1 = new Person("Alejandra", 18);
       try {
           SerializableObject.serializableToJson(person1);
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
    }
}
