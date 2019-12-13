package com.zbf.scfgatewayfirstsight.filter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.core.Ordered;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * Description:自定义过滤器
 *
 * @author 创建者
 * @author 修改者
 * @version 2019/12/13 10:46
 * @since 2019/12/13 10:46
 */
public class RequestTimeFilter implements GatewayFilter, Ordered {

    private static final Log log = LogFactory.getLog(GatewayFilter.class);
    private static final String REQUEST_TIME_BEGIN = "requestTimeBegin";

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        //pre”类型过滤器
        exchange.getAttributes().put(REQUEST_TIME_BEGIN, System.currentTimeMillis());
        //post类型过滤器
        return chain.filter(exchange).then(
                Mono.fromRunnable(() -> {
                    Long startTime = exchange.getAttribute(REQUEST_TIME_BEGIN);
                    if (startTime != null) {
                        log.info(exchange.getRequest().getURI().getRawPath() + ": " + (System.currentTimeMillis() - startTime) + "ms");
                    }
                })
        );

    }

    /**
     * 给过滤器设定优先级别的，值越大则优先级越低
     * @return
     */
    @Override
    public int getOrder() {
        return 0;
    }
}
