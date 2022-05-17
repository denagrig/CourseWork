package main.repositories;

import main.entities.Warehouse1Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface Warehouse1Repository extends JpaRepository<Warehouse1Entity, Integer> {
  List<Warehouse1Entity> getAllByGoodId(Integer goodId);

  @Query(
          value = "SELECT * FROM postgres.public.warehouse1 w1 " +
                  "JOIN  postgres.public.goods g "+
                  "ON g.name = ?1 AND w1.good_id = g.id" , nativeQuery = true)
  List<Warehouse1Entity> getAllByGoodsName(String goodsName);

  @Modifying
  @Transactional
  @Query(
          value = "UPDATE postgres.public.sales s " +
                  "SET  good_count = s.good_count - w1.good_count "+
                  "FROM postgres.public.warehouse1 w1  "+
                  "WHERE w1.good_id = ?1 AND w1.good_id = s.good_id" , nativeQuery = true)
  void warehouse1Update(Integer goodId);
}
