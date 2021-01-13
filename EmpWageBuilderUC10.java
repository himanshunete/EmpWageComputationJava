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

   public void setTotalEmpWage(int totalEmpWage){
      this.totalEmpWage = totalEmpWage ;
   }

   public String toString(){
      return "Total Emp Wage for Company: " +company+ " is: " + totalEmpWage;
   }
}

public class EmpWageBuilderUC10{
   public static final int IS_PART_TIME = 1;
   public static final int IS_FULL_TIME = 2;

   private int numOfCompany = 0;
   private CompanyEmpWage[] companyEmpWageArray ;

   public EmpWageBuilderUC10(){
      companyEmpWageArray = new CompanyEmpWage[5] ;
   } 


   private void addCompanyWage( String company, int  empRatePerHour , int numOfWorkingDays, int  maxNumOfHours ){
      companyEmpWageArray[numOfCompany] = new CompanyEmpWage( company, empRatePerHour , numOfWorkingDays, maxNumOfHours ) ;
      numOfCompany ++;
   }


   private void computeEmpWage(){
      for ( int i=0; i < numOfCompany; i++ ){
         companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
         System.out.println(companyEmpWageArray[i]);
      }
   }


   public int computeEmpWage( CompanyEmpWage companyEmpWage ){
      System.out.println(" Welcome to Employee Wage Computation Program ") ;

      //Variables
      int totalEmpHrs = 0;
      int totalWorkingDays = 0 ;
      int empHrs = 0 ;

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
         System.out.println(" Day#: "+ totalWorkingDays + " Emp Hr: " +empHrs);
      }
      return totalEmpHrs * companyEmpWage.empRatePerHour;

   }

   public static void main(String[] args){
      EmpWageBuilderUC10 empWageBuilder = new EmpWageBuilderUC10() ;
      empWageBuilder.addCompanyWage("Audi", 20, 2, 10);
      empWageBuilder.addCompanyWage("BMW", 10, 4, 20);
      empWageBuilder.addCompanyWage("Ferrari", 20, 6, 30);
      empWageBuilder.computeEmpWage();




   }
}
