package com.fkselimoglu.imagegeneration.client;

import com.fkselimoglu.imagegeneration.config.ImageGeneratorConfig;
import com.fkselimoglu.imagegeneration.dto.ImageRequestDto;
import com.fkselimoglu.imagegeneration.dto.ImageResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "imageGenerator", url = "${openai.image.url}", configuration = ImageGeneratorConfig.class)
public interface ImageClient {
    @PostMapping(value = "/v1/images/generations")
    ImageResponseDto generateImage(@RequestBody final ImageRequestDto request);
}
