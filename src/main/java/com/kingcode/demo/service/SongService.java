package com.kingcode.demo.service;

import com.kingcode.demo.entities.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kingcode.demo.repositories.SongRepository;

import java.util.List;
import java.util.Optional;

@Service
public class SongService {

    @Autowired
    private SongRepository repository;

    public List<Song> findAll(){
        return repository.findAll();
    }

    public Song findById(int id){
        Optional<Song> findedSong = repository.findById(id);
        return findedSong.orElseThrow(() -> new RuntimeException());
    }

    public Song insert(Song newSong){
        return repository.save(newSong);
    }

    public void delete(int id){
        repository.deleteById(id);
    }

    public Song update(int id, Song songInfo){
        Song entity = repository.getReferenceById(id);
        updateData(entity, songInfo);
        return repository.save(entity);
    }

    public void updateData(Song songReferenced, Song songInfo){
        songReferenced.setTitle(songInfo.getTitle());
        songReferenced.setSongPath(songInfo.getSongPath());
    }

}
