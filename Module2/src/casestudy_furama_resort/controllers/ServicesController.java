package casestudy_furama_resort.controllers;

import java.util.Scanner;

import static casestudy_furama_resort.controllers.MainController.displayMainMenu;

public class ServicesController {
    public static void addNewServices(){
        int choose;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("LIST ADD SERVICES" +
                    "1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3.\tAdd New Room\n" +
                    "4.\tBack to menu\n" +
                    "5.\tExit\n");
            System.out.println("Enter service need to add : ");
            choose = sc.nextInt();
            switch (choose){
                case 1 :
//                    addNewVilla();
                    break;
                case 2 :
//                    addNewHouse();
                    break;
                case 3 :
//                    addNewRoom();
                    break;
                case 4 :
                    displayMainMenu();
                    break;
            }

        }while (choose != 5);
    }
    public static void showServices() {
        int choose;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("LIST SHOW SERVICES" +
                    "1.\tShow all Villa\n" +
                    "2.\tShow all House\n" +
                    "3.\tShow all Room\n" +
                    "4.\tShow All Name Villa Not Duplicate\n" +
                    "5.\tShow All Name House Not Duplicate\n" +
                    "6.\tShow All Name Name Not Duplicate\n" +
                    "7.\tBack to menu\n" +
                    "8.\tExit\n");
            System.out.println("Enter service need to show : ");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
//                    showAllVilla();
                    break;
                case 2:
//                    showAllHouse();
                    break;
                case 3:
//                    showAllRoom();
                    break;
                case 4:
//                    showAllNameVillaNotDuplicate();
                    break;
                case 5:
//                    showAllNameHouseNotDuplicate();
                    break;
                case 6:
//                    showAllNameRoomNotDuplicate();
                    break;
                case 7:
                    addNewServices();
                    break;
            }
        } while (choose != 8);

    }
}
