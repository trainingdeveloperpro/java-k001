package DependentCollection;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {
    private String name;
    private int age;
    private List<Address> addresses;
    private List<String> emails;
    private Map<Integer, String> subjects;
    private Set<String> phoneNumber;

    public Person() {
    }

    public Person(String name, int age, List<Address> addresses, List<String> emails, Map<Integer, String> subjects, Set<String> phoneNumber) {
        this.name = name;
        this.age = age;
        this.addresses = addresses;
        this.emails = emails;
        this.subjects = subjects;
        this.phoneNumber = phoneNumber;
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

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public Map<Integer, String> getSubjects() {
        return subjects;
    }

    public void setSubjects(Map<Integer, String> subjects) {
        this.subjects = subjects;
    }

    public Set<String> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Set<String> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void print() {
        System.out.println("Person: " + this.name + " Age: " + this.age);
        System.out.println("Address: ");
        for (Address address : addresses) {
            System.out.println(address);
        }
        System.out.println("Email:");
        for (String email : emails) {
            System.out.println(email);
        }

        System.out.println("Subjects: ");
        Set<Integer> set = subjects.keySet();
        for (int key : set){
            System.out.println("\t" + subjects.get(key));
        }

        System.out.println("PhoneNumber: ");
        Iterator<String> iterator = phoneNumber.iterator();
        while(iterator.hasNext()){
            System.out.println("\t" + iterator.next());
        }
        System.out.println("++++++++++++++++++++++++++++++++++");
    }
}