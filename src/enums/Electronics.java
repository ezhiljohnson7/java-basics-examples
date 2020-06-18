package enums;

public enum Electronics {
	
	TV("television"),XBOX("xbox-one-s"),AC("air conditioner"),REFRIGERATOR("refrigerator");
	
	Electronics(String electronicItem){
		Electronics.valueOf(electronicItem);
	}
}
