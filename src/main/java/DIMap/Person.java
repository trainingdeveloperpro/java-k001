package DIMap;
import java.util.Map;
import java.util.Set;

public class Person {
    private String name;
    private int age;
    private Map<Integer,String>  phones;

    public Person() {
    }

    public Person(String name, int age, Map<Integer,String> phones) {
        this.name = name;
        this.age = age;
        this.phones = phones;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Map<Integer, String> getPhones() {
        return phones;
    }

    public void setPhones(Map<Integer, String> phones) {
        this.phones = phones;
    }

    public void print() {
        System.out.println("Person: " + this.name + " Age: " + this.age);

        System.out.println("Phones: ");
        Set<Integer> keySet = phones.keySet();
        for (int key:keySet){
            System.out.println("\t" + phones.get(key));
        }

        System.out.println("--------------------------");
    }
}