package com.chinasofti.manager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.HiddenHttpMethodFilter;

//解决
//前端：在Ajax中发送POST求后，带_method参数，将其修改为PUT，或者DELETE请求
//后台：配置HiddenHttpMethodFilter

@Configuration
public class HttpRequestConfig {

    @Bean
    public HiddenHttpMethodFilter hiddenHttpMethodFilter() {
        HiddenHttpMethodFilter hiddenHttpMethodFilter = new HiddenHttpMethodFilter();
        hiddenHttpMethodFilter.setBeanName("HiddenHttpMethodFilter");
        hiddenHttpMethodFilter.setMethodParam("_method");
        return hiddenHttpMethodFilter;
    }
}