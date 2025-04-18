package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.OutilRepository;
import com.example.demo.entities.Outil;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class OutilService implements IOutilService {
	@Autowired
    OutilRepository outilRepository;

    public Outil addOutil(Outil outil) {
        outilRepository.save(outil);
        return outil;
    }

    public void deleteOutil(Long id) {
        outilRepository.deleteById(id);
    }

    public Outil updateOutil(Outil outil) {
        return outilRepository.saveAndFlush(outil);
    }

    public Outil findOutil(Long id) {
        Outil outil = outilRepository.findById(id).get();

        return outil;
    }

    public List<Outil> findAll() {
        return outilRepository.findAll();
    }

    public List<Outil> findBySourceStartingWith(String source) {
        return outilRepository.findBySourceStartingWith(source);
    }

    public Outil findBySource(String source) {
        return outilRepository.findBySource(source);
    }
}