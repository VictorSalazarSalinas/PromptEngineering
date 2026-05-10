package com.edu.prompteng;

import com.edu.prompteng.core.PromptBuilder;
import com.edu.prompteng.core.PromptStrategy;
import com.edu.prompteng.strategies.ChainOfThoughtStrategy;
import com.edu.prompteng.strategies.FewShotStrategy;
import com.edu.prompteng.strategies.ZeroShotStrategy;

public class Main {
    private PromptStrategy estrategia;

    public void setEstrategia(PromptStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public String construirPrompt(PromptBuilder builder) {
        return estrategia.definirEstructuraPrompt(builder);
    }

    public static void main(String[] args) {
        Main agente = new Main();

        System.out.println("=== ZERO-SHOT PROMPTING ===");
        PromptBuilder builderZero = new PromptBuilder();
        agente.setEstrategia(new ZeroShotStrategy());
        System.out.println(agente.construirPrompt(builderZero));

        System.out.println("\n=== FEW-SHOT PROMPTING ===");
        PromptBuilder builderFew = new PromptBuilder();
        agente.setEstrategia(new FewShotStrategy());
        System.out.println(agente.construirPrompt(builderFew));

        System.out.println("\n=== CHAIN-OF-THOUGHT PROMPTING ===");
        PromptBuilder builderCoT = new PromptBuilder();
        agente.setEstrategia(new ChainOfThoughtStrategy());
        System.out.println(agente.construirPrompt(builderCoT));
    }
}