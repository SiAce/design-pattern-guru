package com.siacespark.structural.proxy.proxy;

import com.siacespark.structural.proxy.external_library.ThirdPartyYouTubeLib;
import com.siacespark.structural.proxy.external_library.Video;

import java.util.HashMap;
import java.util.Map;

public class YouTubeCacheProxy implements ThirdPartyYouTubeLib {
    private ThirdPartyYouTubeLib youtubeService;
    private Map<String, Video> cachePopular = new HashMap<String, Video>();
    private Map<String, Video> cacheAll = new HashMap<String, Video>();

    public YouTubeCacheProxy(ThirdPartyYouTubeLib youtubeService) {
        this.youtubeService = youtubeService;
    }

    @Override
    public Map<String, Video> popularVideos() {
        if (cachePopular.isEmpty()) {
            cachePopular = youtubeService.popularVideos();
        } else {
            System.out.println("Retrieved list from cache.");
        }
        return cachePopular;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);
        if (video == null) {
            video = youtubeService.getVideo(videoId);
            cacheAll.put(videoId, video);
        } else {
            System.out.println("Retrieved video '" + videoId + "' from cache.");
        }
        return video;
    }

    public void reset() {
        cachePopular.clear();
        cacheAll.clear();
    }
}
