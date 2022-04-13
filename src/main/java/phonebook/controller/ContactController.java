package phonebook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import phonebook.entity.Contact;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class ContactController {

    List<Contact> contacts;

    public ContactController() {
        this.contacts = new Arrays.asList(
                new Contact("Tedi", "+35988228884"),
                new Contact("George"," +359882221212"),
        )

    }

    @GetMapping("/")
    public ModelAndView getAllContacts(ModelAndView modelAndView) {
        modelAndView.addObject("contatacts", contacts);
        return modelAndView;
    }
}

