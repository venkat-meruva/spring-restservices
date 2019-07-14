package com.spring.thymleaf.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**Swagger end point for documentation 
 * swagger-ui.html
 * http://localhost:8080/swagger-ui.html
 * @author venkat
 *
 */
@EnableSwagger2
@Configuration
public class SwaggerConfig {

        @Bean
        public Docket postsApi() {
            return new Docket(DocumentationType.SWAGGER_2).groupName("public-api")
                    .apiInfo(apiInfo()).select().build();
        }

        @SuppressWarnings("deprecation")
		private ApiInfo apiInfo() {
            return new ApiInfoBuilder().title("VENKAT API")
                    .description("Venkat API reference for developers")
                    .termsOfServiceUrl("http://venkatmeruva.com")
                    .contact("venkatmeruvaa@gmail.com").license("Venkat License")
                    .licenseUrl("venkatmeruvaa@gmail.com").version("1.0").build();
        }
}
