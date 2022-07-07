package ahmad.thymeleaf.controllers;

import ahmad.thymeleaf.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

    private final ProductService productService;

    public IndexController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String getIndex(Model model){
        model.addAttribute("products", productService.listProducts());

        return "index";
    }

    @RequestMapping(value = {"/secured"}, method = RequestMethod.GET)
    public String secured(){
        return "secured";
    }
}
