package testa;

import java.awt.Color;
import java.awt.Container;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class window extends JFrame {


	public static void main(String[] args) {

		// ウィンドウの作成およびタイトルの設定
		window frame = new window("ウィンドウのタイトル");
		// バツボタンでプログラムを終了するようにする
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ウィンドウサイズの指定
		frame.setSize(300, 100);
		// ウィンドウを画面中央に配置
		frame.setLocationRelativeTo(null);
		// ウィンドウを可視状態にする
		frame.setVisible(true);



	}
	public window(String title){

Calendar cl = Calendar.getInstance();

        //SimpleDateFormatクラスでフォーマットパターンを設定する
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        String nowTime= sdf.format(cl.getTime());

		JLabel lbl = new JLabel();
		lbl.setText(nowTime+" 実行しました");
		// 背景色をオレンジに
		lbl.setBackground(Color.ORANGE);
		lbl.setOpaque(true);

	    Container contentPane = getContentPane();
	    contentPane.add(lbl);
	  }

}
