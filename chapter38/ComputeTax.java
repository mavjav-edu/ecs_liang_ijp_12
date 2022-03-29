/*
 * ComputeTax.java
 *
 * Created on August 15, 2006, 9:27 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package chapter38;

import java.util.Scanner;

public class ComputeTax {
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter filing status
    // Prompt the user to enter filing status
    System.out.print(
      "(0-single filer, 1-married jointly,\n" +
      "2-married separately, 3-head of household)\n" +
      "Enter the filing status: ");
    int status = input.nextInt();

    // Prompt the user to enter taxable income
    System.out.print("Enter the taxable income: ");
    double income = input.nextDouble();

    // Compute and display the result
    System.out.println("Tax is " +
      (int)(computeTax(status, income) * 100) / 100.0);
  }

  public static double computeTax(int status, double income) {
    double[] rates = {0.10, 0.15, 0.27, 0.30, 0.38, 0.386};

    int[][] brackets = {
      {6000, 27950, 67700, 141250, 307050}, // Single filer
      {12000, 46700, 112850, 171950, 307050}, // Married jointly
      {6000, 23380, 56425, 85975, 153825}, // Married separately
      {10000, 37450, 96700, 156600, 307050} // Head of household
    };

    double tax = 0; // Tax to be computed

    // Compute tax in the first bracket
    if (income <= brackets[status][0])
      return tax = income * rates[0]; // Done
    else
      tax = brackets[status][0] * rates[0];

    // Compute tax in the 2nd, 3rd, 4th, and 5th brackets, if needed
    for (int i = 1; i < brackets[0].length; i++) {
      if (income > brackets[status][i])
        tax += (brackets[status][i] - brackets[status][i - 1]) *
          rates[i];
      else {
        tax += (income - brackets[status][i - 1]) * rates[i];
        return tax; // Done
      }
    }

    // Compute tax in the last (i.e., 6th) bracket
    return  tax += (income - brackets[status][4]) * rates[5];
  }
}
