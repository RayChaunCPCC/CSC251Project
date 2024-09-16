import java.util.Scanner;//Importing scanner

public class Project_raychaun_raglin
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      Policy policy = new Policy();
      
      //Asking for policy information and setting that policy information
      System.out.print("Please enter the Policy Number: ");
      policy.setPolicyNum(keyboard.nextInt());
      keyboard.nextLine();
      
      System.out.print("Please enter the Provider Name: ");
      policy.setProviderName(keyboard.nextLine());
      
      
      System.out.print("Please enter the Policyholder's First Name: ");
      policy.setFirstName(keyboard.nextLine());
      
      System.out.print("Please enter the Policyholder's Last Name: ");
      policy.setLastName(keyboard.nextLine());
      
      System.out.print("Please enter the Policyholder's Age: ");
      policy.setAge(keyboard.nextInt());
      keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      policy.setSmokeStatus(keyboard.nextLine());
      
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      policy.setHeight(keyboard.nextDouble());
      
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      policy.setWeight(keyboard.nextDouble());
      
      //Final output
      System.out.println("\nPolicy Number: " + policy.getPolicyNum());
      System.out.println("Provider Name: " + policy.getProviderName());
      System.out.println("Policyholder's First Name: " + policy.getFirstName());
      System.out.println("Policyholder's Last Name: " + policy.getLastName());
      System.out.println("Policyholder's Age: " + policy.getAge());
      System.out.println("Policyholder's Smoking Status: " + policy.getSmokeStatus());
      System.out.println("Policyholder's Height: " + policy.getHeight() + " inches");
      System.out.println("Policyholder's Weight: " + policy.getWeight() + " pounds");
      System.out.printf("Policyholder's BMI: " + "%.2f", policy.getBMI());
      System.out.printf("\nPolicy Price: $" + "%.2f", policy.getPrice(600));
      
   }
}

