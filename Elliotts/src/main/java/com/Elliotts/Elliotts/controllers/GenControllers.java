package com.Elliotts.Elliotts.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GenControllers {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String GetIndex() {

        return "index";
	}
	
	@RequestMapping(value="/history", method=RequestMethod.GET)
	public String getHistory() {

        return "history";
	}
	
	@RequestMapping(value="/locations", method=RequestMethod.GET)
	public String getLocations() {

        return "locations";
	}

    @RequestMapping(value = "/productInfo", method = RequestMethod.GET)
    public String getProductInfo() {
        return "productInfo";
    }

    @RequestMapping(value = "/customerInquiry", method = RequestMethod.GET)
    public String getCustomerInquiry() {
        return "customerInquiry";
    }
}
