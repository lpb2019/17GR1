package li.usp.com;

public class elemp implements EMS,HardDisk,Cpu {

	public void ele() {
		// TODO Auto-generated method stub

		System.out.println("jisuanji");
	}
	@Override
	public void cpu() {
		// TODO Auto-generated method stub
		System.out.println("cpudepinpai");
		
	}

	@Override
	public void hard() {
		// TODO Auto-generated method stub
		System.out.println("yingpan");
		
	}

	@Override
	public void ems() {
		// TODO Auto-generated method stub
		System.out.println("neicun");
		
	}

}
