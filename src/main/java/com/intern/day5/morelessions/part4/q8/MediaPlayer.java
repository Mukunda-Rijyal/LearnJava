package com.intern.day5.morelessions.part4.q8;

public class MediaPlayer implements Playable, Recordable {
    @Override
    public void play() {
        System.out.println("Playing media...");
    }

    @Override
    public void record() {
        System.out.println("Recording media...");
    }

    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.play();
        mediaPlayer.record();
    }

}
