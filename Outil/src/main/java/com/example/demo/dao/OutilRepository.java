package com.example.demo.dao;

import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entities.Outil;

public interface OutilRepository extends JpaRepository<Outil, Long> {
  


    // Find an Outil by its source
    Outil findBySource(String source);
   
	public List<Outil> findBySourceStartingWith(String source);
    
    


}
