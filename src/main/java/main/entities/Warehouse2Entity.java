package main.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "warehouse2")
public class Warehouse2Entity {
    @Id
    @Column(name = "id")
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    private Integer id;

    @OneToOne
    @JoinColumn(name = "good_id", insertable = false, updatable = false)
    private GoodsEntity gId;

    @Column(name = "good_id")
    private Integer goodId;

    @Column(name = "good_count")
    private Integer goodCount;


    public Warehouse2Entity(){

    }

    public Integer getId() {
        return id;
    }

    public Integer getGoodId() {
        return goodId;
    }

    public Warehouse2Entity setGoodId(Integer goodId) {
        this.goodId = goodId;
        return this;
    }

    public Integer getGoodCount() {
        return goodCount;
    }

    public Warehouse2Entity setGoodCount(Integer goodCount) {
        this.goodCount = goodCount;
        return this;
    }

    @Override
    public String toString() {
        return "Warehouse2Entity{" +
                "Id=" + id +
                ", GoodId='" + goodId + '\'' +
                ", GoodCount=" + goodCount +
                '}';
    }
}