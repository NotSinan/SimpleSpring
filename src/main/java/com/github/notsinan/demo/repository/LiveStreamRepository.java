package com.github.notsinan.demo.repository;

import com.github.notsinan.demo.models.LiveStream;

import java.util.ArrayList;
import java.util.List;

public class LiveStreamRepository {

    List<LiveStream> streams = new ArrayList<>();

    public List<LiveStream> findAll() {
        return streams;
    }

    public LiveStream create(LiveStream liveStream) {
        streams.add(liveStream);
        return liveStream;
    }
}
