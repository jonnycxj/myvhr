package com.jgds.hrserver.config.swagger;


import com.google.common.base.Predicates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    /**注入环境上下文*/
    @Autowired
    Environment environment;

    @Bean
    public Docket appApi() { return createDocket("app系列接口", "app");}

    @Bean
    public Docket serviceApi(){return  createDocket("第三方服务系列接口","service");}

    @Bean
    public Docket adminApi(){return createDocket("后台系列接口","admin");}

    public Docket createDocket (String title,String path){
        return new Docket(DocumentationType.SWAGGER_2)                .groupName(title)
                .genericModelSubstitutes(DeferredResult.class)
                .useDefaultResponseMessages(false)
                .forCodeGeneration(false)
                .pathMapping("/")
                .select()
                //需要过滤的接口
                .paths(Predicates.or(PathSelectors.regex("/"+path+"/")))
                .build()
                .apiInfo(new ApiInfoBuilder().title(title).version("1.0").license("步步高教育电子有限公司")
                        .contact(new Contact("eebbk","www.baidu.com",""))
                        .build())
                .enable(!isRealEnv());

    }

    private boolean isRealEnv() {
        return "real".equals(environment.getProperty("spring.profiles.active"));
    }


}
