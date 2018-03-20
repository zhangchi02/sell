/**  
 * Project Name:sell  
 * File Name:ResultViewObject.java  
 * Package Name:com.zhc.viewobject  
 * Date:2018年1月6日下午6:58:25  
 * Copyright (c) 2018, chenzhou1025@126.com All Rights Reserved.  
 *  
*/  
  
package com.zhc.viewobject;

import lombok.Data;

/**  
 * ClassName:ResultViewObject <br/>  
 * Function: http请求返回的最外层的对象  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2018年1月6日 下午6:58:25 <br/>  
 * @author   l00228291  
 * @version    
 * @since    JDK 1.6  
 * @see        
 */
@Data
public class ResultViewObject<T> {

	/** 错误码. */
	private Integer code;
	
	/** 提示信息. */
	private String msg;
	
	/** 具体内容. */
	private T data;
}
  
