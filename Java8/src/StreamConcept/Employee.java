package StreamConcept;

import java.util.HashSet;
import java.util.Set;

public class Employee {

	private String name ;
	private Set<String> devices;
	
	public void addDevices(String deviceName) {
		
		if(this.devices == null) {
			
			this.devices = new HashSet<>();
			
			
		}
		
		this.devices.add(deviceName);
			
		
		
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", devices=" + devices + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getDevices() {
		return devices;
	}

	public void setDevices(Set<String> devices) {
		this.devices = devices;
	}
	
	
	
}
