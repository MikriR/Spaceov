package br.com.letters;

import java.util.ArrayList;

public class Questions {

    private static ArrayList<String> gameAlternatives = new ArrayList<>();

    public static ArrayList<String> getGameAlternatives() {
        gameAlternatives.add("A");
        gameAlternatives.add("B");
        gameAlternatives.add("C");
        gameAlternatives.add("D");

        return gameAlternatives;
    }

    private static ArrayList<String> gameQuestions = new ArrayList<>();

    public static ArrayList<String> getGameQuestions() {
        gameQuestions.add("O que é o Sol?\n" + """
                                    Alternativas:
                
                                (A) Uma bola de fogo
                                (B) Uma bola de gás
                                (C) Um planeta grande e quente
                                (D) Um buraco Amarelo
                """);

        gameQuestions.add("Qual estado físico do Sol?\n" + """
                                    Alternativas:
                
                                (A) Plasma
                                (B) Gasoso
                                (C) Sólido
                                (D) Líquido
                """);

        gameQuestions.add("Podemos iniciar a contagem regressiva a partir de 10?");
        gameQuestions.add("Olá viajante! Como você gostaria de ser chamado?");
        gameQuestions.add("Como você chamará a sua Nave Espacial?");

        return gameQuestions;
    }
}

