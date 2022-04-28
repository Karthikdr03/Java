package JavaTraining;

import java.util.Scanner;


public class User
{
    private String Name;
    private String Username;
    private String Password;
    private long PhoneNumber;

    public static boolean comparePhoneNumber(User a, User b) {
        System.out.println(a.getPhoneNumber());
        System.out.println(b.getPhoneNumber());
        return(a.getPhoneNumber() == b.getPhoneNumber() );

    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        Username = Username;
    }

    public long getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(long PhoneNumber) {
        PhoneNumber = PhoneNumber;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }



    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        User a = new User();
        System.out.println("Enter Name - ");
        a.setName(s.nextLine());
        System.out.println("Enter Username -");
        a.setUsername(s.nextLine());
        System.out.println("Enter Password -");
        a.setPassword(s.nextLine());
        System.out.println("Enter Phone No -");
        a.setPhoneNumber(s.nextLong());


        User b = new User();
        System.out.println("Enter name- ");
        s.nextLine();
        b.setName(s.nextLine());
        System.out.println("Enter Username -");
        b.setUsername(s.nextLine());
        System.out.println("Enter Password -");
        b.setPassword(s.nextLine());
        System.out.println("Enter Phone No -");
        b.setPhoneNumber(s.nextLong());



        System.out.println(comparePhoneNumber(a,b));
    }
}
