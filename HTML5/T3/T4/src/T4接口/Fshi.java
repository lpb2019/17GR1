package T4接口;

public class Fshi extends Men   implements Suo  ,Pai{

	@Override
	public void shang() {
		System.out.println("上锁成功");
	}

	@Override
	public void kaisuo() {
		// TODO Auto-generated method stub
		System.out.println("开锁成功");
		
	}

	@Override
	public void kai() {
         System.out.println("门打开了");		
	}

	@Override
	public void guan() {
		System.out.println("门关上了");		
		
	}

	@Override
	public void paizhao() {
		System.out.println("啪啪啪，  拍照成功");
	}

}
