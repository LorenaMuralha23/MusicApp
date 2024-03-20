package com.kingcode.demo.service;

import com.kingcode.demo.entities.ListenerUser;
import com.kingcode.demo.repositories.ListenerUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
@Service
public class ListenerUserService {

    @Autowired
    private ListenerUserRepository repository;

    public List<ListenerUser> findAll(){
        return repository.findAll();
    }

    public ListenerUser findById(int id){
        Optional<ListenerUser> findedListener = repository.findById(id);
        return findedListener.orElseThrow(() -> new RuntimeException());
    }

    public ListenerUser insert(ListenerUser newListener){
        return repository.save(newListener);
    }

    public void delete(int id){
        repository.deleteById(id);
    }

    public ListenerUser update(int id, ListenerUser userInfo){
        ListenerUser entity = repository.getReferenceById(id);
        updateData(entity, userInfo);
        return repository.save(entity);
    }

    public void updateData(ListenerUser userReferenced, ListenerUser userInfo){
        userReferenced.setName(userInfo.getName());
        userReferenced.setEmail(userInfo.getEmail());
        userReferenced.setPassword(userInfo.getPassword());
    }

}
