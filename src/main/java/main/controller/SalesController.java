package main.controller;

import main.entities.GoodsEntity;
import main.entities.SalesEntity;
import main.services.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@RestController
@RequestMapping("/sales")
public class SalesController {
    private SalesService salesService;

    @Autowired
    public void setSalesService(SalesService salesService){
        this.salesService = salesService;
    }

    @GetMapping(value = "/")
    public ModelAndView welcomePage() {
        ModelAndView model = new ModelAndView();
        model.setViewName("SalesMain");
        return model;
    }

    @GetMapping("/save")
    public ModelAndView addSales(@RequestParam("goodId") Integer goodId,
                                 @RequestParam("goodCount") Integer goodCount,
                                 @RequestParam("createDate") String createDate) throws ParseException {
        createDate = createDate.replace('T', ' ');
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
        java.util.Date parsedDate = dateFormat.parse(createDate);
        java.sql.Timestamp timestampTime = new java.sql.Timestamp(parsedDate.getTime());
        SalesEntity salesEntity = new SalesEntity();
        salesEntity.setGoodId(goodId);
        salesEntity.setGoodCount(goodCount);
        salesEntity.setCreateDate(timestampTime);
        salesService.save(salesEntity);
        ModelAndView model = new ModelAndView();
        model.setViewName("SalesMain");
        return model;
    }

    @GetMapping(value = "/get/id")
    public ModelAndView getSalesByName(@RequestParam("id") Integer id) {
        ModelAndView model = new ModelAndView();
        List<SalesEntity> list = salesService.getAllById(id);
        model.addObject("list", list);
        model.setViewName("SalesGet");
        return model;
    }
    @GetMapping(value = "/get/name")
    public ModelAndView getSalesByName(@RequestParam("name") String name) {
        ModelAndView model = new ModelAndView();
        List<SalesEntity> list = salesService.getAllByName(name);
        model.addObject("list", list);
        model.setViewName("SalesGet");
        return model;
    }
    @GetMapping(value = "/get/all")
    public ModelAndView getAllSales() {
        ModelAndView model = new ModelAndView();
        List<SalesEntity> list = salesService.getAll();
        model.addObject("list", list);
        model.setViewName("SalesGet");
        return model;
    }

    @GetMapping(value = "/delete/id")
    public ModelAndView deleteGoodsById(@RequestParam("id") Integer id) {
        salesService.delById(id);
        ModelAndView model = new ModelAndView();
        model.setViewName("SalesMain");
        return model;
    }

    @GetMapping("/delete/all")
    public ModelAndView deleteAll() {
        salesService.deleteAll();
        ModelAndView model = new ModelAndView();
        model.setViewName("SalesMain");
        return model;
    }
}