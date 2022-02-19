package com.assignment1.driver;

import com.assignment1.department.AdminDepartment;
import com.assignment1.department.HrDepartment;
import com.assignment1.department.TechDepartment;

public class Main {

    public static void main(String [] args){

        AdminDepartment ad=new AdminDepartment();
        HrDepartment hrd=new HrDepartment();
        TechDepartment td=new TechDepartment();

        System.out.println("Welcome to "+ad.departmentName());
        System.out.println(ad.getTodaysWork());
        System.out.println(ad.getWorkDeadline());
        System.out.println(ad.isTodayAHoliday());
        System.out.println();
        System.out.println("Welcome to "+hrd.departmentName());
        System.out.println(hrd.doActivity());
        System.out.println(hrd.getTodaysWork());
        System.out.println(hrd.getWorkDeadline());
        System.out.println(hrd.isTodayAHoliday());
        System.out.println();
        System.out.println("Welcome to "+td.departmentName());
        System.out.println(td.getTodaysWork());
        System.out.println(td.getWorkDeadline());
        System.out.println(td.getTechStackInformation());
        System.out.println(ad.isTodayAHoliday());




    }

}
