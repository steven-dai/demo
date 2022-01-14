package cn.ztuo.webflux.config;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

/**
 * @author steven
 * @date 2022-01-12 23:10
 */
@Component
public class TimeHandler {

    public Mono<ServerResponse> time() {
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(Mono.just(new SimpleDateFormat("HH:mm:ss").format(new Date())), String.class);
    }

    public Mono<ServerResponse> date() {
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(Mono.just(new SimpleDateFormat("yyyy-MM-dd").format(new Date())), String.class);
    }

    public Mono<ServerResponse> times() {
        return ServerResponse.ok().contentType(MediaType.TEXT_EVENT_STREAM).body(Flux.interval(Duration.ofSeconds(1)).map(a -> new SimpleDateFormat("HH:mm:ss").format(new Date())), String.class);
    }

}
