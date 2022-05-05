package site.daishuyang.tcp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import site.daishuyang.tcp.TcpService;

/**
 * @author steven
 * @date 2022-03-03 13:02
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping(value = "callback",method = RequestMethod.GET)
    public String callback(){
        // 处理微信回调请求
        TcpService.IS_OPEN = true;
        // 响应
        return "SUCCESS";
    }

}
