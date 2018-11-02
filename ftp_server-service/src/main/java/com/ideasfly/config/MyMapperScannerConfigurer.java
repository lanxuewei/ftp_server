package com.ideasfly.config;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.deepwise.cloud.dao.base.BaseMyMapper;


/**
 * 
 * @ClassName: MyMapperScannerConfigurer 
 * @Description: 注册mappr扫描器,使用tk.mybatis扫描 
 * @author LJ O
 * @date 2018年3月8日 下午5:24:17
 */
@Configuration
public class MyMapperScannerConfigurer {
	
	@Bean
	public MapperScannerConfigurer getMyMapperScannerConfigurer() {
		MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
		mapperScannerConfigurer.setMarkerInterface(BaseMyMapper.class);
		mapperScannerConfigurer.setBasePackage("com.deepwise.cloud.dao.mapper");
		return mapperScannerConfigurer;
	}
}
