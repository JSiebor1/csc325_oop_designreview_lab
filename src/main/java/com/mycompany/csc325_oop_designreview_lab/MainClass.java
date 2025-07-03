/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 * @author MoaathAlrajab
 */
public class MainClass {

    public static void main(String[] args) {
        Student std = new Student("James", (short) 20);
        Student std1 = new Freshman("James", (short) 20, 12); // name, age, credits
        Student std2 = new Senior("John", (short) 30, 90);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter GPA for Student: ");
        std.setGPA(sc.nextDouble());
        // test toStrings
        System.out.println(std);
        System.out.println(std1);
        System.out.println(std2);

    }

}

