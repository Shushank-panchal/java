package CoreJava;

public class TestHospital extends Hospital{
public static void main(String[] args)
{   Hospital obj = new Hospital();
	obj.setDocno(50);
	obj.setHospitalname("City Hospital");
	System.out.println("numbers of doctors in hospital :"+obj.getDocno());
	System.out.println("Name of the hospital :"+obj.getHospitalname());
}
}
