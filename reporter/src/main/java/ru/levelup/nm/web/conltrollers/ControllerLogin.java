package ru.levelup.nm.web.conltrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.levelup.nm.dao.repositories.MainDAO;
import ru.levelup.nm.model.tables.UserAccount;

import javax.servlet.http.HttpSession;

@Controller
public class ControllerLogin {
    private static final String MAPPING_PATH = "/login";
    public static final String VERIFIED_USER_NAME_ATTRIBUTE = "verifiedUserName";

    @Autowired
    private MainDAO mainDAO;


    @GetMapping(MAPPING_PATH)
    public String loginPage(
            @RequestParam(required = false) String login,
            HttpSession session) {
        return session.getAttribute(VERIFIED_USER_NAME_ATTRIBUTE) != null ? "redirect:/" : "login";
    }

    @PostMapping(MAPPING_PATH)
    public String processLoginForm(
            HttpSession session,
            @RequestParam("usernameField") String loginValue,
            @RequestParam("passwordField") String passwordValue) {
        if (session.getAttribute(VERIFIED_USER_NAME_ATTRIBUTE) != null) {
            return "redirect:/";
        }
        UserAccount userAccount = mainDAO.findUserByLogin(loginValue);
        if (userAccount != null && passwordValue.equals(userAccount.getPassword())) {
            session.setAttribute(VERIFIED_USER_NAME_ATTRIBUTE, userAccount.getName());
            return "redirect:/";
        } else {
            return "redirect:/login?login=" + loginValue;
        }
    }
}
