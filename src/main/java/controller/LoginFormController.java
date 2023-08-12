package controller;

import bo.custom.BOFactory;
import bo.custom.LoginBo;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.logging.Logger;


public class LoginFormController {

    public TextField userNameText;
    public PasswordField passwordText;
    LoginBo loginBo= BOFactory.getBoFactory().getBO(BOFactory.BOTypes.LOGIN);
    public void loginOnClick(MouseEvent mouseEvent) {

        String username=userNameText.getText();
        String password=passwordText.getText();

        Boolean reslt=loginBo.checkPassword(username,password);
        if (reslt){
            Alert alert=new Alert(Alert.AlertType.INFORMATION,"LoginDone");
            alert.show();
        }else{
            System.out.println("Login Failed");
        }
    }

    public void userNameChanged(ActionEvent actionEvent) {
    }
}
