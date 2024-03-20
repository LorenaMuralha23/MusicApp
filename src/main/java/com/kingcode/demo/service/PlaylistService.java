package com.kingcode.demo.service;

import com.kingcode.demo.entities.Playlist;
import com.kingcode.demo.repositories.PlaylistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlaylistService {

    @Autowired
    private PlaylistRepository repository;

    public List<Playlist> findAll(){
        return repository.findAll();
    }

    public Playlist findById(int id){
        Optional<Playlist> findedPlaylist = repository.findById(id);
        return findedPlaylist.orElseThrow(() -> new RuntimeException());
    }

    public Playlist insert(Playlist newPlaylist){
        return repository.save(newPlaylist);
    }

    public void delete(int id){
        repository.deleteById(id);
    }

    public Playlist update(int id, Playlist playlistInfo){
        Playlist entity = repository.getReferenceById(id);
        updateData(entity, playlistInfo);
        return repository.save(entity);
    }

    public void updateData(Playlist playlistReferenced, Playlist playlistInfo){
        playlistReferenced.setTitle(playlistInfo.getTitle());
        playlistReferenced.setImage(playlistInfo.getImage());
    }


}
