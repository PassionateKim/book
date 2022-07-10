package practice.ex.chapter7;

import java.util.Stack;

public class Chapter7_10 {
    public static void main(String[] args) {
        MyTv2 t = new MyTv2();
        t.setChannel(10);
        System.out.println("CH: " + t.getChannel());
        t.setChannel(20);
        System.out.println("CH: " + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH: " + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH: " + t.getChannel());
    }
}

class MyTv2 {
    private boolean isPowerOn;
    private int channel;
    private int previous_channel;
    private int volume;


    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public boolean getPowerOn() {
        return isPowerOn;
    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    public void setChannel(int channel) {
        previous_channel = this.channel;
        this.channel = channel;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void gotoPrevChannel() {
        setChannel(previous_channel);
    }
}
