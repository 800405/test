package testa;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main extends Frame implements ActionListener{

	private TextField textBox1 = new TextField("テストテスト", 60);
	private Label label1 = new Label("");

	private Button buttonExec = new Button("実行");
	private Button buttonExit = new Button("終了");

	public main(String title) {
		super(title);

		add(textBox1, BorderLayout.NORTH);
		add(label1, BorderLayout.CENTER);
		Panel panel = new Panel();
		panel.add(buttonExec);
		panel.add(buttonExit);

		add(panel, BorderLayout.SOUTH);
		pack();
		show();

		buttonExec.addActionListener(this);
		buttonExit.addActionListener(this);

	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Hello world!");
		main mainWindow = new main("test");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ

		if (e.getSource() == buttonExit) {
			System.exit(0);
		} else if (e.getSource() == buttonExec) {
			label1.setText(textBox1.getText());
		}

	}

}
