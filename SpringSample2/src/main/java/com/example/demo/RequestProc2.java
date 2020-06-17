package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controller class for screen display and object passing
 */
@Controller
public class RequestProc2 {

	/**
	 * Function to display the screen initially
	 * @return "index" Return index.html
	 */
	@RequestMapping(value="/")
	public String index() {

		return "index2";
	}

	/**
	 * Function to pass the received object to ModelAndView
	 * @param param The object containing the string
	 * @return mav ModelAndView containing the string
	 */
	@RequestMapping(value="/callResponse")
	public ModelAndView response(@ModelAttribute ParamObject param) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("index2");
		// Store the string in ModelAndView
		mav.addObject("response", param);

		return mav;
	}

	/**
	 * An inner class for objects holding a string.
	 */
	public static class ParamObject {

		// member
		private String name;
		private String tweet;

		// Name Getter/Setter
		public String getName() { return name; }
		public void setName(String name) { this.name = name; }

		// Tweet Getter/Setter
		public String getTweet() { return tweet; }
		public void setTweet(String tweet) { this.tweet = tweet; }
	}
}


