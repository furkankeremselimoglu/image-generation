package com.fkselimoglu.imagegeneration.dto;

import lombok.Data;
import java.util.List;

@Data
public class ImageResponseDto {
    private List<ImageDto> urlList; // OpenAI will send an url list containing a plural visual object as output.
}
