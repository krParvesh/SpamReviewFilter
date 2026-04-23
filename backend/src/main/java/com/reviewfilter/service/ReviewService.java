package com.reviewfilter.service;

import org.springframework.stereotype.Service;

@Service
public class ReviewService {
 private boolean isSpam(String review) {
                String[] spamKeywords = {
                                "buy now", "free", "click here", "subscribe", "visit link", "earn money",
                                "limited time", "act now", "don't miss", "guaranteed", "risk free", "cheap",
                                "discount", "100% satisfied", "no obligation", "click below", "open immediately",
                                "order now", "special offer", "best price", "work from home", "investment opportunity",
                                "urgent", "winner", "claim now", "make money", "earn cash", "instant access",
                                "exclusive deal", "limited offer", "act fast", "bonus", "gift card", "deal",
                                "lowest price", "money back", "free trial", "secure payment", "apply now",
                                "once in a lifetime", "congratulations", "double your", "private offer",
                                "tax free", "send money", "be your own boss"
                };

                String lower = review.toLowerCase();
                for (String keyword : spamKeywords) {
                        if (lower.contains(keyword)) {
                                return true;
                        }
                }
                return false;
    }
