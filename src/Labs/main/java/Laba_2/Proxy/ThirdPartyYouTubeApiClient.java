package Laba_2.Proxy;

import java.util.HashMap;

public class ThirdPartyYouTubeApiClient implements ThirdPartyYouTubeLib {
    @Override
    public HashMap<String, String> popularVideos() {
        connectToServer("http://www.youtube.com");
        return fetchPopularVideos();
    }

    @Override
    public String getVideo(String videoId) {
        connectToServer("http://www.youtube.com/" + videoId);
        return downloadVideo(videoId);
    }

    private void connectToServer(String server) {
        System.out.println("Connecting to " + server + "... Connected!");
    }

    private HashMap<String, String> fetchPopularVideos() {
        System.out.println("Downloading populars... Done!");
        HashMap<String, String> videos = new HashMap<>();
        videos.put("sadgahasgdas", "Catzzzz.avi");
        videos.put("asdfas3ffasd", "Dancing video.mpq");
        videos.put("3sdfgsd1j333", "Programing lesson#1.avi");
        videos.put("mkafksangasj", "Dog play with ball.mp4");
        videos.put("dlsdk5jfslaf", "Barcelona vs RealM.mov");
        return videos;
    }

    private String downloadVideo(String videoId) {
        System.out.println("Downloading video... Done!");
        return "Video content for " + videoId;
    }
}