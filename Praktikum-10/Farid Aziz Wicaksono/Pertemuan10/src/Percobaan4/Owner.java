package Percobaan4;

import Percobaan1.ElectricityBill;
import Percobaan1.Employee;
import Percobaan1.Payable;
import Percobaan1.PermanentEmployee;

public class Owner {
    public void pay(Payable p){
        System.out.println("Total payment = "+p.getPaymentAmount());
        if(p instanceof ElectricityBill){
            ElectricityBill eb = (ElectricityBill) p;
            System.out.println(""+eb.getBillInfo());
        }
        else if(p instanceof PermanentEmployee){
            PermanentEmployee pe = (PermanentEmployee) p;
            pe.getEmployeeInfo();
            System.out.println(""+pe.getEmployeeInfo());
        }
    }
    public void showMyEmployee(Employee e){
        System.out.println(""+e.getEmployeeInfo());
        if(e instanceof PermanentEmployee){
            System.out.println("You have to pay het/him mounthly!!!");
        }
        else
            System.out.println("No need to pay him/her :)");
    }
}
