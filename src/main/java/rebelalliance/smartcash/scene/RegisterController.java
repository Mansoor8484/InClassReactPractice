package rebelalliance.smartcash.scene;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.util.Random;
import java.util.UUID;

public class RegisterController {
    Random random = new Random();

    public TextField emailInput;
    public PasswordField passwordInput;

    @FXML
    protected void onRegisterClick() {
        String email = emailInput.getText();
        String password = passwordInput.getText();
        // These two lines should be moved to the backend.
        UUID uuid = UUID.randomUUID();
        int routingNumber = random.nextInt(100000, 1000000);

        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("UUID: " + uuid);
        System.out.println("Routing Number: " + routingNumber);

        // TODO: Call database function.
    }
}
