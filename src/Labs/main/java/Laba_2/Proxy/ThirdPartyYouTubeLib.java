package Laba_2.Proxy;

import java.util.HashMap;

public interface ThirdPartyYouTubeLib {
    HashMap<String, String> popularVideos();
    String getVideo(String videoId);
}