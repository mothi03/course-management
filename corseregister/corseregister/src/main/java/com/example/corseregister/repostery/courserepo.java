package com.example.corseregister.repostery;

import com.example.corseregister.model.course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface courserepo  extends JpaRepository<course,String> {

}
