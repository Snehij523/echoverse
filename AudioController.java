package com.echoverse.controller;

import com.echoverse.service.CloudinaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/audio")
public class AudioController {

    @Autowired
    private CloudinaryService cloudinaryService;

    @PostMapping("/upload")
    public String uploadAudio(@RequestParam("file") MultipartFile file) {
        try {
            return cloudinaryService.uploadFile(file);
        } catch (Exception e) {
            e.printStackTrace();
            return "File upload failed!";
        }
    }
}
