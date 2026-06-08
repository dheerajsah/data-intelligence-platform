package com.agentic.core.orchestrator;

import com.agentic.core.agent.Agent;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class OrchestratorService {

    private final List<Agent> agents;

    public OrchestratorService(List<Agent> agents) {
        this.agents = agents;
    }

    public String process(String input) {

        for (Agent agent : agents) {
            if (input.toLowerCase().contains(agent.name())) {
                return agent.execute(input, Map.of());
            }
        }

        return "No agent matched";
    }
}
