package dp_structural.adapter;

public class ClientImp implements ClientApi{
	
	private String name;
	
	private String mobileNumber;
	
	

	public ClientImp(String name, String mobileNumber) {
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getMobileNumber() {
		return mobileNumber;
	}

}
