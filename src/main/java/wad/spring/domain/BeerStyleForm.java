/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wad.spring.domain;

import javax.validation.constraints.Pattern;

/**
 *
 * @author tonykovanen
 */
public class BeerStyleForm {
    @Pattern(regexp="^[a-zA-Z0-9äöüÄÖÜ 'üøØ]*$", message = "The name can only consist of letters from a-z, numbers and some special characters with umlaut.")
    private String name;
    @Pattern(regexp = "^[<>]*$", message = "The description should not contain any of the following characters: < >")
    private String description;
    @Pattern(regexp = "^[a-zA-Z0-9äöüÄÖÜ 'üøØ]*$", message = "The origin can only consist of letters from a-z, numbers and some special characters with umlaut.")
    private String origin;

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setDescription(String desription) {
        this.description = desription;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
    
    
}
