/**  
 * Project Name:sell  
 * File Name:BuyerProductController.java  
 * Package Name:com.zhc.controller  
 * Date:2018年1月6日下午6:47:53  
 * Copyright (c) 2018, chenzhou1025@126.com All Rights Reserved.  
 *  
*/  
  
package com.zhc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhc.viewobject.ResultViewObject;

/**  
 * ClassName:BuyerProductController <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2018年1月6日 下午6:47:53 <br/>  
 * @author   l00228291  
 * @version    
 * @since    JDK 1.6  
 * @see        
 */
@RestController
@RequestMapping("buyer/product")
public class BuyerProductController {

	@GetMapping("/list")
	public ResultViewObject list(){
		ResultViewObject resultViewObject = new ResultViewObject();
		return resultViewObject;
	}
}
  
