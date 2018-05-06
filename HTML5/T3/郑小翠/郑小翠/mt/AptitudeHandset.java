package mt;

	public class AptitudeHandset extends sj implements TheakePicture,Network,PlayWirring{

	

		
		public AptitudeHandset(String brand, String type) {
			super("htc", "I9100");
		}
	
		public void play1() {
			System.out.println( "开始播放《热雪》......");
		}

		public void networkConn() {
			
			System.out.println("已经启动移动网络......");
		}
		
		public void takePictures() {
			System.out.println("咔嚓......拍照成功");
		}
		
		
		public static void main(String[] args){
			
			AptitudeHandset tpd = new AptitudeHandset("G502c", "索尼爱立信");
			tpd.setBrand("G502c");
			tpd.setType( "索尼爱立信");
			
			tpd.Info();
		
			tpd.call();
			tpd.sendInfo();
			 tpd.play();
			 
				AptitudeHandset tpd1 = new AptitudeHandset("htc", "I9100");
				tpd1.setBrand("htc");
				tpd1.setType(  "I9100");
				tpd1.Info();
				 tpd1.play1();
				 tpd.takePictures();
					tpd.networkConn();
		}

		@Override
		public void play() {
			System.out.println( "开始播放音乐了......");
			
		}

		

	}	
		
		

