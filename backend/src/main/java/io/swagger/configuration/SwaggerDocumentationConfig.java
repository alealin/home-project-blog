//package io.swagger.configuration;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//
//@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-04-27T00:59:28.741629100+03:00[Europe/Helsinki]")
//@Configuration
//public class SwaggerDocumentationConfig {
//
//    ApiInfo apiInfo() {
//        return new ApiInfoBuilder()
//            .title("Home Project Blog Service")
//            .description("Blog for the Home Project engineers ")
//            .license("MIT")
//            .licenseUrl("https://github.com/Home-Project-Engineering/home-project-blog/blob/main/LICENSE")
//            .termsOfServiceUrl("")
//            .version("1.1.1")
//            .contact(new Contact("","", ""))
//            .build();
//    }
//
//    @Bean
//    public Docket customImplementation(){
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                    .apis(RequestHandlerSelectors.basePackage("com.softserveinc.ita.home.blog.service"))
//                    .build()
//                .directModelSubstitute(org.threeten.bp.LocalDate.class, java.sql.Date.class)
//                .directModelSubstitute(org.threeten.bp.OffsetDateTime.class, java.util.Date.class)
//                .apiInfo(apiInfo());
//    }
//
//}
