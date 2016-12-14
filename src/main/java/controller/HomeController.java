package controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/home")
public class HomeController {
    private static final String HOME_MODEL_VIEW_NAME = "/home";

    @RequestMapping(method = RequestMethod.GET)
    public String homeModel(Model model) {
        model.addAttribute("name", "John");
        model.addAttribute("path", "/home");
        return HOME_MODEL_VIEW_NAME;
    }
}
