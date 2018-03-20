/**  
 * Project Name:sell  
 * File Name:ProductInfoRepository.java  
 * Package Name:com.zhc.repository  
 * Date:2018年1月6日下午5:50:05  
 * Copyright (c) 2018, chenzhou1025@126.com All Rights Reserved.  
 *  
*/  
  
package com.zhc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zhc.dataobject.ProductInfo;

/**  
 * ClassName:ProductInfoRepository <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2018年1月6日 下午5:50:05 <br/>  
 * @author   l00228291  
 * @version    
 * @since    JDK 1.6  
 * @see        
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String>{

	List<ProductInfo> findByProductStatus(Integer productStatus);
}
  
