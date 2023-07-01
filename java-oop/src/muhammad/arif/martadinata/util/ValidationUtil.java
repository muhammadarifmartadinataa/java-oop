package muhammad.arif.martadinata.util;

import muhammad.arif.martadinata.data.LoginRequest;
import muhammad.arif.martadinata.eror.ValidationException;

public class ValidationUtil {
    public static void validate(LoginRequest loginRequest) throws ValidationException,NullPointerException{
        if (loginRequest.username()==null){
            throw new NullPointerException("Username Tidak Boleh Null");
        } else if (loginRequest.username().isBlank()){
            throw  new ValidationException("Username tidak boleh kosong");
        } else  if (loginRequest.password()==null){
            throw  new NullPointerException("Pasword tidka boleh null");
        } else if (loginRequest.password().isBlank()){
            throw new ValidationException("Password tidak boleh kosong");
        }
    }
}
