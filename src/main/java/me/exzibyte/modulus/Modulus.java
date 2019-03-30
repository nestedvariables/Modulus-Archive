package me.exzibyte.modulus;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.OnlineStatus;
import net.dv8tion.jda.core.entities.Game;
import net.dv8tion.jda.core.exceptions.RateLimitedException;

public class Modulus {

    public static void main(String[] args) throws LoginException, InterruptedException, RateLimitedException {
        Data data = new Data();
        final JDABuilder builder = new JDABuilder(AccountType.BOT).setToken(data.TOKEN);

        builder.setStatus(OnlineStatus.ONLINE);
        builder.setGame(Game.playing("with modular bits!"));

        builder.build();
    }

}