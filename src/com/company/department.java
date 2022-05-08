package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class department {
   private int dep_id;
   private String name;
   private ArrayList<employee> list = new ArrayList<employee>();

     public void setDep_id(int dep_id) {
          this.dep_id = dep_id;
     }

     public void setName(String name) {
          this.name = name;
     }

     public int getDep_id() {
          return dep_id;
     }

     public String getName() {
          return name;
     }

     public void add_emp(int id,String FN,String LN ,int Sal , int Did){
         employee e = new employee() ;
         Scanner sc= new Scanner (System.in);
         if(list.size()==0){
              e.setEmp_id(id); e.setFristName(FN); e.setLastName(LN); e.setSalary(Sal); e.setDep_id(Did);
              System.out.println("Note that this is the first employee in this department with ID 1,The ID sequential and in ascending order ");
              list.add(0,e);
            System.out.println(list.size());
          }
          else if(id==list.size()+1) {
              e.setEmp_id(id); e.setFristName(FN); e.setLastName(LN); e.setSalary(Sal); e.setDep_id(Did);
              list.add(e);
          }
          else if(id!=list.size()+1){
              System.out.println("Please Note the last employee id is "+ list.size() + " " +
                      "And The ID sequential and in ascending order");
              System.out.print("Enter The correct id :");
               id =sc.nextInt();
             e.setEmp_id(id); e.setFristName(FN); e.setLastName(LN); e.setSalary(Sal); e.setDep_id(Did);
             list.add(e);

           }
     }
     public void removeEmp(int id){
         list.remove(id-1);
     }
     public void printAll_emp()
     {
        System.out.println(list.size());
         for(int i=0; i<list.size();i++)
        {
            System.out.println(list.get(i).toString());
         }
     }
}
