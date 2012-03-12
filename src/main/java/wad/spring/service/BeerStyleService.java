/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wad.spring.service;

import java.util.List;
import wad.spring.domain.BeerStyle;
import wad.spring.domain.BeerStyleForm;

/**
 *
 * @author tonykovanen
 */
public interface BeerStyleService {
    BeerStyle findBeerStyleById(Long id);
    List<BeerStyle> listBeerStyles();
    void saveOrUpdate(BeerStyleForm beerstyleform);
    void saveOrUpdate(BeerStyle beerStyle);
}
