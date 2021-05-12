package casestudy_furama_resort.controllers;

import java.util.Scanner;

import static casestudy_furama_resort.controllers.BookingController.addNewBooking;
import static casestudy_furama_resort.controllers.BookingController.showInformationOfEmployee;
import static casestudy_furama_resort.controllers.CustomerController.addNewCustomer;
import static casestudy_furama_resort.controllers.CustomerController.showInformationOfCustomer;
import static casestudy_furama_resort.controllers.ServicesController.*;

public class MainController {

    public static void displayMainMenu(){
        int choose;
        do {
            Scanner sc = new Scanner(System.in);

            System.out.println("MENU" +
                    "1.\t Add New Services\n" +
                    "2.\tShow Services\n" +
                    "3.\tAdd New Customer\n" +
                    "4.\tShow Information of Customer\n" +
                    "5.\tAdd New Booking\n" +
                    "6.\tShow Information of Employee\n" +
                    "7.\tExit\n");
            System.out.println("Choose : ");
            choose = sc.nextInt();
            switch (choose){
                case 1 :
                    addNewServices();
                    break;
                case 2 :
                    showServices();
                    break;
                case 3 :
                    addNewCustomer();
                    break;
                case 4 :
                    showInformationOfCustomer();
                    break;
                case 5 :
                    addNewBooking();
                    break;
                case 6 :
                   showInformationOfEmployee();
                    break;
            }
        }while (choose != 7);
    }


}
