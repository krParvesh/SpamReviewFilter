package com.reviewfilter.service;

import org.springframework.stereotype.Service;

@Service
public class ReviewService {

 public boolean isSpam(String review) {

  if (review == null || review.trim().isEmpty()) return true;

  String lower = review.toLowerCase();

  return lower.contains("buy now") ||
         lower.contains("free") ||
         lower.contains("click here") ||
         lower.contains("subscribe") ||
         lower.contains("visit link") ||
         lower.contains("earn money");
 }
}
