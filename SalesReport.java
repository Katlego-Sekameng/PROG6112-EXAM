/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salesreport;

/**
 *
 * @author Student
 */
import java.util.*;
public class SalesReport {

    public static void main(String[] args) {
        //Number of months (Rows)
        String[] months = {"month 1","month 2","month 3"};
        
        
        //Mattresses (Columns)
        String[] mattresses = {"Cozy Nights Monarch","Restonic Barbados","Sealy Phuket"};
        
        //Two-Dimensional Array for sales data
        int[][] sales = {
            {25,18,20},
            {15,10,12},
            {18,15,20},
        };
        
        System.out.println("Enter the number of sales for month 1 for Cozy Nights Monarch mattress: ");
        System.out.println("Enter the number of sales for month 2 for Cozy Nights Monarch mattress: ");
        System.out.println("Enter the number of sales for month 3 for Cozy Nights Monarch mattress: ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Enter the number of sales for month 1 for Restonic Barbados mattress: ");
        System.out.println("Enter the number of sales for month 2 for Restonic Barbados mattress: ");
        System.out.println("Enter the number of sales for month 3 for Restonic Barbados mattress: ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Enter the number of sales for month 1 for Sealy Phuket mattress: ");
        System.out.println("Enter the number of sales for month 2 for Sealy Phuket mattress: ");
        System.out.println("Enter the number of sales for month 3 for Sealy Phuket mattress: ");
                
        
        //Calculate and print total sales
        for (int i = 0; i<sales.length; i++){
            int totalSales = 0;
            for (int j = 0; j<sales.length; j++){
                totalSales += sales[i][j];
            }
        }
        int totalSales = 0;
        System.out.println(" ");
        System.out.println("PRODUCT SALES REPORT 2026");
        //Print columns and row totals
        for(int i = 0; i<sales.length; i++){
            int rowTotal = 0;
            for (int j = 0; j<sales [i].length; j++){
                System.out.println(sales[i][j] + "\t");
                rowTotal += sales[i][j]; 
            }
            totalSales += rowTotal;
            System.out.println("TOTAL PRODUCT SALES: "+ rowTotal);
        }
        //Calculate and print column totals
        System.out.println(" ");
        System.out.println("AVERAGE PRODUCT SALES: ");
        int colTotal = 0;
        for (int j = 0; j<sales[0].length; j++){
            System.out.println(sales[j]);
        }
       
    }
}
