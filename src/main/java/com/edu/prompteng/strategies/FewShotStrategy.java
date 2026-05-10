package com.edu.prompteng.strategies;

import com.edu.prompteng.core.PromptBuilder;
import com.edu.prompteng.core.PromptStrategy;

public class FewShotStrategy implements PromptStrategy {
    @Override
    public String definirEstructuraPrompt(PromptBuilder builder) {
        return builder
                .setInstruction("Convierte el texto a CamelCase.")
                .addExample("hola mundo", "holaMundo")
                .addExample("variable de contador", "") // Se deja en blanco para que el modelo lo resuelva
                .build();
    }
}