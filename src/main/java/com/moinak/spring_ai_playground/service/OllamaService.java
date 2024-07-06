package com.moinak.spring_ai_playground.service;

import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.ai.ollama.api.OllamaOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OllamaService {

    @Autowired
    private OllamaChatModel chatModel;

    public String generateResponse(String promptString) {
        ChatResponse response = chatModel.call(
                new Prompt(
                        promptString,
                        OllamaOptions.create()
                                .withModel("llama2")
                )
        );

        return response.getResult().getOutput().getContent();
    }
}
