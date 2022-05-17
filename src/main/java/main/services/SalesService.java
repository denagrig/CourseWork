package main.services;

import main.entities.SalesEntity;
import main.repositories.SalesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesService {

    private final SalesRepository salesRepository;

    public SalesService(SalesRepository salesRepository){
        this.salesRepository = salesRepository;
    }

    public SalesEntity save(SalesEntity salesEntity){
       return salesRepository.save(salesEntity);
    }

    public List<SalesEntity> getAll(){
        return salesRepository.findAll();
    }

    public void delById(Integer id){
        salesRepository.deleteById(id);
    }

    public void deleteAll(){salesRepository.deleteAll();}

    public List<SalesEntity> getAllById(Integer goodId){
        return salesRepository.getAllByGoodId(goodId);
    }

    public List<SalesEntity> getAllByName(String name){
        return salesRepository.getAllByGoodsName(name);
    }
}
