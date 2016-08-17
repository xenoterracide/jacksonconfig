package com.xenoterracide;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

@Configuration
class JacksonConfig {

    @Bean
    public Jackson2ObjectMapperBuilder objectMapperBuilder() {
        return new Jackson2ObjectMapperBuilder() {

            @Override
            public void configure( ObjectMapper objectMapper ) {
                super.configure( objectMapper );
                objectMapper.setVisibility( PropertyAccessor.ALL, JsonAutoDetect.Visibility.NONE );
                objectMapper.setVisibility( PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY );
            }

        };

    }
}
