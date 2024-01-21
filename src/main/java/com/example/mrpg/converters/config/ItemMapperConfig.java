package com.example.mrpg.converters.config;

import com.example.mrpg.converters.ItemMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ItemMapperConfig {
    @Bean
    public ItemMapper itemMapper() {
        return Mappers.getMapper(ItemMapper.class);
    }
}
