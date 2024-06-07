package br.com.fiap.gs.ecowave;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(info = @Info(title = "EcoWave API", version = "v1", description = "Documentation of EcoWave API"))
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi apiDocket() {
        return GroupedOpenApi.builder()
                .group("EcoWave")
                .packagesToScan("br.com.fiap.gs.ecowave.controller")
                .build();
    }
}
