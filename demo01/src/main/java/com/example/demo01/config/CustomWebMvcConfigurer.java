package com.example.demo01.config;

import com.example.demo01.interceptor.LoginIntercepter;
import com.example.demo01.interceptor.TwoIntercepter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 自定义inteceptor注册
 * @Configuration 配置类注解
 */
@Configuration
public class CustomWebMvcConfigurer implements WebMvcConfigurer  {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {

		registry.addInterceptor(new LoginIntercepter()).addPathPatterns("/api2/*/**");
		//registry.addInterceptor(new TwoIntercepter()).addPathPatterns("/api2/*/**");
		
		//.excludePathPatterns("/api2/xxx/**"); //拦截全部 /*/*/**
		
		WebMvcConfigurer.super.addInterceptors(registry);
	}

	
	
	


}
