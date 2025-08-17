package com.example.corseregister.repostery;

import com.example.corseregister.model.courseRegistery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface registeryrepo extends JpaRepository<courseRegistery,Integer> {

}
