package login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticate(String username, String password){
        boolean isValidUserName = username.equalsIgnoreCase("kardelenkeles");
        boolean isValidPassword = password.equalsIgnoreCase("keles");

        return isValidPassword && isValidUserName;
    }
}
