package com.example.scfgatewaylimiter;

import com.example.scfgatewaylimiter.resolver.HostAddrKeyResolver;
import com.example.scfgatewaylimiter.resolver.UriKeyResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ScFGatewayLimiterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScFGatewayLimiterApplication.class, args);
    }

    @Bean
    public HostAddrKeyResolver hostAddrKeyResolver() {
        return new HostAddrKeyResolver();
    }

    @Bean
    public UriKeyResolver uriKeyResolver() {
        return new UriKeyResolver();
    }
}
