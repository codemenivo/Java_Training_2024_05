package Sirma_May_2024_15_HotelRoomReservationSystem;

import java.util.ArrayList;
import java.util.List;

public class User {

    String userName;
    String passWord;
    List<String> bookingHistory;

    public User(String userName, String passWord, List<String> bookingHistory) {
        this.userName = userName;
        this.passWord = passWord;
        this.bookingHistory = new ArrayList<>();
    }
}
