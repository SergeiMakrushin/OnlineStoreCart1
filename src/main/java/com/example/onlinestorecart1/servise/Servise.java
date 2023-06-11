package com.example.onlinestorecart1.servise;

import java.util.Collection;
import java.util.List;

public interface Servise {

    void add(List<Integer> id);

    Collection<Integer> get();
}
