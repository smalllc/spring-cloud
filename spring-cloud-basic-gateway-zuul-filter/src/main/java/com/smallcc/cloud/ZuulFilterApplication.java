package com.smallcc.cloud;

import com.smallcc.cloud.filter.PreZuulFilter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * @param
 * @author 晓风过境
 * @description zuul 启动注解 其实包含了 eureka + hystrix
 * @date 2019/1/21 21:46
 * @return com.smallcc.cloud
 * @title com.smallcc.cloud
 * @project_name ZuulApplication.java
 */
@SpringBootApplication
//@EnableEurekaServer
@EnableZuulProxy
public class ZuulFilterApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ZuulFilterApplication.class).web(true).run(args);
    }

    @Bean
    public PreZuulFilter preZuulFilter() {
        return new PreZuulFilter();
    }
}
