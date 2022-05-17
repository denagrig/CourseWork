package main.repositories;

import main.entities.SalesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SalesRepository extends JpaRepository<SalesEntity, Integer> {
    List<SalesEntity> getAllByGoodId(Integer goodId);

    @Query(
            value = "SELECT * FROM postgres.public.sales s " +
                    "JOIN  postgres.public.goods g "+
                    "ON g.name = ?1 AND s.good_id = g.id" , nativeQuery = true)
    List<SalesEntity> getAllByGoodsName(String goodsName);
}
