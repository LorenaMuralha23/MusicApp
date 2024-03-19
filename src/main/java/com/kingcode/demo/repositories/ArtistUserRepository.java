package com.kingcode.demo.repositories;

import com.kingcode.demo.entities.ArtistUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistUserRepository extends JpaRepository<ArtistUser, Integer> {

}
