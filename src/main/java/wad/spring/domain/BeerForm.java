/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wad.spring.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 *
 * @author tonykovanen
 */
public class BeerForm {
    @Pattern(regexp="^[a-zA-Z0-9äöüÄÖÜ 'üøØ]*$", message = "The name can only consist of letters from a-z, numbers and some special characters with umlaut.")
    private String name;
    @NotNull(message = "Should not be left empty")
    private double alcoholConcentration;
    @NotNull(message = "Should not be left unchosen")
    private BeerStyle beerStyle;
    @NotNull(message = "Shouöd not be left empty")
    private int priceInCents;
    @Pattern(regexp = "http://www.ratebeer.com/[a-z0-9-/_]", message = "Should be a valid ratebeer URI")
    private String ratebeer;

    public double getAlcoholConcentration() {
        return alcoholConcentration;
    }

    public BeerStyle getBeerStyle() {
        return beerStyle;
    }

    public String getName() {
        return name;
    }

    public int getPriceInCents() {
        return priceInCents;
    }

    public String getRatebeer() {
        return ratebeer;
    }

    public void setAlcoholConcentration(double alcoholConcentration) {
        this.alcoholConcentration = alcoholConcentration;
    }

    public void setBeerStyle(BeerStyle beerStyle) {
        this.beerStyle = beerStyle;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPriceInCents(int priceInCents) {
        this.priceInCents = priceInCents;
    }

    public void setRatebeer(String ratebeer) {
        this.ratebeer = ratebeer;
    }
    
    
}
