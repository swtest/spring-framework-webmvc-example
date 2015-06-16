/*******************************************************************************
 * Copyright(c) 2015 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.example.spring.webmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * HelloWorld 컨트롤러
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 */
@Controller
public class HelloWorldController {

    /** hello world */
    @RequestMapping("/helloWorld")
    public ModelAndView helloWorld() {
        ModelAndView model = new ModelAndView("helloWorld");
        model.addObject("message", "hello world");
        return model;
    }

}
