package com.siacespark.structural.proxy.external_library;

import java.util.HashMap;
import java.util.Map;

public interface ThirdPartyYouTubeLib {
    Map<String, Video> popularVideos();
    Video getVideo(String videoId);
}
