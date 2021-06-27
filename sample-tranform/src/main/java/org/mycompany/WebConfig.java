package org.mycompany;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*@EnableWebMvc
@Configuration
@ComponentScan({"org.mycompany"})*/
public class WebConfig implements WebMvcConfigurer {

	HttpMessageConverter messageConverters;
	
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")
            .allowedOrigins("http://domain1.com","http://domain2.com");
    }

    @Override
    public void configureMessageConverters(
      List<HttpMessageConverter<?>> converters) {
    
        //messageConverters.add(createXmlHttpMessageConverter());
       // messageConverters.add(new MappingJackson2HttpMessageConverter());
    }
    /*private HttpMessageConverter<Object> createXmlHttpMessageConverter() {
        MarshallingHttpMessageConverter xmlConverter = 
          new MarshallingHttpMessageConverter();

        XStreamMarshaller xstreamMarshaller = new XStreamMarshaller();
        xmlConverter.setMarshaller(xstreamMarshaller);
        xmlConverter.setUnmarshaller(xstreamMarshaller);

        return xmlConverter;
    }*/
}

