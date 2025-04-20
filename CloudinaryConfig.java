package com.echoverse.config;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CloudinaryConfig {

    @Bean
    public Cloudinary cloudinary() {
        return new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "ddkuzledc",  // Replace with your Cloudinary Cloud Name
                "api_key", "251358666743611",        // Replace with your Cloudinary API Key
                "api_secret", "YPqt3wtUPrpSqR4cU8CEhgqbVF0"   // Replace with your Cloudinary API Secret
        ));
    }
}
