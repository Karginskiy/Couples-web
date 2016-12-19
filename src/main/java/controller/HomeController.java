package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home")
public class HomeController {
    private static final String HOME_MODEL_VIEW_NAME = "home";

    @RequestMapping(method = RequestMethod.GET)
    public String homeModel(Model model) {
        model.addAttribute("name", "John");
        return HOME_MODEL_VIEW_NAME;
    }
}
