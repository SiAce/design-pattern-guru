package com.siacespark.structural.proxy;

import com.siacespark.structural.proxy.downloader.YouTubeDownloader;
import com.siacespark.structural.proxy.external_library.ThirdPartyYouTubeClass;
import com.siacespark.structural.proxy.external_library.ThirdPartyYouTubeLib;
import com.siacespark.structural.proxy.proxy.YouTubeCacheProxy;

public class Demo {
    public static void main(String[] args) {
        ThirdPartyYouTubeLib naiveLib = new ThirdPartyYouTubeClass();
        YouTubeDownloader naiveDownloader = new YouTubeDownloader(naiveLib);
        YouTubeDownloader smartDownloader = new YouTubeDownloader(new YouTubeCacheProxy(naiveLib));

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");

    }

    private static long test(YouTubeDownloader downloader) {
        long startTime = System.currentTimeMillis();

        // User behavior in our app:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");
        // Users might visit the same page quite often.
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }
}
