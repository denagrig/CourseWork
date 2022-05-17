package main.services;

import main.entities.Warehouse2Entity;
import main.repositories.Warehouse2Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Warehouse2Service {
    private final Warehouse2Repository warehouse2Repository;

    public Warehouse2Service(Warehouse2Repository warehouse2Repository){
        this.warehouse2Repository = warehouse2Repository;
    }

    public Warehouse2Entity save(Warehouse2Entity warehouse2Entity){
        return warehouse2Repository.save(warehouse2Entity);
    }

    public List<Warehouse2Entity> getAll(){
        return warehouse2Repository.findAll();
    }

    public void delById(Integer id){
        warehouse2Repository.deleteById(id);
    }

    public void deleteAll(){warehouse2Repository.deleteAll();}

    public List<Warehouse2Entity> getAllById(Integer goodId){
        return warehouse2Repository.getAllByGoodId(goodId);
    }

    public List<Warehouse2Entity> getAllByName(String name){
        return warehouse2Repository.getAllByGoodsName(name);
    }

    public void update(Integer goodId){warehouse2Repository.warehouse2Update(goodId);}
}
