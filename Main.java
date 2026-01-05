package MovieTicketBookingSystem;

import java.math.BigInteger;
import java.util.Scanner;


public class Main {
    public static void main (String args[]){
        ViewerInterface viewer1 = new Viewer();
        ViewerInterface viewer2 = new Viewer();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no of seats :");
        BigInteger seats = new BigInteger (scan.nextLine());
        viewer1.setNoOfSeats(seats.intValue());

        System.out.println("Enter Screen type :");
        String screenType =  (scan.nextLine());
        viewer1.setScreenType(screenType);

        System.out.println("Do you want snacks :");
        String snacks =  (scan.nextLine());
        viewer1.setWantsSnacks(snacks);

        System.out.println("Enter snack quantity :");
        BigInteger snackquan = new BigInteger (scan.nextLine());
        viewer1.setSnackQuantity(snackquan.intValue());




        System.out.println("Enter no of seats :");
        BigInteger seats2 = new BigInteger (scan.nextLine());
        viewer2.setNoOfSeats(seats2.intValue());

        System.out.println("Enter Screen type :");
        String screenType2 =  (scan.nextLine());
        viewer2.setScreenType(screenType2);

        System.out.println("Do you want snacks :");
        String snacks2 =  (scan.nextLine());
        viewer2.setWantsSnacks(snacks2);

        System.out.println("Enter snack quantity :");
        BigInteger snackquan2 = new BigInteger (scan.nextLine());
        viewer2.setSnackQuantity(snackquan2.intValue());

        if (viewer1.getScreenType().equals("Gold")){
            int [] [] goldScreen = new int [6] [5];
            goldScreen [0]  = new int []{1,2,3,4,5};
            for ( int i = 0; i < goldScreen.length; i++){
                if(i!=0) {
                    System.out.print((char) (65 + i - 1));
                    System.out.print(" ");
                }
                for (int j = 0; j < goldScreen[i].length; j++){
                    if(i==0 && j==0){
                        System.out.print("  ");
                    }
                    System.out.print(goldScreen[i][j]);
                    System.out.print(" ");

                }
                System.out.println();

            }
                for (int i = 0; i < viewer1.getNoOfSeats(); i++) {
                    boolean validSeat = false;
                    boolean bookedSeat = false;
                    while (!validSeat || !bookedSeat) {
                        try {
                            System.out.println("Enter your seat");
                            String seat = scan.nextLine();
                            char[] ch = seat.toCharArray();
                            int fr =  ch[0]-65;
                            BigInteger fs = new BigInteger(String.valueOf(ch[1]));
                            int finalSeat = fs.intValue() - 1;

                           if(goldScreen[fr+1][finalSeat] == 1){
                               bookedSeat = true;
                               System.out.print("Your selected seat is already booked,try any other seat ");
                           }
                            goldScreen[fr+1][finalSeat] = 1;
                            validSeat = true;
                            bookedSeat=true;

                        } catch (Exception e) {
                            System.out.println("Enter a valid seat ");
                            validSeat = false;

                        }
                    }
            }
            ScreenInterface gs = new GoldScreen(71,500,100,viewer1,goldScreen);
            ScreenInterface [] screen = viewer1.getScreen();
            screen[0]=gs;
            gs.calculateTicketPrice();
            gs.calculateSnackPrice();
            gs.generateBill();
            gs.applyDiscount();
            System.out.println("Final Bill :");
            System.out.println(viewer1.getScreen()[0].getTotalBill());
            System.out.println("Booking Id :");
            System.out.println(viewer1.getScreen()[0].getBookingId());
            System.out.println("_______________________");

        }
        else if (viewer1.getScreenType().equals("Silver")){
            int [] [] silverScreen = new int [6] [5];
            silverScreen [0]  = new int []{1,2,3,4,5};
            for ( int i = 0; i < silverScreen.length; i++){
                if(i!=0) {
                    System.out.print((char) (65 + i - 1));
                    System.out.print(" ");
                }
                for (int j = 0; j < silverScreen[i].length; j++){
                    if(i==0 && j==0){
                        System.out.print("  ");
                    }
                    System.out.print(silverScreen[i][j]);
                    System.out.print(" ");

                }
                System.out.println();

            }
            for (int i = 0; i < viewer1.getNoOfSeats(); i++) {
                boolean validSeat = false;
                boolean bookedSeat = false;
                while (!validSeat || !bookedSeat) {
                    try {
                        System.out.println("Enter your seat");
                        String seat = scan.nextLine();
                        char[] ch = seat.toCharArray();
                        int fr =  ch[0]-65;
                        BigInteger fs = new BigInteger(String.valueOf(ch[1]));
                        int finalSeat = fs.intValue() - 1;

                        if(silverScreen[fr+1][finalSeat] == 1){
                            bookedSeat = true;
                            System.out.print("Your selected seat is already booked,try any other seat ");
                        }
                        silverScreen[fr+1][finalSeat] = 1;
                        validSeat = true;
                        bookedSeat=true;

                    } catch (Exception e) {
                        System.out.println("Enter a valid seat ");
                        validSeat = false;

                    }
                }
            }
            ScreenInterface ss = new SilverScreen(72,200,50,viewer1,silverScreen);
            ScreenInterface [] screen = viewer1.getScreen();
            screen[1]=ss;
            ss.calculateTicketPrice();
            ss.calculateSnackPrice();
            ss.generateBill();
            ss.applyDiscount();
            System.out.println("Final Bill :");
            System.out.println(viewer1.getScreen()[1].getTotalBill());
            System.out.println("Booking Id :");
            System.out.println(viewer1.getScreen()[1].getBookingId());
            System.out.println("_______________________");


        }
        else {
            System.out.println("Enter a valid ScreenType ");
        }


        if (viewer2.getScreenType().equals("Gold")) {
            int [] [] goldScreen = new int [6] [5];
            goldScreen [0]  = new int []{1,2,3,4,5};
            for ( int i = 0; i < goldScreen.length; i++){
                if(i!=0) {
                    System.out.print((char) (65 + i - 1));
                    System.out.print(" ");
                }
                for (int j = 0; j < goldScreen[i].length; j++){
                    if(i==0 && j==0){
                        System.out.print("  ");
                    }
                    System.out.print(goldScreen[i][j]);
                    System.out.print(" ");

                }
                System.out.println();

            }
            for (int i = 0; i < viewer1.getNoOfSeats(); i++) {
                boolean validSeat = false;
                boolean bookedSeat = false;
                while (!validSeat || !bookedSeat) {
                    try {
                        System.out.println("Enter your seat");
                        String seat = scan.nextLine();
                        char[] ch = seat.toCharArray();
                        int fr =  ch[0]-65;
                        BigInteger fs = new BigInteger(String.valueOf(ch[1]));
                        int finalSeat = fs.intValue() - 1;

                        if(goldScreen[fr+1][finalSeat] == 1){
                            bookedSeat = true;
                            System.out.print("Your selected seat is already booked,try any other seat ");
                        }
                        goldScreen[fr+1][finalSeat] = 1;
                        validSeat = true;
                        bookedSeat=true;

                    } catch (Exception e) {
                        System.out.println("Enter a valid seat ");
                        validSeat = false;

                    }
                }
            }
            ScreenInterface gs = new GoldScreen(73, 500, 100, viewer2,goldScreen);
            ScreenInterface[] screen = viewer2.getScreen();
            screen[0] = gs;
            gs.calculateTicketPrice();
            gs.calculateSnackPrice();
            gs.generateBill();
            gs.applyDiscount();
            System.out.println("Final Bill :");
            System.out.println(viewer2.getScreen()[0].getTotalBill());
            System.out.println("Booking Id :");
            System.out.println(viewer2.getScreen()[0].getBookingId());
            System.out.println("_______________________");

        }
        else if (viewer2.getScreenType().equals("Silver")){
            int [] [] silverScreen = new int [6] [5];
            silverScreen [0]  = new int []{1,2,3,4,5};
            for ( int i = 0; i < silverScreen.length; i++){
                if(i!=0) {
                    System.out.print((char) (65 + i - 1));
                    System.out.print(" ");
                }
                for (int j = 0; j < silverScreen[i].length; j++){
                    if(i==0 && j==0){
                        System.out.print("  ");
                    }
                    System.out.print(silverScreen[i][j]);
                    System.out.print(" ");

                }
                System.out.println();

            }
            for (int i = 0; i < viewer1.getNoOfSeats(); i++) {
                boolean validSeat = false;
                boolean bookedSeat = false;
                while (!validSeat || !bookedSeat) {
                    try {
                        System.out.println("Enter your seat");
                        String seat = scan.nextLine();
                        char[] ch = seat.toCharArray();
                        int fr =  ch[0]-65;
                        BigInteger fs = new BigInteger(String.valueOf(ch[1]));
                        int finalSeat = fs.intValue() - 1;

                        if(silverScreen[fr+1][finalSeat] == 1){
                            bookedSeat = true;
                            System.out.print("Your selected seat is already booked,try any other seat ");
                        }
                        silverScreen[fr+1][finalSeat] = 1;
                        validSeat = true;
                        bookedSeat=true;

                    } catch (Exception e) {
                        System.out.println("Enter a valid seat ");
                        validSeat = false;

                    }
                }
            }
            ScreenInterface ss = new SilverScreen(74,200,50,viewer2,silverScreen);
            ScreenInterface [] screen = viewer2.getScreen();
            screen[1]=ss;
            ss.calculateTicketPrice();
            ss.calculateSnackPrice();
            ss.generateBill();
            ss.applyDiscount();
            System.out.println("Final Bill :");
            System.out.println(viewer2.getScreen()[1].getTotalBill());
            System.out.println("Booking Id :");
            System.out.println(viewer2.getScreen()[1].getBookingId());
            System.out.println("_______________________");

        }
        else {
            System.out.println("Enter a valid ScreenType ");
        }




    }
}

