package com.agentic.core.agent;

import org.springframework.ai.chat.client.ChatClient;
import java.util.Map;

public abstract class BaseLlmAgent implements Agent {

    protected final ChatClient chatClient;

    protected BaseLlmAgent(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    protected String askLLM(String prompt) {
        return chatClient.prompt().user(prompt).call().content();
    }

    @Override
    public String execute(String input, Map<String, Object> context) {
        return askLLM(input);
    }
}
