package com.sist.vo;

import lombok.Data;

/*
 * PRODUCT_CODE	     NUMBER(10,0)	     No
	NAME	         VARCHAR2(500 BYTE)	 No
	ORIGINAL_PRICE	 VARCHAR2(100 BYTE)	 Yes
	SALE_PRICE	     VARCHAR2(100 BYTE)	 Yes
	PRICE	         VARCHAR2(100 BYTE)	 Yes
	IMAGE_URL	     VARCHAR2(1000 BYTE) Yes
	DETAIL_URL	     VARCHAR2(1000 BYTE) Yes
	BRAND	         VARCHAR2(200 BYTE)	 Yes
	ORIGIN	         VARCHAR2(200 BYTE)	 Yes
	MAIN_IMAGE	     VARCHAR2(1000 BYTE) Yes
	DETAIL_IMAGES	 CLOB	             Yes
	MAIN_CATEGORY	 VARCHAR2(200 BYTE)	 Yes
	SUB_CATEGORY	 VARCHAR2(200 BYTE)	 Yes
	DETAIL_CATEGORY	 VARCHAR2(200 BYTE)	 Yes
	TYPE	         VARCHAR2(20 BYTE)	 Yes
 */
@Data
public class Camping_productVO {
    private int product_code;
    private String name, original_price, sale_price, price, image_url, detail_url, brand, origin, 
                   main_image, detail_image, main_category, sub_category, detail_category, type;
}
