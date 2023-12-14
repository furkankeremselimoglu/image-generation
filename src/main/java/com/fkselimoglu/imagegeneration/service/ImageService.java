package com.fkselimoglu.imagegeneration.service;

import com.fkselimoglu.imagegeneration.client.ImageClient;
import com.fkselimoglu.imagegeneration.dto.ImageRequestDto;
import com.fkselimoglu.imagegeneration.dto.ImageResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ImageService {
    private final ImageClient imageClient;

    public ImageResponseDto generateImage(final ImageRequestDto request) {
        return imageClient.generateImage(request);
    }
}
