package com.example.spring01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring01.model.dto.ProductDTO;

//ajax처리 전용 컨트롤러(백그라운드에서 실행됨)
@RestController //스프링 4.0 이상부터 사용가능 , 현업에서는 스프링 3.0을 많이 사용하므로 그 때는
//@Controller로 사용하면 됨
public class SampleRestController{
	//@ResponseBody : json형식으로 데이터를 리턴
	@ResponseBody  // <-- @Controller로 하면 사용하고 RestController로 하면 생략해도 됨
	@RequestMapping("test/doF")
	public ProductDTO doF() {
		//json 데이터가 리턴됨
		return new ProductDTO("냉장고", 500000);
	}
}