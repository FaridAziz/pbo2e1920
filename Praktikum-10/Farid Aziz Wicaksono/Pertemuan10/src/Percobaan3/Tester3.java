package Percobaan3;

import Percobaan1.ElectricityBill;
import Percobaan1.Employee;
import Percobaan1.IntershipEmployee;
import Percobaan1.Payable;
import Percobaan1.PermanentEmployee;

public class Tester3 {
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("Didik", 500);
        IntershipEmployee iEmp = new IntershipEmployee("Sunarto", 5);
        ElectricityBill eBill = new ElectricityBill(5, "A-1");
        Employee e[] = {pEmp, iEmp};
        Payable p[] = {pEmp, eBill};
        Employee e2[] = {pEmp, iEmp};
    }
}
