package fun.javaweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 框架搭建测试
 * @author 李幸
 * @date 2018/1/4
 * @time 12:49
 */
@Controller
public class HelloController {

    /**
     * 框架测试
     * @return
     */
    @GetMapping("/")
    public String hello(){
        //页面显示就成功了
        return "index";
    }
}
