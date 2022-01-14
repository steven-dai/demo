package cn.ztuo.webflux.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import javax.annotation.Resource;

/**
 * @author steven
 * @date 2022-01-12 23:17
 */
@Configuration
public class RouteConfig {

    @Resource
    private TimeHandler timeHandler;

    @Bean
    public RouterFunction<ServerResponse> timerRouter() {
        return RouterFunctions.route(RequestPredicates.GET("/time"), request -> timeHandler.time())
                .andRoute(RequestPredicates.GET("/date"), request -> timeHandler.date())
                .andRoute(RequestPredicates.GET("/times"),request -> timeHandler.times());
    }
}
