package mateusz;

import java.net.URL;
import java.util.Calendar;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;


import javafx.fxml.Initializable;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import mateusz.UserFx;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

import static java.lang.System.currentTimeMillis;

public class WindowController implements Initializable {
    @FXML
    Button login;
    @FXML
    TextField tLogin;
    @FXML
    TextField tName;
    @FXML
    TextField tLastName;
    @FXML
    TextField tPhone;
    @FXML
    TextField tMail;
    @FXML
    TextField tPesel;
    @FXML
    PasswordField tPassword;
    @FXML
    AnchorPane anchorPane;
    @FXML
    Tab tabTables;
    @FXML
    ImageView image;
    @FXML
    Button bAdd;
    @FXML
    Button button2;
    @FXML
    TextField showmeTime;

    @FXML
    TableView<UserFx> tabUsers;
    @FXML
    TableColumn cName = new TableColumn();
    @FXML
    TableColumn cLastName = new TableColumn();
    @FXML
    TableColumn cPhone = new TableColumn();
    @FXML
    TableColumn cMail = new TableColumn();
    @FXML
    TableColumn cPesel = new TableColumn();

    private ActionEvent actionEvent;


    @FXML
    private DatePicker dateofBirth;
    @FXML
    private TextField ageField;

    @FXML
    private void showAge(ActionEvent he) {
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        int birthYear = (dateofBirth.getValue().getYear());
        int age = year - birthYear;
        ageField.setText(Integer.toString(age) + "Years");

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tabTables.setDisable(true);
        cName.setCellValueFactory(new PropertyValueFactory<UserFx, String>("Name"));
        cLastName.setCellValueFactory(new PropertyValueFactory<UserFx, String>("LastName"));
        cPhone.setCellValueFactory(new PropertyValueFactory<UserFx, String>("Phone"));
        cMail.setCellValueFactory(new PropertyValueFactory<UserFx, String>("Mail"));
        cPesel.setCellValueFactory(new PropertyValueFactory<UserFx, String>("Pesel"));

    }

    @FXML
    private void doLogin(ActionEvent actionEvent) {
        this.actionEvent = actionEvent;
        String login = tLogin.getText();
        String passw = tPassword.getText();
        if (login.equals("Mateusz") && passw.equals("1111")) {
            tabTables.setDisable(false);

        }
    }

    public void AddToTables(ActionEvent actionEvent) {
        String name = tName.getText();
        String lastname = tLastName.getText();
        String phone= tPhone.getText();
        String mail = tMail.getText();
        String pesel = tPesel.getText();
        UserFx newUser = new UserFx(name, lastname, phone, mail, pesel);
        tabUsers.getItems().add(newUser);
        tName.setText(" ");
        tLastName.setText(" ");
        tPhone.setText(" ");
        tMail.setText(" ");
        tPesel.setText(" ");


    }


    public void showmeTime(ActionEvent actionEvent) {
        Calendar c = Calendar.getInstance();
        Date nowDate = new Date();
        System.out.println("current date: " + nowDate);

    }



    }


