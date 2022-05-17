package main.controller;

import main.entities.GoodsEntity;
import main.services.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/goods")
public class GoodsController {
    private GoodsService goodsService;

    @Autowired
    public void setGoodsService(GoodsService goodsService){
        this.goodsService = goodsService;
    }

    @GetMapping(value = "/")
    public ModelAndView welcomePage() {
        ModelAndView model = new ModelAndView();
        model.setViewName("GoodsMain");
        return model;
    }

    @GetMapping("/save")
    public ModelAndView addGoods(@RequestParam("GoodsName") String goodsName,
                                 @RequestParam("Priority") float priority) throws ParseException {
        GoodsEntity goodsEntity = new GoodsEntity();
        goodsEntity.setGoodsName(goodsName);
        goodsEntity.setPriority(priority);
        goodsService.save(goodsEntity);
        ModelAndView model = new ModelAndView();
        model.setViewName("GoodsMain");
        return model;
    }

    @GetMapping(value = "/get/name")
    public ModelAndView getGoodsByName(@RequestParam("name") String name) {
        ModelAndView model = new ModelAndView();
        List<GoodsEntity> list = goodsService.getByGoodsName(name);
        model.addObject("list", list);
        model.setViewName("GoodsGet");
        return model;
    }

    @GetMapping(value = "/get/all")
    public ModelAndView getAllGoods() {
        ModelAndView model = new ModelAndView();
        List<GoodsEntity> list = goodsService.getAll();
        model.addObject("list", list);
        model.setViewName("GoodsGet");
        return model;
    }

    @GetMapping(value = "/get/priority")
    public ModelAndView getAllGoodsByPriority() {
        ModelAndView model = new ModelAndView();
        List<GoodsEntity> list = goodsService.getAllByPriority();
        model.addObject("list", list);
        model.setViewName("GoodsGet");
        return model;
    }

    @GetMapping(value = "/delete/id")
    public ModelAndView deleteGoodsById(@RequestParam("id") Integer id) {
        goodsService.delById(id);
        ModelAndView model = new ModelAndView();
        model.setViewName("GoodsMain");
        return model;
    }

    @GetMapping("/delete/all")
    public ModelAndView deleteAll() {
        goodsService.deleteAll();
        ModelAndView model = new ModelAndView();
        model.setViewName("GoodsMain");
        return model;
    }
}

