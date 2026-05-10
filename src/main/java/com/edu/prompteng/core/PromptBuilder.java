package com.edu.prompteng.core;

import java.util.ArrayList;
import java.util.List;

public class PromptBuilder {
    private String role = "";
    private String context = "";
    private String instruction = "";
    private List<String> examples = new ArrayList<>();

    public PromptBuilder setRole(String role) {
        this.role = role;
        return this;
    }

    public PromptBuilder setContext(String context) {
        this.context = context;
        return this;
    }

    public PromptBuilder setInstruction(String instruction) {
        this.instruction = instruction;
        return this;
    }

    public PromptBuilder addExample(String input, String output) {
        this.examples.add("entrada: " + input + ". salida: " + output);
        return this;
    }

    public String build() {
        StringBuilder prompt = new StringBuilder();
        if (!role.isEmpty()) prompt.append("rol: ").append(role).append("\n");
        if (!context.isEmpty()) prompt.append("contexto: ").append(context).append("\n");
        if (!instruction.isEmpty()) prompt.append("nnstrucción: ").append(instruction).append("\n");
        if (!examples.isEmpty()) {
            prompt.append("ejemplos:\n");
            for (String example : examples) {
                prompt.append("- ").append(example).append("\n");
            }
        }
        return prompt.toString();
    }
}