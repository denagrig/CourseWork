package main.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "goods")
public class GoodsEntity {
    @Id
    @Column(name = "id")
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    private Integer id;

    @OneToOne(mappedBy = "gId", cascade = CascadeType.REMOVE)
    private Warehouse1Entity warehouse1Entity;

    @OneToOne(mappedBy = "gId", cascade = CascadeType.REMOVE)
    private Warehouse2Entity warehouse2Entity;

    @OneToMany(mappedBy = "gId", cascade = CascadeType.REMOVE)
    private List<SalesEntity> salesEntity;

    @Column(name = "name")
    private String goodsName;

    @Column(name = "priority")
    private float priority;

    public GoodsEntity(){ //пустой конструктор

    }

    public Integer getId() {
        return id;
    }

    //геттеры, сеттеры
    public String getGoodsName() {
        return goodsName;
    }

    public GoodsEntity setGoodsName(String goodsName) {
        this.goodsName = goodsName;
        return this;
    }

    public float getPriority() {
        return priority;
    }

    public GoodsEntity setPriority(float priority) {
        this.priority = priority;
        return this;
    }

    @Override
    public String toString() {
        return "GoodsEntity{" +
                "Id=" + id +
                ", GoodsName='" + goodsName + '\'' +
                ", Priority=" + priority +
                '}';
    }
}

