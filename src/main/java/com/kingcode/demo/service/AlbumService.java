package com.kingcode.demo.service;

import com.kingcode.demo.entities.Album;
import com.kingcode.demo.repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlbumService {
    @Autowired
    private AlbumRepository repository;

    public List<Album> findAll(){
        return repository.findAll();
    }

    public Album findById(int id){
        Optional<Album> findedAlbum = repository.findById(id);
        return findedAlbum.orElseThrow(() -> new RuntimeException());
    }

    public Album insert(Album newAlbum){
        return repository.save(newAlbum);
    }

    public void delete(int id){
        repository.deleteById(id);
    }

    public Album update(int id, Album albumInfo){
        Album entity = repository.getReferenceById(id);
        updateData(entity, albumInfo);
        return repository.save(entity);
    }

    public void updateData(Album albumReferenced, Album albumInfo){
        albumReferenced.setTitle(albumInfo.getTitle());
        albumReferenced.setImage(albumInfo.getImage());
    }
}
