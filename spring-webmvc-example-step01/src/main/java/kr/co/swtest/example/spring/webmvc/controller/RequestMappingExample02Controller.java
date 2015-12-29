/*******************************************************************************
 * Copyright(c) 2015 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.example.spring.webmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * RequestMapping 예제02 컨트롤러
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 */
@RequestMapping("/example02")
@Controller
public class RequestMappingExample02Controller {

    @RequestMapping("/test01")
    public String sample01(@ModelAttribute("user") User user) {
        return "/example02/test01";
    }

    @RequestMapping("/test02")
    public String sample02() {
        return "/example02/test02";
    }

}
