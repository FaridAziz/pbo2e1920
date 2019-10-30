package Percobaan2;

import Percobaan1.Employee;
import Percobaan1.PermanentEmployee;

public class Tester2 {
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("Didik", 500);
        Employee e;
        e = pEmp;
        System.out.println(""+e.getEmployeeInfo());
        System.out.println("--------------------");
        System.out.println(""+pEmp.getEmployeeInfo());
    }
}
