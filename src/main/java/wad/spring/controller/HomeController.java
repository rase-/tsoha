/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wad.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author tonykovanen
 */
@Controller
public class HomeController {
    @RequestMapping("*")
    public String redirectHome() {
        return "home";
    }
}
