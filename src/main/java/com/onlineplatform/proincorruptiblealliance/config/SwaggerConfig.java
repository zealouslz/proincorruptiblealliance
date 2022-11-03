package com.onlineplatform.proincorruptiblealliance.config;


import com.google.common.collect.Lists;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

 @Bean(value = "userApi")
 @Order(value = 1)
 public Docket groupRestApi() {
     return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
             .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
             .paths(PathSelectors.any())
             .build();
//             .securityContexts(Lists.newArrayList(securityContext()))
//             .securitySchemes(Lists.<SecurityScheme>newArrayList(apiKey()));
 }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("亲清廉盟在线平台接口文档").description("亲清廉盟在线平台接口文档")
                .contact(new Contact("proincorruptiblealliance", "", "")).version("1.0.0").build();
    }

    private ApiKey apiKey() {
        return new ApiKey("TOKEN", "token", "header");
    }

    private SecurityContext securityContext() {
        return SecurityContext.builder().securityReferences(defaultAuth()).forPaths(PathSelectors.regex("/.*")).build();
    }

    List<SecurityReference> defaultAuth() {
        AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
        authorizationScopes[0] = authorizationScope;
        return Lists.newArrayList(new SecurityReference("BearerToken", authorizationScopes));
    }
}

