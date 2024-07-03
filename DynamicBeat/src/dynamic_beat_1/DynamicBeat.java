package dynamic_beat_1;

import javax.swing.JFrame;

public class DynamicBeat extends JFrame {
	public DynamicBeat() {
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT); //만들어둔 상수로 사이즈 정의
		setResizable(false); //한번 만들어진 게임창은 사용자가 임의로 크기조정할 수 없음
		setLocationRelativeTo(null);//게임창은 컴퓨터의 정중앙에 뜨게 됨
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // (중요)게임창 닫으면 프로그램도 종료. 없으면 백그라운드에서 계속 돌아감.
        setVisible(true); // 화면이 정상적으로 출력되도록
		
		
	}

}
