package main.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "sales")
public class SalesEntity {
    @Id
    @Column(name = "id")
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "good_id", insertable = false, updatable = false)
    private GoodsEntity gId;

    @Column(name = "good_id")
    private Integer goodId;

    @Column(name = "good_count")
    private Integer goodCount;

    @Column(name = "create_date")
    private java.sql.Timestamp createDate;

    public SalesEntity(){ //пустой конструктор

    }

    public Integer getId() {
        return id;
    }

    public Integer getGoodId() {
        return goodId;
    }

    public SalesEntity setGoodId(Integer goodId) {
        this.goodId = goodId;
        return this;
    }

    public Integer getGoodCount() {
        return goodCount;
    }

    public SalesEntity setGoodCount(Integer goodCount) {
        this.goodCount = goodCount;
        return this;
    }

    public java.sql.Timestamp getCreateDate() {
        return createDate;
    }

    public SalesEntity setCreateDate(java.sql.Timestamp createDate) {
        this.createDate = createDate;
        return this;
    }

    @Override
    public String toString() {
        return "SalesEntity{" +
                "Id=" + id +
                ", GoodId='" + goodId + '\'' +
                ", GoodCount=" + goodCount + '\'' +
                ", CreateDate='" + createDate +
                '}';
    }
}


