package ru.levelup.nm.web.forms.welcomepage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WelcomePageForm {
    private String login = "default login";
    private String description = "default description";

    public void onClick() throws Exception {
//        throw new Exception("onClick called");
    }

    public void onClickTime(){
        login = new Date().toString();
    }
}
