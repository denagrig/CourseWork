package main.repositories;

import main.entities.Warehouse2Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface Warehouse2Repository extends JpaRepository<Warehouse2Entity,Integer> {
    List<Warehouse2Entity> getAllByGoodId(Integer goodId);

    @Query(
            value = "SELECT * FROM postgres.public.warehouse2 w2 " +
                    "JOIN  postgres.public.goods g "+
                    "ON g.name = ?1 AND w2.good_id = g.id" , nativeQuery = true)
    List<Warehouse2Entity> getAllByGoodsName(String goodsName);

    @Modifying
    @Transactional
    @Query(
            value = "UPDATE postgres.public.sales s " +
                    "SET  good_count = s.good_count - w2.good_count "+
                    "FROM postgres.public.warehouse2 w2  "+
                    "WHERE w2.good_id = ?1 AND w2.good_id = s.good_id" , nativeQuery = true)
    void warehouse2Update(Integer goodId);
}
