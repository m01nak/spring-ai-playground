package com.moinak.spring_ai_playground.controller;

import com.moinak.spring_ai_playground.entity.OllamaPromptEntity;
import com.moinak.spring_ai_playground.entity.OllamaResponseEntity;
import com.moinak.spring_ai_playground.service.OllamaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OllamaController {

    @Autowired
    private OllamaService ollamaService;

    @GetMapping("/api/generate-response")
    public OllamaResponseEntity getResponse(@RequestBody OllamaPromptEntity prompt) {
        return new OllamaResponseEntity(ollamaService.generateResponse(prompt.getPrompt()));
    }
}
