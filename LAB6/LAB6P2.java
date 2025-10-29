class AnnoP{
	@Deprecated
	public void depM(){
		System.out.println("Deprecated method...");
	} 
	
	public void ovR(){
		System.out.println("AnnoP");
	}
}
 
class AnnoC extends AnnoP{
	@Override
	public void ovR(){
		System.out.println("AnnoC");
	}
}

public class LAB6P2{
	@SuppressWarnings("deprication")
	public static void main(String...args){
		AnnoC ac=new AnnoC();
		ac.ovR();
		ac.depM();
	}
}
