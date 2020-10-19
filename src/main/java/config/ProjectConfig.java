package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = {"service","repository"})
public class ProjectConfig {


    //1
//    @Bean
//
//    public MyBean myBean1(){
//        MyBean b= new MyBean();
//        b.setText("Hello");
//        return b;
//    }
//
//
//    @Bean
//    @Primary
//    public MyBean myBean2(){
//        MyBean b=new MyBean();
//        b.setText("World");
//        return b;
//    }
}
