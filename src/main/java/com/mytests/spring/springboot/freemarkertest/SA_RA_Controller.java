package com.mytests.spring.springboot.freemarkertest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;


@Controller
@RequestMapping("/session_and_request_attrs")
public class SA_RA_Controller {

    @RequestMapping("/")
    public String test1(ModelMap model,
                        @SessionAttribute("globalSessionAttr1") String gsa1,
                        @SessionAttribute String globalSessionAttr2,
                        @RequestAttribute("start_reqattr1") Long ra,
                        @RequestAttribute() Long start_reqattr2) {
             model.addAttribute("sa", gsa1+" "+globalSessionAttr2);
             model.addAttribute("ra", ra+" "+start_reqattr2);
        return "sa_ra_test";
    }



}
