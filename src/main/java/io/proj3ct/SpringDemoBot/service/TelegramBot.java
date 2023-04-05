package io.proj3ct.SpringDemoBot.service;

import io.proj3ct.SpringDemoBot.config.BotConfig;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
public class TelegramBot extends TelegramLongPollingBot {
    final BotConfig config;
    public TelegramBot(BotConfig config){ this.config = config;}
    @Override
    public void onUpdateReceived(Update update) {

    }
    @Override
    public String getBotToken() {
        return null;
    }
    @Override
    public String getBotUsername() {
        return null;
    }
}
