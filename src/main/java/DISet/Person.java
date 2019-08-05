package DISet;

import java.util.Iterator;
import java.util.Set;

public class Person {
    private String name;
    private int age;
    private Set<String> knowledge;

    public Person() {
    }

    public Person(String name, int age, Set<String> knowledge) {
        this.name = name;
        this.age = age;
        this.knowledge = knowledge;
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

    public Set<String> getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(Set<String> knowledge) {
        this.knowledge = knowledge;
    }

    public void print() {
        System.out.println("Person: " + this.name + " Age: " + this.age);

        System.out.println("Knowledge : ");
        Iterator<String> iterator = knowledge.iterator();
        while (iterator.hasNext()){
            System.out.println("\n" + iterator.next());
        }
        System.out.println("--------------------------");
    }
}