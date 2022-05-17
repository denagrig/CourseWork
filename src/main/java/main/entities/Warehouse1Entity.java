package main.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "warehouse1")
public class Warehouse1Entity {
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


    public Warehouse1Entity(){

    }

    public Integer getId() {
        return id;
    }

    public Integer getGoodId() {
        return goodId;
    }

    public Warehouse1Entity setGoodId(Integer goodId) {
        this.goodId = goodId;
        return this;
    }

    public Integer getGoodCount() {
        return goodCount;
    }

    public Warehouse1Entity setGoodCount(Integer goodCount) {
        this.goodCount = goodCount;
        return this;
    }

    @Override
    public String toString() {
        return "Warehouse1Entity{" +
                "Id=" + id +
                ", GoodId='" + goodId + '\'' +
                ", GoodCount=" + goodCount +
                '}';
    }
}
