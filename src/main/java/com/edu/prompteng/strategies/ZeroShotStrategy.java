package com.edu.prompteng.strategies;

import com.edu.prompteng.core.PromptBuilder;
import com.edu.prompteng.core.PromptStrategy;

public class ZeroShotStrategy implements PromptStrategy {
    @Override
    public String definirEstructuraPrompt(PromptBuilder builder) {
        return builder
                .setInstruction("explica el proposito de la palabra reservada public en el lenguaje de programación Java.")
                .build();
    }
}