package testEnum.enumClass;

public enum Shop_29CM implements StoreEnum {
	PRODUCT_CODE("product_code") {

		@Override
		public String apply() {
			return this.code;
		}
	
	};

	String code;
	
	Shop_29CM(String code) {
		this.code = code;
	}
	
	@Override
	public String getValue() {
		return this.code;
	}
	
}
