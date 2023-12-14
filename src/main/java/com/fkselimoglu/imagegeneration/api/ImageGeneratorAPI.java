package com.fkselimoglu.imagegeneration.api;

import com.fkselimoglu.imagegeneration.dto.ImageRequestDto;
import com.fkselimoglu.imagegeneration.dto.ImageResponseDto;
import com.fkselimoglu.imagegeneration.service.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/images")
@RequiredArgsConstructor
public class ImageGeneratorAPI {
    private final ImageService imageService;

    @PostMapping("generate")
    public ResponseEntity<ImageResponseDto> generateImage(@RequestBody final ImageRequestDto request) {
        return ResponseEntity.ok(imageService.generateImage(request));
    }
}
