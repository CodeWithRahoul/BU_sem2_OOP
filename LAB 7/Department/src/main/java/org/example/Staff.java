package org.example;
public class Staff extends Employee {
    private String workingHours;

    public Staff(String eName, String eDesig, String eDept, String eEmail, String eContact, int eSalary, int eNo, String workingHours){
        super(eName, eDesig, eDept,eEmail,eContact,eSalary,eNo);
        this.workingHours = workingHours;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "workingHours='" + workingHours + '\'' +
                '}';
    }
}
