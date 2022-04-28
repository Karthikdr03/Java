package JavaTraining;

import java.util.Scanner ;

class Person$
{
    private String name;
    private String dateofbirth;
    private String gender;
    private String mobilenumber;
    private String bloodgroup;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDateofbirth()
    {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth)
    {
        this.dateofbirth = dateofbirth;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public String getMobilenumber()
    {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber)
    {
        this.mobilenumber = mobilenumber;
    }

    public String getBloodgroup()
    {
        return bloodgroup;
    }

    public void setBloodgroup(String bloodgroup)
    {
        this.bloodgroup = bloodgroup;
    }
}

public class donor extends Person$
{
    private String bloodBankname;
    private String bloodType;
    private String donationDate;

    public String getBloodBankname()
    {
        return bloodBankname;
    }

    public void setBloodBankname(String bloodBankname)
    {
        this.bloodBankname = bloodBankname;
    }

    public String getDonarType()
    {
        return bloodType;
    }

    public void setDonarType(String DonarType)
    {
        this.bloodType = DonarType;
    }

    public String getDonationDate()
    {
        return donationDate;
    }

    public void setDonationdate(String donationDate)
    {
        this.donationDate = donationDate;
    }

    public void DisplayDonantionDetails(donor a)
    {
        System.out.println("Donation Details");
        System.out.println("Name"+ a.getName() );
        System.out.println("DOB"+ a.getDateofbirth());
        System.out.println("Mobile no"+a.getMobilenumber());
        System.out.println("Blood group"+getBloodgroup());
        System.out.println("Blood bank name"+getBloodBankname());
        System.out.println("Donor type"+ getDonarType());
        System.out.println("Donation date"+getDonationDate());

    }

    public static void main(String[] Stngs)
    {
        donor a = new donor();
        Scanner s= new Scanner(System.in);

        System.out.println("Enter name: ");
        a.setName(s.nextLine());
        System.out.println("Enter DOB :");
        a.setDateofbirth(s.nextLine());
        System.out.println("Enter Gender : ");
        a.setGender(s.nextLine());
        System.out.println("Enter mobile no: ");
        a.setMobilenumber(s.nextLine());
        System.out.println("Enter Blood Group :");
        a.setBloodgroup(s.nextLine());
        System.out.println("Enter Blood Bank Name : ");
        a.setBloodBankname(s.nextLine());
        System.out.println("Enter Donor Type :");
        a.setDonarType(s.nextLine());
        System.out.println("Enter Donation Date : ");
        a.setDonationdate(s.nextLine());
        s.close();
        a.DisplayDonantionDetails(a);
    }
}
