/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wad.spring.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wad.spring.domain.Beer;
import wad.spring.domain.BeerStyle;
import wad.spring.domain.BeerStyleForm;
import wad.spring.repository.BeerStyleRepository;

/**
 *
 * @author tonykovanen
 */
@Service
public class BeerStyleServiceImpl implements BeerStyleService {
    @Autowired
    BeerStyleRepository beerStyleRepo;
    
    @Override
    public BeerStyle findBeerStyleById(Long id) {
        return beerStyleRepo.findOne(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<BeerStyle> listBeerStyles() {
        return beerStyleRepo.findAll();
    }

    @Override
    public void saveOrUpdate(BeerStyleForm beerstyleform) {
        BeerStyle style = new BeerStyle();
        style.setBeers(new ArrayList<Beer>());
        style.setDescription(beerstyleform.getDescription());
        style.setName(beerstyleform.getName());
        style.setOrigin(beerstyleform.getOrigin());
        beerStyleRepo.save(style);
    }

    @Override
    public void saveOrUpdate(BeerStyle beerStyle) {
        beerStyleRepo.save(beerStyle);
    }
    
}
