package com.umaraliev.patterns.behavioralPatterns.strategy;

public class DownloadWindownsStrategy implements Strategy {
    @Override
    public void download(String file) {
        System.out.println("windows download: " + file);
    }

}
