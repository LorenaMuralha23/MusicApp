package com.kingcode.demo.service;

import com.kingcode.demo.entities.ArtistUser;
import com.kingcode.demo.repositories.ArtistUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArtistUserService {

    @Autowired
    private ArtistUserRepository repository;

    public List<ArtistUser> findAll(){
        return repository.findAll();
    }

    public ArtistUser findById(int id){
        Optional<ArtistUser> findedArtist = repository.findById(id);
        return findedArtist.orElseThrow(() -> new RuntimeException());
    }

    public ArtistUser insert(ArtistUser newArtist){
        return repository.save(newArtist);
    }

    public void delete(int id){
        repository.deleteById(id);
    }

    public ArtistUser update(int id, ArtistUser userInfo){
        ArtistUser entity = repository.getReferenceById(id);
        updateData(entity, userInfo);
        return repository.save(entity);
    }

    public void updateData(ArtistUser userReferenced, ArtistUser userInfo){
        userReferenced.setName(userInfo.getName());
        userReferenced.setEmail(userInfo.getEmail());
        userReferenced.setPassword(userInfo.getPassword());
    }


}
