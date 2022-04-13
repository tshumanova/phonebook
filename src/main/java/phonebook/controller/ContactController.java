package phonebook.controller;

import org.springframework.stereotype.Controller;
import phonebook.entity.Contact;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ContactController {

    List<Contact> contacts;
    public ContactController(){
        this.contacts= new ArrayList<>();

    }

}
