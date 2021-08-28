package com.siacespark.behavioral.iterator.social_networks;

import com.siacespark.behavioral.iterator.iterators.ProfileIterator;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);
    ProfileIterator createCoworkersIterator(String profileEmail);
}
