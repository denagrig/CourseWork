package main.controller;

import main.entities.Warehouse2Entity;
import main.services.Warehouse2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/warehouse2")
public class Warehouse2Controller {
    private Warehouse2Service warehouse2Service;

    @Autowired
    public void setWarehouse2Service(Warehouse2Service warehouse2Service){
        this.warehouse2Service = warehouse2Service;
    }

    @GetMapping(value = "/")
    public ModelAndView welcomePage() {
        ModelAndView model = new ModelAndView();
        model.setViewName("Warehouse2Main");
        return model;
    }

    @GetMapping("/save")
    public ModelAndView addWarehouse2(@RequestParam("GoodId") Integer goodId,
                                      @RequestParam("GoodCount") Integer goodCount) throws ParseException {
        Warehouse2Entity warehouse2Entity = new Warehouse2Entity();
        warehouse2Entity.setGoodId(goodId);
        warehouse2Entity.setGoodCount(goodCount);
        warehouse2Service.save(warehouse2Entity);
        ModelAndView model = new ModelAndView();
        model.setViewName("Warehouse2Main");
        return model;
    }

    @GetMapping(value = "/get/id")
    public ModelAndView getAllGoodsFromWarehouse2ById(@RequestParam("id") Integer id) {
        ModelAndView model = new ModelAndView();
        List<Warehouse2Entity> list = warehouse2Service.getAllById(id);
        model.addObject("list", list);
        model.setViewName("Warehouse2Get");
        return model;
    }
    @GetMapping(value = "/get/name")
    public ModelAndView getAllGoodsFromWarehouse2ByName(@RequestParam("name") String name) {
        ModelAndView model = new ModelAndView();
        List<Warehouse2Entity> list = warehouse2Service.getAllByName(name);
        model.addObject("list", list);
        model.setViewName("Warehouse2Get");
        return model;
    }
    @GetMapping(value = "/get/all")
    public ModelAndView getAllGoodsFromWarehouse2ById() {
        ModelAndView model = new ModelAndView();
        List<Warehouse2Entity> list = warehouse2Service.getAll();
        model.addObject("list", list);
        model.setViewName("Warehouse2Get");
        return model;
    }

    @GetMapping(value = "/delete/id")
    public ModelAndView deleteFromWarehouse2ById(@RequestParam("id") Integer id) {
        warehouse2Service.delById(id);
        ModelAndView model = new ModelAndView();
        model.setViewName("Warehouse2Main");
        return model;
    }

    @GetMapping("/delete/all")
    public ModelAndView deleteAll() {
        warehouse2Service.deleteAll();
        ModelAndView model = new ModelAndView();
        model.setViewName("Warehouse2Main");
        return model;
    }
}