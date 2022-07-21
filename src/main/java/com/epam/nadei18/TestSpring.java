package com.epam.nadei18;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String... args) {
        try (ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml")) {

            Music music = appContext.getBean("musicBean", Music.class);

            MusicPlayer player = appContext.getBean("musicPlayer", MusicPlayer.class);
            player.playMusic();

            System.out.println(player.getName());
            System.out.println(player.getVolume());
        }

    }
}
