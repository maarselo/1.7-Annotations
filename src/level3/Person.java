package level3;

@SerializableJson(directory = "C:\\Users\\Marcelo V\\IdeaProjects\\1.7-Annotations\\src\\level3\\output")
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {return name;}
    public int getAge() {return age;}
}
