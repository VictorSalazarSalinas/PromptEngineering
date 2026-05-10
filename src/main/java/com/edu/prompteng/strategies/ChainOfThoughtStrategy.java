package com.edu.prompteng.strategies;

import com.edu.prompteng.core.PromptBuilder;
import com.edu.prompteng.core.PromptStrategy;

public class ChainOfThoughtStrategy implements PromptStrategy {
    @Override
    public String definirEstructuraPrompt(PromptBuilder builder) {
        return builder
                .setInstruction("determina la complejidad algoritmica de un ciclo for anidado dentro de otro ciclo for que itera sobre la misma matriz de tamaño N. Piensa paso a paso.")
                .build();
    }
}