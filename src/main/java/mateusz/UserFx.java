package mateusz;

import javafx.beans.property.SimpleStringProperty;
import javafx.scene.layout.StackPane;

import java.time.LocalTime;

public class UserFx {
    public SimpleStringProperty name;

    public String getLastName() {
        return lastName.get();
    }

    public SimpleStringProperty lastNameProperty() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public SimpleStringProperty lastName;
    public SimpleStringProperty phone;
    public SimpleStringProperty mail;
    public SimpleStringProperty pesel;


    public UserFx(String name, String lastName, String phone, String mail, String pesel) {
        this.name = new SimpleStringProperty(name);
        this.lastName = new SimpleStringProperty(lastName);
        this.phone = new SimpleStringProperty(phone);
        this.mail = new SimpleStringProperty(mail);
        this.pesel = new SimpleStringProperty(pesel);

    }


    public UserFx getAccount() {
        return this;
    }
    public String getName() {
        return name.get();
    }
    public void setName(String fName) {
        name.set(fName);
    }


    public String getPhone() {
        return phone.get();
    }
    public void setPhone(String phone) { this.phone.set(phone); }

    public String getMail() {
        return mail.get();
    }
    public void setMail(String phone) { this.mail.set(phone); }

    public String getPesel() { return pesel.get();}
    public void setPesel(String pesel) {this.pesel.set(pesel);}

    public final void ObjectProperty(StackPane dialogParent) {

    }



    @Override
    public String toString() {
        return name + " " + lastName +  mail + pesel+ (" + phone + ");
    }
}

