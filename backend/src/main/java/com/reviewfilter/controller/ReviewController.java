package com.reviewfilter.controller;

import com.reviewfilter.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/reviews")
@CrossOrigin(origins = "*")
public class ReviewController {

 @Autowired
 private ReviewService reviewService;

 @PostMapping("/check")
 public Map<String, Object> checkReview(@RequestBody Map<String, String> request) {

  String review = request.get("review");
  boolean isSpam = reviewService.isSpam(review);

  return Map.of("review", review, "spam", isSpam);
 }
}
