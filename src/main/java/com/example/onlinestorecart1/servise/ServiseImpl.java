package com.example.onlinestorecart1.servise;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
@SessionScope
public class ServiseImpl implements Servise{
    public final List<Integer> items=new ArrayList<>();

    @Override
    public void add(List<Integer> id) {
        items.addAll(id);

    }

    @Override
    public Collection<Integer> get() {

        return items;
    }
}
