package com.jmk.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
 
import com.jmk.springboot.model.MessageStorage;
 
@Configuration
public class BeanConfiguration {
 
  @Bean
  public MessageStorage customerStorage() {
    return new MessageStorage();
  }
}	
