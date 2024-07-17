package com.codegym.emaildisplay.configuration;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

//bstractAnnotationConfigDispatcherServletInitializer là một lớp tiện ích từ Spring Framework,
// cung cấp một cách để thay thế cấu hình dựa trên XML của web.xml bằng cách sử dụng Java Config
public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{AppConfiguration.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{};
    }

//    Phương thức này chỉ định các URL mappings cho DispatcherServlet.
//    Ở đây, DispatcherServlet sẽ xử lý tất cả các yêu cầu ("/").
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        filter.setEncoding("UTF-8");
        filter.setForceEncoding(true);
        return new Filter[] { filter };
    }
}
