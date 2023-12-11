package com.fkselimoglu.imagegeneration.dto;

import lombok.Data;

@Data
public class ImageRequestDto {
    private String prompt; // visual content that needs to be understood by OpenAI
    private String size; // image size such as 256x256, 512x512, 1024x1024
    private int n; // Number of images
}
