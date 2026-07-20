package br.com.letters;

import br.com.several.Ship;
import br.com.several.Universe;
import br.com.user.User;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;

public class Message {

    public static int initialMessage() {
        System.out.println("Bem-vindo ao Spaceov \n");
        System.out.println("A proposta é combinar um puzzle(Perguntas e respostas) cientifíco com o ambiente e jornada espacial ");
        System.out.println("As perguntas poderá estar integrada a física, matemática, biologia, etc. \n");
        System.out.println("Podemos começar?");
        return avoidInsertError(6);
    }

    public static int avoidInsertError(int indexChoices) {
        while (true) {
            try {
                System.out.println(hitAndMiss.get(indexChoices));
                int choiceStart = User.numberChoice();
                User.bufferClean();
                return choiceStart;

            } catch (InputMismatchException e) {
                System.out.println("Por favor, escolha apenas números.\n");
                User.bufferClean();
            }
        }
    }

    public static void asksAndShipOrbit() {
        System.out.println(Questions.getGameQuestions().get(3));
        String choiceName = User.wordChoice();

        System.out.println(Questions.getGameQuestions().get(4));
        String choiceShip = User.wordChoice();

        int velocity = 40;
        String orbitMessage = "Na órbita da Terra está localizada a nave " + choiceShip + " com o seu piloto " + choiceName + ". \n" +
                "A nave é um modelo " + Ship.getTypeShip().getFirst() + " e está tudo pronto para o acionamento dos propulsores" + ". \n" +
                "Tudo vai depender de como você responderá a pergunta à seguir.\n" + "\n";

        try {
            for (int i = 0; i < orbitMessage.length(); i++) {
                System.out.print(orbitMessage.charAt(i));
                System.out.flush();
                Thread.sleep(velocity);
            }
        } catch (InterruptedException e) {
            System.out.println();
            User.bufferClean();
        }
    }

    public static int funMessage() {
        String[] funMessages = {
                "Vamos lá! Você vai gostar.",
                "É super divertido! Por que não experimenta?",
                "Sua experiência será bem gratificante, começaremos?",
                "Vamos mexer um pouquinho o esqueleto nessa experiência mágica?",
                "Não querendo persuadir, mas você sabia que ganhará dinheiro se começar? PS: No real money",
                "Você fala Russo? Então... Достигните уровня мастерства Лайки. Давайте начнём!"
        };

        int randomIndex = new Random().nextInt(funMessages.length);
        System.out.println(funMessages[randomIndex]);
        return avoidInsertError(7);
    }

    public static int validsOptions() {
        System.out.println("Me ajude a te ajudar");
        System.out.println("E te ajudando, entregarei novamente o menu de opções válidas");
        return avoidInsertError(6);
    }

    public static void notYet() {
        if (Ship.getShipIntegrity() <= 79) {
            System.out.println(Message.getHitAndMiss().get(5));
            System.out.println("Acertando ou errando a pergunta, a nave não chegará nas condições mínimas para viajarmos.");
            System.out.println("Integridade atual: " + Ship.getShipIntegrity() + "%\n" +
                    "Integridade mínima: 80.0%");
            System.exit(0);
        }
    }

    private static ArrayList<String> hitAndMiss = new ArrayList<>();

    static {
        hitAndMiss.add("Muito bem! Os propulsores da " + Ship.getTypeShip().getFirst() + " foram ligados\n" +
                "Com o seu acerto, você ganhou 25% de intregidade para a sua nave.\n");
        hitAndMiss.add("Resposta Incorreta.");
        hitAndMiss.add("A sua nave chegou a integridade 0 e não é mais possível continuarmos com a nossa viagem.");
        hitAndMiss.add("Fantástico! Você acertou a segunda pergunta.\n" +
                "Com o seu acerto, você ganhou 25% de intregidade para a sua nave.");
        hitAndMiss.add("A sua nave está com 100% de integridade e agora podemos viajar pelo espaço sem problemas. \n");
        hitAndMiss.add("A integridade da sua nave está muito baixa e não poderemos seguir viagem.");
        hitAndMiss.add("""
                                         Escolha:
                                1 - Sim
                                2 - Não
                """);
        hitAndMiss.add("""
                                         Escolha:
                                1 - Sim
                """);
    }

