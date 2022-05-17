package main.services;

import main.entities.GoodsEntity;
import main.repositories.GoodsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsService {
    private final GoodsRepository goodsRepository;

   public GoodsService(GoodsRepository goodsRepository){
       this.goodsRepository = goodsRepository;
   }

   public GoodsEntity save(GoodsEntity goodsEntity) {
       return goodsRepository.save(goodsEntity);
   }

   public List<GoodsEntity> getByGoodsName(String name){return goodsRepository.getAllByGoodsName(name);}

   public List<GoodsEntity> getAll(){
       return goodsRepository.findAll();
   }

   public void delById(Integer id){
        goodsRepository.deleteById(id);
   }
   public void deleteAll(){
       goodsRepository.deleteAll();
   }

   public List<GoodsEntity> getAllByPriority(){return goodsRepository.findAllByOrderByPriority();}
}
