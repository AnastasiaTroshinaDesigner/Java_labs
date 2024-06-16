package Laba_2.Proxy;

import java.util.HashMap;

public class CacheProxyYouTubeApiClient implements ThirdPartyYouTubeLib {
    private ThirdPartyYouTubeApiClient youtubeService;
    private HashMap<String, String> cachePopular = new HashMap<>();
    private HashMap<String, String> cacheAll = new HashMap<>();

    public CacheProxyYouTubeApiClient() {
        this.youtubeService = new ThirdPartyYouTubeApiClient();
    }

    @Override
    public HashMap<String, String> popularVideos() {
        if (cachePopular.isEmpty()) {
            cachePopular = youtubeService.popularVideos();
        } else {
            System.out.println("Retrieved list from cache.");
        }
        return cachePopular;
    }

    @Override
    public String getVideo(String videoId) {
        String video = cacheAll.get(videoId);
        if (video == null) {
            video = youtubeService.getVideo(videoId);
            cacheAll.put(videoId, video);
        } else {
            System.out.println("Retrieved video '" + videoId + "' from cache.");
        }
        return video;
    }
}