    public static ArrayList<String> getHitAndMiss() {
        return hitAndMiss;
    }

    public static void exhibitHitAndMiss(int exhibitIndex) {
        timing();
        String exhibitionResult = getHitAndMiss().get(exhibitIndex);
        System.out.println(exhibitionResult);
    }

    public static String exhibitQuestion(int questionIndex) {
        System.out.println(Questions.getGameQuestions().get(questionIndex));
        String choiceQuestion = User.wordChoice();
        return choiceQuestion;
    }

    public static void noRepeatQuestion() {
        exhibitHitAndMiss(1);
        dropPercentageMessage();
        integrityCheck();
    }

    public static void noRepeatQuestionFinal() {
        exhibitHitAndMiss(1);
        dropPercentageMessage();
        notYet();
    }

    public static void dropPercentageMessage() {
        System.out.println("Atenção! A porcentagem da integridade da sua nave caiu para " + Ship.getShipIntegrity() + "%");
    }

    public static void integrityCheck() {
        if (Ship.getShipIntegrity() <= 0) {
            Message.exhibitHitAndMiss(2);
            System.exit(0);
        }
    }

    public static void gasBallMessage() {
        timing();
        System.out.println("Excelente!");
        System.out.println("Você respondeu corretamente que o Sol é uma Bola de Gás. \nE a próxima pergunta será mais fácil ainda \n");
    }

    public static void shipController() {
        timing();
        System.out.println("KSSHHHH\n");
        System.out.println("""
                                 Mensagem de Voz da Nave:
                
                    Atenção a todos os tripulantes.
                    Todos para seus assentos
                    Estamos acionando os propulsores para a viagem.
                """);

        System.out.println("Nosso destino será o " + Universe.getDestinos().getFirst() + "\n");
    }

    public static String countDownPermission() {
        timing();
        System.out.println(Questions.getGameQuestions().get(2));
        String permissionChoice = User.wordChoice();
        return permissionChoice;
    }

    public static void typingMessages(String[] messageTyped) {
        int velocity = 500;
        try {
            for (int i = 0; i < messageTyped.length; i++) {
                System.out.println(messageTyped[i] + " ");
                System.out.flush();
                Thread.sleep(velocity);
            }
        } catch (Exception e) {
            System.out.println();
            User.bufferClean();
        }
    }

    public static String yesChoice() {
        String variations = "Sim";
        return variations;
    }

    public static void countDown() {
        System.out.println("Atenção! Contagem regressiva começando.");
        String[] countdown = {"10...", "9...", "8...", "7...", "6...", "5...", "4...", "3...", "2...", "1...", "0\n"};
        typingMessages(countdown);
    }

    public static String responseNoAccept() {
        System.out.println("Uma viagem espacial é mágica!\n" +
                "E por isso, aceitamos somente SIM como resposta.\n\n" +
                Questions.getGameQuestions().get(2));
        String permissionChoice = User.wordChoice();
        return permissionChoice;
    }

    public static void toSun() {
        System.out.println("Vwooooorp!");
        String[] distancies = {"Distância: 135.000.000 milhões de quilometros", "Distância: 100.000.000 milhões de quilometros",
                "Distância: 55.000.000 milhões de quilometros", "Distância: 35.000.000 milhões de quilometros",
                "Distância: 15.000.000 milhões de quilometros", "Distância: 6.000.000 milhões de quilometros \n", "Em órbita! \n"};
        typingMessages(distancies);
        System.out.println("Distância percorrida: 144.000.000 milhões de quilometros");
        System.out.println("Agora estamos há 6 milhões de quilometros do Sol\n");
    }

    public static void sunDescription() {
        timing();
        System.out.println("""               
                                    Este é o Sol!
                
                      Seu diâmetro é de 1.392.000 km
                      Sua temperatura é de 5.500 ºC
                      É uma estrela de categoria: Anã amarela
                      Ele é uma estrela considerada de meia-idade
                      Dentro dele, caberiam cerca de 1.3 milhões de planetas Terra
                
                      Reza uma lenda que o Sol tem uma irmã gêmea chamada 'Nêmesis'
                      que está em longa órbita e quando entra no Sistema Solar, causa
                      uma pertubação nas órbitas. Mas como dito, é apenas uma lenda.
                
                """);
    }

    public static void timing() {
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
