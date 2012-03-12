/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wad.spring.service;

import java.util.List;
import wad.spring.domain.Beer;

/**
 *
 * @author tonykovanen
 */
public interface BeerService {
    Beer findBeerById(Long id);
    List<Beer> list();
}
