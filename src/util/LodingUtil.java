package util;

public class LodingUtil {
	static public void mainUi(int select,String nickname){
		final int max = 1;
		int count = 0;
		String grade ="□" ,review = "□",distance ="□", serch ="□", order ="□",mypage ="□",board ="□";
		String page = "마이페이지";
		if(nickname.equals("비회원")){page = "로그인";}
		if(nickname.equals("관리자")){page = "관리자전용";}
		String x ="";
		String a = "■";
		switch(select)
		{
		case 1 : grade =a;x = "평점순";break;
		case 2 : review =a;x = "리뷰수";break; 
		case 3 : distance =a;x = "거리순";break;
		case 4 : serch =a;x= "평점순";break;
		case 5 : order =a;break;
		case 6 : mypage =a;break;
		case 7 : board  =a;break;
		default : break;
		}
		
		
		for(int i = 1; i <6;i++){
			Util.wait(110);
			if(count == max){break;}
			
			if(i == 5){count++;i = 1;}
		if(i == 1){
			System.out.println("\n\n\n□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■\n\n"
					+ "                                    🍽️ 오늘 뭐먹지? 🍽️               "+nickname+"(으)로 접속중\n"
					+ " "+grade+" 평점기준                   🥘 ["+x+"] BEST 5 🍝\n"
					+ " "+review+" 리뷰수기준\n"
					+ " "+distance+" 거리기준                	           ■ □\n"
					+ " "+serch+" 검색                     	           □ □\n"
					+ " "+order+" 도시락주문     \n"
					+ " "+mypage+" "+page+"             \n"
					+ " "+board+" 고객센터                                             (2)↓ (5)↑ (⏎)확인\n"
					+ "□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■\n>");}
			
			if(i == 2){
				System.out.println("\n\n\n□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■\n\n"
						+ "                                    🍽️ 오늘 뭐먹지? 🍽️               "+nickname+"(으)로 접속중\n"
						+ " "+grade+" 평점기준                   🥘 ["+x+"] BEST 5 🍝\n"
						+ " "+review+" 리뷰수기준\n"
						+ " "+distance+" 거리기준                	           □ □\n"
						+ " "+serch+" 검색                     	           ■ □\n"
						+ " "+order+" 도시락주문     \n"
						+ " "+mypage+" "+page+"             \n"
						+ " "+board+" 고객센터                                             (2)↓ (5)↑ (⏎)확인\n"
						+ "□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■\n>");}
		
			if(i == 3){
				System.out.println("\n\n\n□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■\n\n"
						+ "                                    🍽️ 오늘 뭐먹지? 🍽️               "+nickname+"(으)로 접속중\n"
						+ " "+grade+" 평점기준                   🥘 ["+x+"] BEST 5 🍝\n"
						+ " "+review+" 리뷰수기준\n"
						+ " "+distance+" 거리기준                	           □ □\n"
						+ " "+serch+" 검색                     	           □ ■\n"
						+ " "+order+" 도시락주문     \n"
						+ " "+mypage+" "+page+"             \n"
						+ " "+board+" 고객센터                                             (2)↓ (5)↑ (⏎)확인\n"
						+ "□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■\n>");}
			
			if(i == 4){
				System.out.println("\n\n\n□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■\n\n"
						+ "                                    🍽️ 오늘 뭐먹지? 🍽️               "+nickname+"(으)로 접속중\n"
						+ " "+grade+" 평점기준                   🥘 ["+x+"] BEST 5 🍝\n"
						+ " "+review+" 리뷰수기준\n"
						+ " "+distance+" 거리기준                	           □ ■\n"
						+ " "+serch+" 검색                     	           □ □\n"
						+ " "+order+" 도시락주문     \n"
						+ " "+mypage+" "+page+"             \n"
						+ " "+board+" 고객센터                                             (2)↓ (5)↑ (⏎)확인\n"
						+ "□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■\n>");}
	}
}
	
	
	
}
