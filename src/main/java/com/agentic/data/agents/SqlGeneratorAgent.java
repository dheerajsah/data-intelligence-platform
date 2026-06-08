package com.agentic.data.agents;

import com.agentic.core.agent.BaseLlmAgent;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class SqlGeneratorAgent extends BaseLlmAgent {

    public SqlGeneratorAgent(ChatClient chatClient) {
        super(chatClient);
    }

    @Override
    public String name() { return "analytics"; }

    @Override
    public String execute(String input, Map<String, Object> context) {
        return askLLM("Generate PostgreSQL query safely: " + input);
    }
}
