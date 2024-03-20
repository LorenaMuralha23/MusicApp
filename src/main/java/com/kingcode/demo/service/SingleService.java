package com.kingcode.demo.service;

import com.kingcode.demo.entities.Single;
import com.kingcode.demo.repositories.SingleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SingleService {
    @Autowired
    private SingleRepository repository;

    public List<Single> findAll(){
        return repository.findAll();
    }

    public Single findById(int id){
        Optional<Single> findedSingle = repository.findById(id);
        return findedSingle.orElseThrow(() -> new RuntimeException());
    }

    public Single insert(Single newSingle){
        return repository.save(newSingle);
    }

    public void delete(int id){
        repository.deleteById(id);
    }

    public Single update(int id, Single singleInfo){
        Single entity = repository.getReferenceById(id);
        updateData(entity, singleInfo);
        return repository.save(entity);
    }

    public void updateData(Single singleReferenced, Single singleInfo){
        singleReferenced.setTitle(singleInfo.getTitle());
        singleReferenced.setImage(singleInfo.getImage());
    }


}
