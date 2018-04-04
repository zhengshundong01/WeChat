package emums;

import lombok.Getter;

@Getter
public enum ProductStatusEmum {
	UP(0,"在架"),
	DOWN(1,"下架")
	;
	
	private Integer code;
	
	private String message;

	private ProductStatusEmum(Integer code, String message) {
		this.code = code;
		this.message = message;
	}
	
	
}
