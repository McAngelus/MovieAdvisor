package com.openwebinars.movieadvisor.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// Using the Configuration label for using this class as a configuration file
@Configuration
// Usin this label for declare the base packs
@ComponentScan(basePackages = "com.openwebinars.movieadvisor")
public class AppConfig {

}
