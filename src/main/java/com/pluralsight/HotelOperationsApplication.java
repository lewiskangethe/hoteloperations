package com.pluralsight;

public class HotelOperationsApplication {
    public static void main(String[] args) {
        //        Reservation reservation1 = new Reservation("King", 1, false);
//        System.out.println(reservation1.getReservationTotal());
//
//        Reservation reservation2 = new Reservation("King", 1, true);
//        System.out.println(reservation2.getReservationTotal());

        Hotel grandBudapestHotel = new Hotel("Grand Budapest Hotel", 15, 100);
        System.out.println(grandBudapestHotel);


        if (grandBudapestHotel.bookRoom(5, false)) {
            System.out.println(grandBudapestHotel);
        }else{
            System.out.println("Go home!");
        }


        if (grandBudapestHotel.bookRoom(10, true)) {
            System.out.println(grandBudapestHotel);
        }else{
            System.out.println("Go home snob!");
        }

    }
}
