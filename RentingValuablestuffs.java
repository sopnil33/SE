import java.lang.*;

public class RentingValuableStuffs
{  
private String Name ;
private String ContactNumber;
private String PermanentAddress;
private String User_Id;
private double AccountBalance;

public void setName(String n)
{ 
Name= n;
}
public void setContactNumber ( String CN )
{
	ContactNumber=CN;
}
public void setPermanentAddress ( String PA)
{
	PermanentAddress= PA;
}
public void setUserID ( String U_ID)
{
	User_Id= U_ID;
}
public void setAccountBalance( double AB)
{
	AccountBalance= AB;
}
public String getName()
{
	return Name; 
}
public String getContactNumber()
{
	return ContactNumber; 
}
public String getPermanentAddress()
{
	return PermanentAddress;
}
public String getUserID ()
{
	return User_Id;
}

public double getAccountBalance()
{
	return AccountBalance;
}
public static void main ( String args[])
{ 
    RentingValuableStuffs rvs = new RentingValuableStuffs();
	rvs.setName("Fariha");
	rvs.setContactNumber ("01619172277");
	rvs.setPermanentAddress (" Khilgaon");
	rvs.setUserID (" 12-344-5");
	rvs.setAccountBalance(" 2000,00.78");
}

System.out.println("Name is : "+rvs.getName());
System.out.println("ContactNumber is :" +rvs.getContactNumber());
System.out.println("PermanentAddress is :" +rvs.getPermanentAddress());
System.out.println("User_Id is :" +rvs.getUserID ());
System.out.println("AccountBalance is :" +rvs.getAccountBalance());
}
}












