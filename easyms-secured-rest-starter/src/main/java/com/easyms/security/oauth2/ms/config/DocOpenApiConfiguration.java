package com.easyms.security.oauth2.ms.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.resource.PathResourceResolver;
import org.springframework.web.servlet.resource.WebJarsResourceResolver;

@Configuration
public class DocOpenApiConfiguration implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("*.html")
                .addResourceLocations("classpath:/META-INF/resources/webjars/")
                .resourceChain(false)
                .addResolver(new WebJarsResourceResolver())
                .addResolver(new PathResourceResolver());
                //.addTransformer(new IndexPageTransformer());
    }

   /* public static class IndexPageTransformer implements ResourceTransformer {

        private String overwriteDefaultUrl(String html) {
            return html.replace("https://petstore.swagger.io/v2/swagger.json",
                    "/v3/api-docs");
        }

        @Override
        public Resource transform(HttpServletRequest httpServletRequest, Resource resource, ResourceTransformerChain resourceTransformerChain) throws IOException {
            if (resource.getURL().toString().endsWith("/index.html")) {
                String html = IOUtils.toString(resource.getInputStream(), StandardCharsets.UTF_8);
                html = overwriteDefaultUrl(html);
                return new TransformedResource(resource, html.getBytes());
            } else {
                return resource;
            }
        }
    }*/
}