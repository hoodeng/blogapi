//package com.vip.demo.config;
//
//import org.springframework.boot.web.servlet.ServletRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.multipart.commons.CommonsMultipartResolver;
//import org.springframework.web.servlet.DispatcherServlet;
////@Configuration
//public class DispatcherServletConfiguration {
//    @Bean
//    public ServletRegistrationBean dispatcherRegistration(DispatcherServlet dispatcherServlet) {
//        ServletRegistrationBean registration = new ServletRegistrationBean(dispatcherServlet);
//        registration.addUrlMappings("/api/*");
//        return registration;
//    }
//
//    @Bean
//    public CommonsMultipartResolver commonsMultipartResolver() {
//        return new CommonsMultipartResolver();
//    }
//}
