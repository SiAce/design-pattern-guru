package com.siacespark.behavioral.iterator.iterators;

import com.siacespark.behavioral.iterator.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
