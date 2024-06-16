package Laba_2.Proxy;

import java.util.HashMap;

public class YouTubeVideoDownloader {
    private ThirdPartyYouTubeLib api;

    public YouTubeVideoDownloader(ThirdPartyYouTubeLib api) {
        this.api = api;
    }

    public void renderPopularVideos() {
        HashMap<String, String> list = api.popularVideos();
        System.out.println("Most popular videos on YouTube (imagine fancy HTML)");
        for (HashMap.Entry<String, String> video : list.entrySet()) {
            System.out.println("ID: " + video.getKey() + " / Title: " + video.getValue());
        }
    }

    public void renderVideoPage(String videoId) {
        String video = api.getVideo(videoId);
        System.out.println("Video page (imagine fancy HTML)");
        System.out.println("ID: " + videoId);
        System.out.println("Title: Some video title");
        System.out.println("Video: " + video);
    }
}