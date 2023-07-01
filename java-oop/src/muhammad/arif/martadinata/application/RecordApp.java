package muhammad.arif.martadinata.application;

import muhammad.arif.martadinata.data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("Muhammad","rahasia");
        System.out.println(loginRequest);
    }
}
