package muhammad.arif.martadinata.application;

import muhammad.arif.martadinata.data.Laptop;
import muhammad.arif.martadinata.data.LoginRequest;
import muhammad.arif.martadinata.eror.ValidationException;
import muhammad.arif.martadinata.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest(null,null);
        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data Valid");
        }catch (ValidationException exception){
            System.out.println("Data Tidak Valid " +exception.getMessage());
        }catch (NullPointerException nullPointerException){
            System.out.println("Data null" + nullPointerException.getMessage());
        }
    }
}
