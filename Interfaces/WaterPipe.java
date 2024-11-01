package Interfaces;

import java.sql.SQLOutput;

public class WaterPipe implements Stateable, EmployeeInfo{
    @Override
    public void printState(int n) {
        if (n == OPEN){
            System.out.println("Water is OPENED");
            empName(n);
        } else if (n == CLOSED){
            System.out.println("Water is CLOSED");
            empName(n);
        } else{
            System.out.println("State is invalid");
            empName(n);
        }
    }

    @Override
    public void empName(int n) {
        if (n == OPEN){
            System.out.println("You should call Daryn");
        } else if (n == CLOSED){
            System.out.println("You should call Eraka");
        } else{
            System.out.println("Don't call anyone dolboeb");
        }
    }
}
