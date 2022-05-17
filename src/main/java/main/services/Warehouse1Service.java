package main.services;

import main.entities.Warehouse1Entity;
import main.repositories.Warehouse1Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Warehouse1Service {
    private final Warehouse1Repository warehouse1Repository;

    public Warehouse1Service(Warehouse1Repository warehouse1Repository){
       this.warehouse1Repository = warehouse1Repository;
    }

    public Warehouse1Entity save(Warehouse1Entity warehouse1Entity){
       return  warehouse1Repository.save(warehouse1Entity);
    }

    public List<Warehouse1Entity> getAll(){
        return warehouse1Repository.findAll();
    }

    public void delById(Integer id){
        warehouse1Repository.deleteById(id);
    }

    public void deleteAll(){warehouse1Repository.deleteAll();}

    public List<Warehouse1Entity> getAllById(Integer goodId){
        return warehouse1Repository.getAllByGoodId(goodId);
    }

    public List<Warehouse1Entity> getAllByName(String name){
        return warehouse1Repository.getAllByGoodsName(name);
    }

    public void update(Integer goodId){warehouse1Repository.warehouse1Update(goodId);}
}
