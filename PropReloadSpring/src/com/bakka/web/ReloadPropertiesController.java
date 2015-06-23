/**
 * 
 */
package com.bakka.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bakka.CommandObject.ReloadPropVO;
import com.bakka.CommandObject.ReloadPropVO;

/**
 * @author sbakka
 *
 */

@Controller
public class ReloadPropertiesController {

	private static Map<String, String> propMap = new HashMap<String, String>();
	static {
		propMap.put("name", "John");
		propMap.put("lastname", "Lennon");
		propMap.put("genres", "Rock, Pop");
	}
	
	@RequestMapping(value = "/showProp.html", method = RequestMethod.GET)
	public ModelAndView get() {
		
		ReloadPropVO reloadPropVO = new ReloadPropVO();
		reloadPropVO.setPropMap(propMap);
		
		return new ModelAndView("editProp" , "reloadPropVO", reloadPropVO);
	}
	
	@RequestMapping(value = "/addProp.html", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("reloadPropVO") ReloadPropVO reloadPropVO) {
		System.out.println(reloadPropVO);

		if(null != reloadPropVO.getPropMap()) {
			propMap = reloadPropVO.getPropMap();
			System.out.println(propMap);
			System.out.println(propMap.keySet());
		}
		
		return new ModelAndView("showProp", "reloadPropVO", reloadPropVO);
	}
}
