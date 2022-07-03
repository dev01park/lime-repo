package testVO;

import java.lang.reflect.Field;
import java.util.Arrays;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class ValidAnnotationOverrideClass {
	
	protected Field[] validFields;
	
	@Override
	public int hashCode() {
		this.validFields = this.validFields == null ? getValidFields(this) : this.validFields;
		HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
		Arrays.stream(validFields).forEach((field) -> {
			try {
				hashCodeBuilder.append(field.get(this));
			} catch (Exception e) {
				return;
			}
		});
		return hashCodeBuilder.toHashCode();
	}
	
	public boolean equals(Object obj) {
		this.validFields = this.validFields == null ? getValidFields(this) : this.validFields;
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EqualsVO_1 other = (EqualsVO_1) obj;
		EqualsBuilder checker = new EqualsBuilder();
		
		
		Arrays.stream(validFields).forEach((field) -> {
			try {
				
				checker.append(field.get(this), field.get(other));
			} catch (Exception e) {
				return;
			}
		});
		return checker.isEquals();			
	}
	
	protected Field[] getValidFields(Object obj) {
		
		return Arrays.stream(this.getClass().getDeclaredFields()).filter((rowData) -> {
			return rowData.isAnnotationPresent(ValidColumn.class);
		}).toArray(Field[]::new);
	
	}
	
}
