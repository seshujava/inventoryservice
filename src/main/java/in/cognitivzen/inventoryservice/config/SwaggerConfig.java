package in.cognitivzen.inventoryservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket postsApi() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("public-api")
                .apiInfo(apiInfo()).select().paths(PathSelectors.any()).build();
    }

    @SuppressWarnings("deprecation")
	private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("Inventory Management API")
                .description("CognitivZen Inventory Management API reference for developers")
                .termsOfServiceUrl("https://cognitivzen.com/")
                .contact("javainuse@cognitivzen.com").license("JavaInUse License")
                .licenseUrl("javainuse@cognitivzen.com").version("1.0").build();
    }
}
