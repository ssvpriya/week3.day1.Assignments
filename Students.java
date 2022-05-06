
public class Students {
	int id=1234;
	String email="xyz123@gmail.com",name="Raghul";
	String phoneno="9876543210";
	
	public void getStudentInfo(int id,String name) {
		System.out.println("id : "+id+" name: "+name);
		
	}
    public void getStudentInfo(String email,String phoneno) {
    	System.out.println("email : "+email+" phoneno : "+phoneno);
		
	}
    public void getStudentInfo(int id) {
    	System.out.println("id: "+id);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students info = new Students();
		info.getStudentInfo(info.id,info.name);
		info.getStudentInfo(info.email,info.phoneno);
		info.getStudentInfo(info.id);

	}

}
