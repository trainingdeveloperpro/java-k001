package Set;

import java.util.Set;

public class PhoneNumber {
    Set<Integer> listOfPhoneNumber;

    public PhoneNumber() {
    }

    public PhoneNumber(Set<Integer> listOfPhoneNumber) {
        this.listOfPhoneNumber = listOfPhoneNumber;
    }

    public Set<Integer> getListOfPhoneNumber() {
        return listOfPhoneNumber;
    }

    public void setListOfPhoneNumber(Set<Integer> listOfPhoneNumber) {
        this.listOfPhoneNumber = listOfPhoneNumber;
    }

    public void print(){
        System.out.println("List of phone number:");
        for(Integer key : listOfPhoneNumber){
            System.out.println(key);
        }
    }
}
