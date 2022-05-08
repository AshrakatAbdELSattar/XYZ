package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        department dep1 = new department();
        int choise ;
        do{
            System.out.println(" 1 : To Add the Department  ");
            System.out.println(" 2 : To Add Employee ");
            System.out.println(" 3 : To  Show ");
            System.out.println(" 4 : To  Delete ");



            choise=sc.nextInt();
            switch (choise){
                case 1:
                    {
                        dep1.setName("Testing");
                        dep1.setDep_id(1);
                        break;
                    }

                case 2:{
                    dep1.add_emp(1,"ahmed","ali",3000,1);
                    //dep1.add_emp(2,"ahmed","ali",3000,1);
                    break;
                }
                case 3:
                {

                        dep1.printAll_emp();
                     break;
                }
                case 4:
                {
                    dep1.removeEmp(1);
                    break;
                }

                                 default:
                    System.out.println("Sory!!");
            }

        }while (true);

    }
}
