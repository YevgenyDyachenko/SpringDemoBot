package io.proj3ct.SpringDemoBot.service;

import io.proj3ct.SpringDemoBot.config.BotConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Slf4j
@Component
public class TelegramBot extends TelegramLongPollingBot {
    final BotConfig config;
    private String country = "";
    public TelegramBot(BotConfig config){ this.config = config;}
    @Override
    public void onUpdateReceived(Update update) {

        if(update.hasMessage() && update.getMessage().hasText()){
            String messageText = update.getMessage().getText();
            long chatId = update.getMessage().getChatId();

            if(messageText.matches("/capital ([A-Z])\\w+")){

                String[] arr = messageText.split(" ");
                messageText = arr[0];
                country = arr[1];


            }

            switch (messageText){
                case "/start": startCommandReceived(chatId, update.getMessage().getChat().getFirstName());
                break;
                case "/wether": wetherCommandReceived(chatId, update.getMessage().getChat().getFirstName());
                    break;
                case "/country": countryCommandReceived(chatId, update.getMessage().getChat().getFirstName());
                    break;
                case "/capital": capitalCommandReceived(chatId, update.getMessage().getChat().getFirstName()) ;
                    break;
                default: sendMessage(chatId, messageText.toUpperCase());
            }
        }

    }

    private void startCommandReceived(long chatId, String name){
        String answer = "Hi, " + name + ", nice to meet you";
        log.info("Replied to user " + name);
        sendMessage(chatId, answer);

    }
    private void wetherCommandReceived(long chatId, String name){
        String answer = name + ", it's rainy today";
        log.info("Replied to user " + name);
        sendMessage(chatId, answer);
    }

    private void countryCommandReceived(long chatId, String name){
        String answer = name + ", your country is " + new RandomCountry().getRandomCountry();
        log.info("Replied to user " + name);
        sendMessage(chatId, answer);
    }
    private void capitalCommandReceived(long chatId, String name){
        String answer = name + ", the capital of your country is " + new CountryCapital().getCapital(country) ;
        log.info("Replied to user " + name);
        sendMessage(chatId, answer);
    }

    private void sendMessage (long chatId, String textToSend){
        SendMessage message = new SendMessage();
        message.setChatId(String.valueOf(chatId));
        message.setText(textToSend);
        try{
            execute(message);
        } catch (TelegramApiException e){
            log.error("Error occured: " + e.getMessage());

        }
    }
    @Override
    public String getBotToken() {
        return config.getToken();
    }
    @Override
    public String getBotUsername() {
        return config.getBotName();
    }
}
