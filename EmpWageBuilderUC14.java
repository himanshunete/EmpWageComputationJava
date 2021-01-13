import java.io.*; 
import java.util.*;
import java.util.HashMap;
import java.util.Map;

interface ICompanyEmpWage{
   public void addCompanyWage( String company, int  empRatePerHour , int numOfWorkingDays, int  maxNumOfHours );
   public void computeEmpWage();
   

}



class CompanyEmpWage{
   public final String company;
   public final int empRatePerHour ;
   public final int numOfWorkingDays;
   public final int maxNumOfHours ;
   public int totalEmpWage ;

   public CompanyEmpWage( String company, int  empRatePerHour , int numOfWorkingDays, int  maxNumOfHours ){
      this.company = company ;
      this.empRatePerHour = empRatePerHour ;
      this.numOfWorkingDays = numOfWorkingDays ;
      this.maxNumOfHours = maxNumOfHours ;
   }

   public void setTotalWage(int totalEmpWage){
      this.totalEmpWage = totalEmpWage ;

   }

   public String toString(){
      return "Total Emp Wage for Company: " +company+ " is: " + totalEmpWage;

   }
}


public class EmpWageBuilderUC14 implements ICompanyEmpWage{
   public static final int IS_PART_TIME = 1;
   public static final int IS_FULL_TIME = 2;

   private int numOfCompany = 0;
   private  ArrayList<CompanyEmpWage> companyEmpWageList;  
   private  Map<String,CompanyEmpWage> companyToEmpWageMap; 



   public EmpWageBuilderUC14(){
      companyEmpWageList = new  ArrayList<>() ; 
      companyToEmpWageMap =  new HashMap<>() ;
   } 


   public void addCompanyWage( String company, int  empRatePerHour , int numOfWorkingDays, int  maxNumOfHours ){
      CompanyEmpWage companyEmpWage = new CompanyEmpWage( company, empRatePerHour , numOfWorkingDays, maxNumOfHours ) ;
      companyEmpWageList.add(companyEmpWage );
      companyToEmpWageMap.put(company, companyEmpWage );
  

   }


   public void computeEmpWage(){
      for ( int i=0; i < companyEmpWageList.size(); i++ ){
         CompanyEmpWage companyEmpWage = companyEmpWageList.get(i) ;
         companyEmpWage.setTotalWage(this.computeEmpWage(companyEmpWage));
         System.out.println(companyEmpWage);
      }
      System.out.println(companyEmpWageList);
    
   }


   public int computeEmpWage( CompanyEmpWage companyEmpWage ){
      System.out.println(" Welcome to Employee Wage Computation Program ") ;

      //Variables
      int totalEmpHrs = 0;
      int totalWorkingDays = 0 ;
      int empHrs = 0 ;
      int empWage = 0;
      //Computation
      while ( totalEmpHrs <=  companyEmpWage.maxNumOfHours && totalWorkingDays <= companyEmpWage.numOfWorkingDays ){
         int empCheck = (int)Math.floor(Math.random() * 10) % 3;
         totalWorkingDays ++;
         totalEmpHrs ++;
         switch (empCheck) {
            case IS_FULL_TIME :
               empHrs = 8 ;
               break;
            case IS_PART_TIME :
               empHrs = 4  ;
               break;
            default :
               empHrs = 0;        
         }
       
         totalEmpHrs += empHrs;
         empWage = empHrs*companyEmpWage.empRatePerHour;
         System.out.println(" Daily Wage of Employee is: " +empWage);
         System.out.println(" Day#: "+ totalWorkingDays + " Emp Hr: " +empHrs);


      }
      return totalEmpHrs * companyEmpWage.empRatePerHour;

   }

   public int getTotalWage(String company){
      return  companyToEmpWageMap.get(company).totalEmpWage;
   }

   public static void main(String[] args){
      EmpWageBuilderUC14 empWageBuilder = new EmpWageBuilderUC14() ;
      empWageBuilder.addCompanyWage("Audi", 20, 2, 10);
      empWageBuilder.addCompanyWage("BMW", 10, 4, 20);
      empWageBuilder.addCompanyWage("Ferrari", 20, 6, 30);
      empWageBuilder.computeEmpWage();
      System.out.println("Total Wage for Audi:" + empWageBuilder.getTotalWage("Audi"));
     




   }
}
