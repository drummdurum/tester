package com.example.boghandel.repository;


import com.example.boghandel.model.Vare;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class VareBoghanelRepository {

    public List<Vare> getAll(){
        List<Vare> vareList = new ArrayList<>();
            vareList.add(new Vare(1,"pokemonGo","morbilSpil",0));

        return vareList;
    }
}
