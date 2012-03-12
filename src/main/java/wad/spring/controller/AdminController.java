/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wad.spring.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import wad.spring.domain.BeerForm;
import wad.spring.domain.BeerStyleForm;
import wad.spring.service.BeerService;
import wad.spring.service.BeerStyleService;

/**
 *
 * @author tonykovanen
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    BeerService beerService;
    
    @Autowired
    BeerStyleService beerStyleService;
    
    @RequestMapping("*")
    public String redirectHome() {
        return "home";
    }
    
    @RequestMapping(value = "/beerstyles", method = RequestMethod.GET)
    public String showBeerstyles(Model model) {
        model.addAttribute("beerstyleform", new BeerStyleForm());
        model.addAttribute("beerstyles", beerStyleService.listBeerStyles());
        return "beerstyles";
    }
    
    @RequestMapping(value = "/beerstyles", method = RequestMethod.POST)
    public String addBeerstyle(@Valid @ModelAttribute BeerStyleForm beerstyleform, BindingResult result) {
        if (result.hasErrors()) {
            return "beerstyles";
        }
        beerStyleService.saveOrUpdate(beerstyleform);
        return "redirect:/admin/beerstyles";
    }
    
    @RequestMapping(value = "/beerstyles/{beerStyleId}", method = RequestMethod.GET)
    public String showBeerstyle(@PathVariable Long beerStyleId, Model model) {
        model.addAttribute("beerstyle", beerStyleService.findBeerStyleById(beerStyleId));
        model.addAttribute("beerstyleform", new BeerStyleForm());
        return "beerstyle";
    }
    
    @RequestMapping(value = "/beerstyles/{beerStyleId}", method = RequestMethod.POST)
    public String updateBeerstyle(@Valid @ModelAttribute BeerStyleForm beerstyleform, BindingResult result, @PathVariable Long beerStyleId) {
        if (result.hasErrors()) {
            return "beerstyle";
        }
        beerStyleService.saveOrUpdate(beerstyleform);
        return "redirect:/admin/beerstyles/" + beerStyleId;
    }
    
    @RequestMapping(value = "/beers", method = RequestMethod.GET)
    public String showBeers(Model model) {
        model.addAttribute("beerform", new BeerForm());
        model.addAttribute("beers", beerService.list());
        return "beers";
    }
    
    @RequestMapping(value = "/beers", method = RequestMethod.POST)
    public String addBeer(@Valid @ModelAttribute BeerForm beerform, BindingResult result) {
        if (result.hasErrors()) {
            return "beers";
        }
        // tähän kutsu logiikkaan
        return "redirect:/admin/beers";
    }
}
