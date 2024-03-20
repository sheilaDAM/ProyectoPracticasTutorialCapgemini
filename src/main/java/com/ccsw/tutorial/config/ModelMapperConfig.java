/**
 * 
 */
package com.ccsw.tutorial.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;

/**
 * Info proyecto :)
 *
 * @author Sheila Isabel Jiménez Nieto
 * @since 14-03-2024
 * @lastModified 19-03-2024
 * @version 1.0
 *
 **/

public class ModelMapperConfig {

    @Bean
    public ModelMapper getModelMapper() {

        return new ModelMapper();
    }
}
