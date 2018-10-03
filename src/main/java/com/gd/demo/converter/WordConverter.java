package com.gd.demo.converter;

import com.gd.demo.domain.Word;
import com.gd.demo.dto.WordDto;
import lombok.Getter;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Getter
@Component
@Mapper(componentModel = "spring")
public abstract class WordConverter {

    public abstract Word toEntity(WordDto dtoList);

    public abstract WordDto toDto(Word entityList);

}
