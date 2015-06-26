/**
 * 
 */
package com.bakka.web;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bakka.form.ReloadPropVO;
import com.bakka.util.PropUtils;



/**
 * @author SB
 *
 */

@Controller
public class ReloadPropertiesController {

	private static Map<String, String> propMap = new HashMap<String, String>();
	@Value("${jdbc.password}")
	 private String attr;

	public String getAttr() {
		return attr;
	}

	public void setAttr(String attr) {
		this.attr = attr;
	}
 
	static {
		propMap.put("name", "John");
		propMap.put("lastname", "Lennon");
		propMap.put("genres", "Rock, Pop");
	}
	
	@RequestMapping(value = "/showProp.html", method = RequestMethod.GET)
	public ModelAndView get(HttpServletRequest request) throws Exception {
		
		ReloadPropVO reloadPropVO = new ReloadPropVO();
		PropUtils pU= new PropUtils();
		Map<String, String> map= pU.loadProps(request);
		if(!map.isEmpty())
			//reloadPropVO.setPropMap(pU.loadPropertiesFromCP());
			reloadPropVO.setPropMap(pU.loadProps(request));
		else
			reloadPropVO.setPropMap(propMap);
		reloadPropVO.setAttribute(getAttr());
		return new ModelAndView("editProp" , "reloadPropVO", reloadPropVO);
	}
	
	@RequestMapping(value = "/addProp.html", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("reloadPropVO") ReloadPropVO reloadPropVO, HttpServletRequest request) throws Exception{
		System.out.println(reloadPropVO);

		if(null != reloadPropVO.getPropMap()) {
			PropUtils pU= new PropUtils();
			pU.saveProps(request, reloadPropVO.getPropMap());
			//pU.updatePropertiesFromCP(reloadPropVO.getPropMap());
		}
		
		return new ModelAndView("showProp", "reloadPropVO", reloadPropVO);
	}
}