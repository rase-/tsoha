/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wad.spring.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wad.spring.domain.Beer;
import wad.spring.repository.BeerRepository;

/**
 *
 * @author tonykovanen
 */
@Service
public class BeerServiceImpl implements BeerService {
    @Autowired
    BeerRepository beerRepo;

    @Override
    public Beer findBeerById(Long id) {
        return beerRepo.findOne(id);
    }

    @Override
    public List<Beer> list() {
        return beerRepo.findAll();
    }
    
}
