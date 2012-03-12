/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wad.spring.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author tonykovanen
 */
@Entity
public class Beer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private String name;
    private double alcoholConcentration;
    @ManyToOne
    private BeerStyle beerStyle;
    private int priceInCents;
    private String ratebeer;

    public boolean equals(Beer beer) {
        if (this.id == beer.getId()) return true;
        return false;
    }
    
    public void setAlcoholConcentration(double alcoholConcentration) {
        this.alcoholConcentration = alcoholConcentration;
    }

    public void setBeerStyle(BeerStyle beerStyle) {
        this.beerStyle = beerStyle;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPriceInCents(int priceInCents) {
        this.priceInCents = priceInCents;
    }

    public double getAlcoholConcentration() {
        return alcoholConcentration;
    }

    public BeerStyle getBeerStyle() {
        return beerStyle;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPriceInCents() {
        return priceInCents;
    }
    public String getRatebeer() {
        return this.ratebeer;
    }
    public void setRatebeer(String ratebeer) {
        this.ratebeer = ratebeer;
    }
}
