package ru.levelup.nm.web.forms.welcomepage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.levelup.nm.dao.repositories.MainDAO;

@Controller
public class WelcomePageController {
    private static final String URL = "/user/register";
    private static final String MODEL_ATTRIBUTE = "WelcomePageForm";

    @ModelAttribute(MODEL_ATTRIBUTE)
    public WelcomePageForm createForm() {
        WelcomePageForm form = new WelcomePageForm();
        return form;
    }

    public WelcomePageData createData() {
        WelcomePageData data = new WelcomePageData();
        return data;
    }

    @GetMapping(path = URL)
    public String getWelcomePageForm(ModelMap model, @ModelAttribute(MODEL_ATTRIBUTE) WelcomePageForm welcomePageForm) {
        model.addAttribute("wp_data", createData());
        model.addAttribute("wp_form", createForm());
        return "welcomepagejsp";
    }

    @PostMapping(path = URL)
    public String processWelcomePageFrom(ModelMap model,
            @Validated @ModelAttribute(MODEL_ATTRIBUTE) WelcomePageForm welcomePageForm, BindingResult validationResult)
    {
        model.addAttribute("welcomepage_data", createData());
        return "welcomepagejsp";
    }
}
