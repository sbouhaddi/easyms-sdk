package com.easyms.rest.autoconfigure;


import com.easyms.rest.ms.config.SwaggerProperties;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author khames.
 */

@AutoConfiguration
@Data
@Slf4j
@ComponentScan(basePackages = {"com.easyms.rest.ms"})
@EnableFeignClients
public class EasyMsAutoConfiguration {

    private final SwaggerProperties properties;

/*    @Bean
    @ConditionalOnMissingBean({GroupedOpenApi.class})
    public GroupedOpenApi api() {
        return GroupedOpenApi.builder()
                .group("")
                .pathsToMatch(properties.getPaths())
                .build();
    }*/


    /*@Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info().title(properties.getApiInfoTitle())
                        .description(properties.getApiInfoDescription())
                        .version(properties.getApiInfoVersion())
                        .license(new License()
                                .name(properties.getApiInfoLicense())
                                .url(properties.getApiInfoLicenseUrl()))
                        .contact(new Contact()
                                .url(properties.getApiInfoContactURL())
                                .email(properties.getApiInfoContactEmail())
                                .name(properties.getApiInfoContactName())));
    }*/

}

