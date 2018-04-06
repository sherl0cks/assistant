package io.openinnovationlabs.assistant.application;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import org.apache.cxf.rs.security.cors.CrossOriginResourceSharingFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfiguration {

    @Bean
    public JacksonJsonProvider jsonProvider() {
        return new JacksonJsonProvider();
    }

    @Bean
    public CrossOriginResourceSharingFilter corsFilter(){ return  new CrossOriginResourceSharingFilter();}


}
