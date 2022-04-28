package JavaTraining;

import java.util.Scanner;

public class ItemType
{
    String Name;
    Double CostPerDay;
    Double Deposit;


    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Double getCostPerDay() {
        return CostPerDay;
    }

    public void setCostPerDay(Double costPerDay) {
        CostPerDay = costPerDay;
    }

    public Double getDeposit() {
        return Deposit;
    }

    public void setDeposit(Double deposit) {
        Deposit = deposit;
    }

    public void display(){

        System.out.println("Item Details");
        System.out.println("Name "+ getName());
        System.out.println("Cost Per Day "+ getCostPerDay());
        System.out.println("Deposit "+ getDeposit());


    }

    public static void main(String[] args){
        ItemType a = new ItemType();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the type");
        a.setName(s.nextLine());
        System.out.println("Enter cost per day");
        a.setCostPerDay(s.nextDouble());
        System.out.println("Enter deposit Amount ");
        a.setDeposit(s.nextDouble());

        a.display();


    }
}
