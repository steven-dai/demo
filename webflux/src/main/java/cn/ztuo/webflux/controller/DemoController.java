package cn.ztuo.webflux.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author steven
 * @date 2022-01-12 22:17
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping(value = "",method = RequestMethod.GET)
    public Mono<String> helloWorld(){
        return Mono.just("Hello World!");
    }

}
