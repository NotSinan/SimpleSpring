package com.github.notsinan.demo.models;

import java.time.LocalDateTime;

public record LiveStream(String id, String title, String description, String url, LocalDateTime startDate, LocalDateTime endDate) {


}
