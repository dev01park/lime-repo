package testEnum.enumClass;

public enum BizestColumnEnum implements StoreEnum {
	ITEM_CODE("item_no") {
		@Override
		public String apply() {
			return this.code;
		}
	};

	String code;
	BizestColumnEnum(String code) {
		this.code = code;
	}
	
	@Override
	public String getValue() {
		return this.code;
	}
	
}
