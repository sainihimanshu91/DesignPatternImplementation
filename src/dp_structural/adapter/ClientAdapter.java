package dp_structural.adapter;

public class ClientAdapter implements ServerAPI{
	
	private ClientImp clientImp;
	
	public ClientAdapter(ClientImp clientImp) {
		super();
		this.clientImp = clientImp;
	}

	@Override
	public String getFirstName() {
		return clientImp.getName();
	}

	@Override
	public long getMobileNumber() {
		return Long.parseLong(clientImp.getMobileNumber());
	}

}
