package completePrinter;

public class MessageMethod {
	
	private String nameSource="";
	private String namefunction="";
	private String descriptorFunction="";
	private String interfaceName="";
	private String capture="";

	
	public void setNameSource(String nameSource) {
		this.nameSource = nameSource;
	}
	public void setNamefunction(String namefunction) {
		this.namefunction = namefunction;
	}
	public void setDescriptorFunction(String descriptorFunction) {
		this.descriptorFunction = descriptorFunction;
	}
	public void setInterfaceName(String interfaceName) {
		this.interfaceName = interfaceName;
	}
	
	
	@Override
	public String toString() {
		return "MessageMethod [nameSource=" + nameSource + ", namefunction=" + namefunction + ", descriptorFunction="
				+ descriptorFunction + ", interfaceName=" + interfaceName + ", capture=" + capture + "]";
	}
	
	
	

}
