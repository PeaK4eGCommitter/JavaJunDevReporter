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
public class ControllerReports {
    private static final String MAPPING_PATH = "/reports";

    @Autowired
    private MainDAO mainDAO;

    @GetMapping(MAPPING_PATH)
    public String loginPage(
            @RequestParam(required = false) String login,
            HttpSession session) {
        return session.getAttribute(ControllerLogin.VERIFIED_USER_NAME_ATTRIBUTE) != null ? "reports" : "redirect:/";
    }

    @PostMapping(MAPPING_PATH)
    public String processLoginForm(
            HttpSession session,
            @RequestParam("usernameField") String loginValue,
            @RequestParam("passwordField") String passwordValue) {
        if (session.getAttribute(ControllerLogin.VERIFIED_USER_NAME_ATTRIBUTE) != null) {
            return "redirect:/reports";
        }
        UserAccount userAccount = mainDAO.findUserByLogin(loginValue);
        if (userAccount != null && passwordValue.equals(userAccount.getPassword())) {
            session.setAttribute(ControllerLogin.VERIFIED_USER_NAME_ATTRIBUTE, userAccount.getName());
            return "redirect:/";
        } else {
            return "redirect:/login?login=" + loginValue;
        }


    }

}
