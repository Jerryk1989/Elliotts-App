package com.Elliotts.Elliotts.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//Generic controller that return the webpages that don't have database interactions.
@Controller
public class GenControllers {

    //This returns the index/home page
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String GetIndex() {
        return "index";
	}

    //This returns the history page
	@RequestMapping(value="/history", method=RequestMethod.GET)
	public String getHistory() {

        return "history";
	}

    //this returns the locations page
	@RequestMapping(value="/locations", method=RequestMethod.GET)
	public String getLocations() {

        return "locations";
	}

    //TODO Delete this.  This page should be hitting the Rest Controller.
    @RequestMapping(value = "/productInfo", method = RequestMethod.GET)
    public String getProductInfo() {
        return "productInfo";
    }

    //TODO Delete this.  This page should be hitting the Rest Controller.
    @RequestMapping(value = "/customerInquiry", method = RequestMethod.GET)
    public String getCustomerInquiry() {
        return "customerInquiry";
    }

    //TODO Delete this.  This page is only used for testing purposes and doesn't need to go live.
    @RequestMapping(value= "/testProduct", method = RequestMethod.GET)
    public String getTestingProductPage() {
        return "testProduct";
    }
}
