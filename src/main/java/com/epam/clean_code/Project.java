package com.epam.clean_code;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
public class Project {
	public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        PrintStream obj = new PrintStream(new FileOutputStream(FileDescriptor.out));
        int c = 1;
        do {
            obj.print("Enter your choice \n");
            obj.print("Press 1 to calculate (Simple/Compound) Interest\n");
            obj.print("Press 2 to run House Cost Estimation\n");
            obj.print("Enter your choice = ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Interest obj1 = new Interest();
                    obj1.calculate();
                    break;
                case 2:
                	HomeCostEstimation obj2 = new HomeCostEstimation();
                    obj2.calculate();
                    break;
                default:
                    obj.print("Wrong choice\n");
            }
            obj.print("Press 0 to stop\n");
            c = sc.nextInt();
        }while (c!=0);
    }

}