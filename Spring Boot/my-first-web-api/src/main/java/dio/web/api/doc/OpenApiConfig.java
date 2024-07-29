package dio.web.api.doc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Title - Rest API")
                        .description("API exemplo de uso de Springboot REST API")
                        .version("1.0")
                        .termsOfService("Termo de uso: Open Source")
                        .contact(new Contact()
                                .name("Kauan")
                                .url("http://www.seusite.com.br")
                                .email("voce@seusite.com.br"))
                        .license(new License()
                                .name("Licença - Sua Empresa")
                                .url("http://www.seusite.com.br")));
    }
}