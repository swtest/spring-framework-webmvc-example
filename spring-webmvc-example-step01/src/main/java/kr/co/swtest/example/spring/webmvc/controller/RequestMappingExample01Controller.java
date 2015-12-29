/*******************************************************************************
 * Copyright(c) 2015 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.example.spring.webmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * RequestMapping 예제01 컨트롤러
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 */
@Controller
public class RequestMappingExample01Controller {

    @RequestMapping("/example01/test01")
    public String sample01() {
        return "/example01/test01";
    }

    @RequestMapping("/example01/test02")
    public String sample02() {
        return "/example01/test02";
    }

}
