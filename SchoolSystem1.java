/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package schoolsystem1;
import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author mohab
 */
public class SchoolSystem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
         System.out.println("Hello To Our School System: ");
         System.out.println("Please,choose on of this choices: ");
         System.out.println("1.ENTER DATA OF THE SYSTEM: ");
         System.out.println("2.SHOW DATA OF THE SYSTEM: ");
         System.out.println("3.EXIT OF THE SYSTEM: ");        
         int a;
         a=sc.nextInt();
         int n=1000000,m=100000,k=100000,l=100000;
         
          Administrators [] ob;
        ob = new Administrators[n];
    
     Teacher [] ob1;
    ob1= new Teacher[m];
    
    Student [] ob2;
    ob2= new Student[k];
    
     Employee[] ob3;
    ob3 = new Employee[l];
         if(a==1)
         {
            
         System.out.println("Please,Enter The Number Of Administrators: ");
         n=sc.nextInt();
       

       int idof_admin;
     String nameof_admin;
       float salaryof_admin;
       String nationalityof_admin;
        String fieldof_admin;

        

        for(int i=0;i<n;i++)
        {
           
           ob[i]=new Administrators();
          System.out.println("Please,Enter The ID Of Administrators"+" "+(i+1)+" "+": ");
           idof_admin=sc.nextInt();
          ob[i].setid(idof_admin);
          
            System.out.println("Please,Enter The Name Of Administrators"+" "+(i+1)+" "+": ");
        
            nameof_admin=sc.next();
     
            ob[i].setname(nameof_admin);
             
             sc.nextLine();
              System.out.println("Please,Enter The Nationality Of Administrators"+" "+(i+1)+" "+": ");
              nationalityof_admin=sc.next();
              ob[i].setNationality(nationalityof_admin);
              sc.nextLine();
              System.out.println("Please,Enter The Field Of Administrators"+" "+(i+1)+" "+": ");
             fieldof_admin=sc.next();
              ob[i].setField(fieldof_admin);
              sc.nextLine();
            System.out.println("Please,Enter The Salary Of Administrators"+" "+(i+1)+" "+": ");
            
            salaryof_admin=sc.nextFloat();
            ob[i].setsalary(salaryof_admin);
            
           sc.nextLine();
         
        }
          
         System.out.println("Please,Enter The Number Of Teachers: ");
         m=sc.nextInt();
       
         int idof_teacher;
     String nameof_teacher;
       float salaryof_teacher;
       String nationalityof_teacher;
        String fieldof_teacher;
         
         for(int i=0;i<m;i++)
        {
           
           ob1[i]=new Teacher();
          System.out.println("Please,Enter The ID Of Teacher"+" "+(i+1)+" "+": ");
           idof_teacher=sc.nextInt();
          ob1[i].setid(idof_teacher);
          
            System.out.println("Please,Enter The Name Of Teacher"+" "+(i+1)+" "+": ");
        
            nameof_teacher=sc.next();
     
            ob1[i].setname(nameof_teacher);
             
             sc.nextLine();
              System.out.println("Please,Enter The Nationality Of Teacher"+" "+(i+1)+" "+": ");
              nationalityof_teacher=sc.next();
              ob1[i].setNationality( nationalityof_teacher);
              sc.nextLine();
              System.out.println("Please,Enter The Field Of Teacher"+" "+(i+1)+" "+": ");
             fieldof_teacher=sc.next();
              ob1[i].setField(fieldof_teacher);
              sc.nextLine();
            System.out.println("Please,Enter The Salary Of Teacher"+" "+(i+1)+" "+": ");
            
            salaryof_teacher=sc.nextFloat();
            ob1[i].setsalary(salaryof_teacher);
            
           
         
        }
         System.out.println("Please,Enter The Number Of Employees: ");
         l=sc.nextInt();
       

       int idof_Employee;
     String nameof_Employee;
       float salaryof_Employee;
       String nationalityof_Employee;
        String fieldof_Employee;

        

        for(int i=0;i<l;i++)
        {
           
           ob3[i]=new Employee();
          System.out.println("Please,Enter The ID Of Employees"+" "+(i+1)+" "+": ");
           idof_Employee=sc.nextInt();
          ob3[i].setid(idof_Employee);
          
            System.out.println("Please,Enter The Name Of Employees"+" "+(i+1)+" "+": ");
        
            nameof_Employee=sc.next();
     
            ob3[i].setname(nameof_Employee);
             
             sc.nextLine();
              System.out.println("Please,Enter The Nationality Of Employees"+" "+(i+1)+" "+": ");
              nationalityof_Employee=sc.next();
              ob3[i].setNationality(nationalityof_Employee);
              sc.nextLine();
              System.out.println("Please,Enter The Field Of Employees"+" "+(i+1)+" "+": ");
             fieldof_Employee=sc.next();
              ob3[i].setField(fieldof_Employee);
              sc.nextLine();
            System.out.println("Please,Enter The Salary Of Employees"+" "+(i+1)+" "+": ");
            
            salaryof_Employee=sc.nextFloat();
            ob3[i].setsalary(salaryof_Employee);
            
           
         
        }
          
         System.out.println("Please,Enter The Number Of Students: ");
         k=sc.nextInt();
        
         int idof_student;
     String nameof_student;
       float salaryof_student;
       String nationalityof_student;
        String fieldof_student;
         int studet_l;
         float gp;
         for(int i=0;i<k;i++)
        {
           
           ob2[i]=new Student();
          System.out.println("Please,Enter The ID Of Students"+" "+(i+1)+" "+": ");
           idof_student=sc.nextInt();
          ob2[i].setid(idof_student);
          
            System.out.println("Please,Enter The Name Of Students"+" "+(i+1)+" "+": ");
        
            nameof_student=sc.next();
     
            ob2[i].setname(nameof_student);
             
             sc.nextLine();
              System.out.println("Please,Enter The Nationality Of Students"+" "+(i+1)+" "+": ");
              nationalityof_student=sc.next();
              ob2[i].setNationality(  nationalityof_student);
              sc.nextLine();
              System.out.println("Please,Enter The Level Of Students"+" "+(i+1)+" "+": ");
            studet_l=sc.nextInt();
              ob2[i].setStudy_level(studet_l);
              if(studet_l>1)
              {
               System.out.println("Please,Enter The Field Of Students"+" "+(i+1)+" "+": ");
            
             fieldof_student=sc.next();
            ob2[i].setField(fieldof_student);
            sc.nextLine();
              }
            System.out.println("Please,Enter The GPA Of Students"+" "+(i+1)+" "+": ");
            
            gp=sc.nextFloat();
            ob2[i].setGPA(gp);
            
           
         
        }
           
         
      
         }
         System.out.println("1.ENTER DATA OF THE SYSTEM: ");
         System.out.println("2.SHOW DATA OF THE SYSTEM: ");
         System.out.println("3.EXIT OF THE SYSTEM: ");      
          a=sc.nextInt();
         if(a==2)
         {
             for(int i=0;i<n;i++)
         {
            ob[i].print(i);
        
        }
         sc.nextLine();
          for(int i=0;i<m;i++)
         {
            ob1[i].print1(i);
        
        }
         
         for(int i=0;i<l;i++)
         {
            ob3[i].print3(i);
        
        }
        
         for(int i=0;i<k;i++)
         {
            ob2[i].print2(i);
        
        }
        
         }
          System.out.println("1.ENTER DATA OF THE SYSTEM: ");
         System.out.println("2.SHOW DATA OF THE SYSTEM: ");
         System.out.println("3.EXIT OF THE SYSTEM: ");  
        a=sc.nextInt();
         if(a==3)
         {
          System.out.println("Our school always wishes you happiness");
         System.exit(0);
         }
    
    }
    
}
