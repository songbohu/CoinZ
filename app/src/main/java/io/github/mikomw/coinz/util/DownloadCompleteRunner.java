package io.github.mikomw.coinz.util;

public class DownloadCompleteRunner {

    static String result = "";

    public static void downloadComplete(String result) {
        DownloadCompleteRunner.result = result;
    }

}