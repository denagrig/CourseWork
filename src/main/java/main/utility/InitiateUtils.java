package main.utility;

import main.entities.GoodsEntity;
import main.entities.SalesEntity;
import main.entities.Warehouse1Entity;
import main.entities.Warehouse2Entity;
import main.services.GoodsService;
import main.services.SalesService;
import main.services.Warehouse1Service;
import main.services.Warehouse2Service;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class InitiateUtils implements CommandLineRunner {

    private final GoodsService goodsService;
    private final Warehouse1Service warehouse1Service;
    private final Warehouse2Service warehouse2Service;
    private final SalesService salesService;
    public InitiateUtils(GoodsService goodsService, Warehouse1Service warehouse1Service, Warehouse2Service warehouse2Service, SalesService salesService) {//незабываем конструктор для внедрения
        this.goodsService = goodsService;
        this.warehouse1Service = warehouse1Service;
        this.warehouse2Service = warehouse2Service;
        this.salesService = salesService;
    }

    @Override
    public void run(String... args) throws Exception {
    }
}