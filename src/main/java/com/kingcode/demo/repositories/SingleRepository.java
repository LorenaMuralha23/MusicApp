package com.kingcode.demo.repositories;

import com.kingcode.demo.entities.Single;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SingleRepository extends JpaRepository<Single, Integer> {

}
