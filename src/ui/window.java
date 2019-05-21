package ui;

import java.awt.Color;
import java.awt.Container;
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

	public window(String title) {

		JLabel lbl = new JLabel();
		lbl.setText(" 実行しました");
		// 背景色をオレンジに
		lbl.setBackground(Color.ORANGE);
		lbl.setOpaque(true);

		Container contentPane = getContentPane();
		contentPane.add(lbl);
	}

}
