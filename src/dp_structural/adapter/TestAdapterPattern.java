package dp_structural.adapter;

public class TestAdapterPattern {

	public static void main(String[] args) {
		ClientImp clientImp = new ClientImp("himanshu", "8826555555");
		ServerAPI api = new ClientAdapter(clientImp);
		
		System.out.println(api.getFirstName());
		System.out.println(api.getMobileNumber());

	}

}
