package com.xenoterracide;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
class JacksonConfig {

    @Autowired
    void configure( ObjectMapper objectMapper ) {
        objectMapper.setVisibility( PropertyAccessor.ALL, JsonAutoDetect.Visibility.NONE );
        objectMapper.setVisibility( PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY );
    }
}
