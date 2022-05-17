package main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import main.entities.GoodsEntity;

import java.util.List;

@Repository
public interface GoodsRepository extends JpaRepository<GoodsEntity, Integer> {
    List<GoodsEntity> findAllByOrderByPriority();

    List<GoodsEntity> getAllByGoodsName(String name);
}
