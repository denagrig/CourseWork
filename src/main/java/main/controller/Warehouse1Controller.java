package main.controller;

import main.entities.Warehouse1Entity;
import main.services.Warehouse1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/warehouse1")
public class Warehouse1Controller {
    private Warehouse1Service warehouse1Service;

    @Autowired
    public void setWarehouse1Service(Warehouse1Service warehouse1Service){
        this.warehouse1Service = warehouse1Service;
    }

    @GetMapping(value = "/")
    public ModelAndView welcomePage() {
        ModelAndView model = new ModelAndView();
        model.setViewName("Warehouse1Main");
        return model;
    }

    @GetMapping("/save")
    public ModelAndView addWarehouse1(@RequestParam("GoodId") Integer goodId,
                                      @RequestParam("GoodCount") Integer goodCount) throws ParseException {
        Warehouse1Entity warehouse1Entity = new Warehouse1Entity();
        warehouse1Entity.setGoodId(goodId);
        warehouse1Entity.setGoodCount(goodCount);
        warehouse1Service.save(warehouse1Entity);
        ModelAndView model = new ModelAndView();
        model.setViewName("Warehouse1Main");
        return model;
    }

    @GetMapping(value = "/get/id")
    public ModelAndView getAllGoodsFromWarehouse1ByID(@RequestParam("id") Integer id) {
        ModelAndView model = new ModelAndView();
        List<Warehouse1Entity> list = warehouse1Service.getAllById(id);
        model.addObject("list", list);
        model.setViewName("Warehouse1Get");
        return model;
    }
    @GetMapping(value = "/get/name")
    public ModelAndView getAllGoodsFromWarehouse1ByName(@RequestParam("name") String name) {
        ModelAndView model = new ModelAndView();
        List<Warehouse1Entity> list = warehouse1Service.getAllByName(name);
        model.addObject("list", list);
        model.setViewName("Warehouse1Get");
        return model;
    }
    @GetMapping(value = "/get/all")
    public ModelAndView getAllGoodsFromWarehouse1ById() {
        ModelAndView model = new ModelAndView();
        List<Warehouse1Entity> list = warehouse1Service.getAll();
        model.addObject("list", list);
        model.setViewName("Warehouse1Get");
        return model;
    }

    @GetMapping(value = "/delete/id")
    public ModelAndView deleteFromWarehouse1ById(@RequestParam("id") Integer id) {
        warehouse1Service.delById(id);
        ModelAndView model = new ModelAndView();
        model.setViewName("Warehouse1Main");
        return model;
    }

    @GetMapping("/delete/all")
    public ModelAndView deleteAll() {
        warehouse1Service.deleteAll();
        ModelAndView model = new ModelAndView();
        model.setViewName("Warehouse1Main");
        return model;
    }
}