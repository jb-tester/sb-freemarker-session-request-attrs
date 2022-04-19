package com.mytests.spring.springboot.freemarkertest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MA_Controller {

    @ModelAttribute
    public void globalAttributes(Model model) {
        model.addAttribute("globalModelAttr1", "globalModelAttr1");
    }

    @ModelAttribute("globalModelAttr2")
    public String globalModelAttr2(){
        return "globalModelAttr2";
    }
    @ModelAttribute("globalModelAttr3")
    public String attr(){
        return "globalModelAttr3";
    }

    @RequestMapping("/index")
    public String index(ModelMap model) {
        model.addAttribute("index_attr","foo");
        return "ma_test";
    }


}