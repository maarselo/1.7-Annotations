package level3;

import level3.Person;
import level3.SerializableObject;

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
