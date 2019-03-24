package com.sapient.builders.pattern;

public class EmployeeBuilder {
	
	@SuppressWarnings("unused")
	private String firstName;
    @SuppressWarnings("unused")
	private String middleName;
    
	public EmployeeBuilder(String firstName, String middleName) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
	}
    
    public static class Builder{
    	
    	private String firstName;
        private String middleName;
        
        public Builder(){}
        
        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }
    	
        public EmployeeBuilder build() {
        	return new EmployeeBuilder(firstName, middleName);
        }
    }
    
    public static void main(String[] args) {
		EmployeeBuilder builder = new Builder().setFirstName("Susmit").build();
		System.out.println(builder);
    }

	@Override
	public String toString() {
		return "EmployeeBuilder [firstName=" + firstName + ", middleName=" + middleName + "]";
	}
}
