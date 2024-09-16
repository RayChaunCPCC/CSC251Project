import java.util.Scanner;

public class Policy
{
   private int policyNum;
   private int age;
   private String providerName;
   private String firstName;
   private String lastName;
   private String smokeStatus;
   private double height;
   private double weight;
   
   //No-arg constructors
   public void PolicyNum()
   {
      policyNum = 0000;
   }
   
   public void Age()
   {
      age = 0;
   }
   
   public void ProviderName()
   {
      providerName = "none";
   }
   
   public void FirstName()
   {
      firstName = "none";
   }
   
   public void LastName()
   {
      lastName = "none";
   }
   
   public void SmokeStatus()
   {
      smokeStatus = "non-smoker";
   }
   
   public void Height()
   {
      height = 0;
   }
   
   public void Weight()
   {
      weight = 0;
   }
   
   //Setters/mutators
   public void setPolicyNum(int pNum)
   {
      policyNum = pNum;
   }
   
   public void setAge(int a)
   {
      age = a;
   }
   
   public void setProviderName(String pName)
   {
      providerName = pName;
   }
   
   public void setFirstName(String fName)
   {
      firstName = fName;
   }
   
   public void setLastName(String lName)
   {
      lastName = lName;
   }
   
   public void setSmokeStatus(String sStatus)
   {
      smokeStatus = sStatus;
   }
   
   public void setHeight(double h)
   {
      height = h;
   }
   
   public void setWeight(double w)
   {
      weight = w;
   }
   
   //Getters/accessor
   
   public int getPolicyNum()
   {
      return policyNum;
   }
   
   public int getAge()
   {
      return age;
   }
   
   public String getProviderName()
   {
      return providerName;
   }
   
   public String getFirstName()
   {
      return firstName;
   }
   
   public String getLastName()
   {
      return lastName;
   }
   
   public String getSmokeStatus()
   {
      return smokeStatus;
   }
   
   public double getHeight()
   {
      return height;
   }
   
   public double getWeight()
   {
      return weight;
   }
   
   
   //Method to calculate the BMI
   public double getBMI()
   {
      return (weight*703) / (height*height);
   }
   
   //Method to calculate the total price of the insurance policy
   public double getPrice(double iniPrice)
   {
      if (age>50)
      {
         iniPrice = iniPrice + 75;
      }
      
      if (smokeStatus.equals("smoker"))
      {
         iniPrice = iniPrice + 100;
      }
      
      if (getBMI()>35)
      {
         iniPrice = iniPrice + ((getBMI() - 35) * 20);
      }
      
      return iniPrice;
   }
}