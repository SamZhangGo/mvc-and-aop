package com.ruijie.clouddesk.web.share.framework.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>Title: HelloMvcController</p>
 * <p>Description: Function Description</p>
 * <p>Copyright: Ruijie Co., Ltd. (c) 2018</p>
 * <p>@Author: zhangsiming</p>
 * <p>@Date: 2018/5/21 11:11</p>
 */
@Controller
@RequestMapping("/hello")
public class HelloMvcController {

    @RequestMapping("/world")
    public String helloWorld(){

        return "helloworld";
    }
}
