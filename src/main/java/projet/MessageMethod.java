package projet;

public class MessageMethod {
	
	private String nameSource="";
	private String namefunction="";
	private String descriptorFunction="";
	
	
	public void setNameSource(String nameSource) {
		this.nameSource = nameSource;
	}
	public void setNamefunction(String namefunction) {
		this.namefunction = namefunction;
	}
	public void setDescriptorFunction(String descriptorFunction) {
		this.descriptorFunction = descriptorFunction;
	}
	
	@Override
	public String toString() {
		return "MessageMethod [nameSource=" + nameSource + ", namefunction=" + namefunction + ", descriptorFunction="
				+ descriptorFunction + "]";
	}
	
}
