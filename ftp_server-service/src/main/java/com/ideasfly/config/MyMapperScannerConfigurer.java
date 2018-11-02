package com.ideasfly.config;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ideasfly.dao.base.BaseMyMapper;

/**
 * @author lanxuewei Create in 2018/10/26 20:43
 * Description: 注册mappr扫描器,使用tk.mybatis扫描
 */
@Configuration
public class MyMapperScannerConfigurer {
	
	@Bean
	public MapperScannerConfigurer getMyMapperScannerConfigurer() {
		MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
		mapperScannerConfigurer.setMarkerInterface(BaseMyMapper.class);
		mapperScannerConfigurer.setBasePackage("com.ideasfly.dao.mapper");
		return mapperScannerConfigurer;
	}

}
