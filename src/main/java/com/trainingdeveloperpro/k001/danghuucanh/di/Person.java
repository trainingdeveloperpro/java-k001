package com.trainingdeveloperpro.k001.danghuucanh.di;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {
    private String name;
    private int age;
    private List<Address> addresses;
    private List<String> emails;
    private Map<Integer, String> hobby;
    private Set<String> phoneNumbers;

    public Person(){

    }

    public Person(String name, int age, List<Address> addresses, List<String> emails, Map<Integer,String> hobby, Set<String> phoneNumbers){
        this.name = name;
        this.age = age;
        this.addresses = addresses;
        this.emails = emails;
        this.hobby = hobby;
        this.phoneNumbers = phoneNumbers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public List<String> getEmails() {
        return emails;
    }

    public Map<Integer, String> getHobby() {
        return hobby;
    }

    public void setHobby(Map<Integer, String> hobby) {
        this.hobby = hobby;
    }

    public Set<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(Set<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public void print(){
        System.out.println("Person: " + this.name + "/tAge: " + this.age);
        System.out.println("Address: ");
        for (Address address:addresses){
            System.out.println("\t" + address);
        }
        System.out.println("Email: ");
        for (String email:emails){
            System.out.println("\t" + email);
        }
        System.out.println("Hobby: ");
        Set<Integer> keySet = hobby.keySet();
        for (int key:keySet){
            System.out.println("\t" + hobby.get(key));
        }
        System.out.println("Phone Numbers: ");
        Iterator<String> iterator = phoneNumbers.iterator();
        while (iterator.hasNext()){
            System.out.println("\t" + iterator.next());
        }
        System.out.println("___________________________________________");
    }
}
