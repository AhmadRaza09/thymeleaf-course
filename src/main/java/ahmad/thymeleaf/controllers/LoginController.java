package ahmad.thymeleaf.controllers;

import ahmad.thymeleaf.commands.LoginCommand;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class LoginController {

    @RequestMapping(value = {"/login"}, method = RequestMethod.GET)
    public String showLoginForm(Model model){

        model.addAttribute("loginCommand", new LoginCommand());
        return "loginform";
    }

    @RequestMapping(value = {"/logout-success"}, method = RequestMethod.GET)
    public String yourLoggedOut() {
        return "logout-success";
    }

//    @RequestMapping(value = {"/dologin"}, method = RequestMethod.POST)
    public String dologin(@Valid LoginCommand loginCommand, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "loginform";
        }

        return "redirect:/";
    }
}
