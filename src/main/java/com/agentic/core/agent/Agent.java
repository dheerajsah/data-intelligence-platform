package com.agentic.core.agent;

import java.util.Map;

public interface Agent {
    String name();
    String execute(String input, Map<String, Object> context);
}
