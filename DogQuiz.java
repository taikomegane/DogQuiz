package practice;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DogQuiz extends JFrame implements ActionListener {

	private static JLabel label2;

	public static void main(String[] args) {
		//フレームのインスタンスの生成
		DogQuiz frame = new DogQuiz();
		frame.setTitle("いぬクイズ");

		//ラベルを生成
		JLabel label1 = new JLabel("ラブラドールレトリバーはどれだ");
		label2 = new JLabel();

		//ラベルをフレームに追加
		frame.add(label1, BorderLayout.NORTH);
		frame.add(label2, BorderLayout.SOUTH);

		//ボタンを載せるパネルを生成
		JPanel panelButton = new JPanel();

		//ボタンを生成
		JButton buttonDog1 = new JButton(new ImageIcon("img/inu1.jpg", "はずれ、これはヨークシャーテリア"));
		JButton buttonDog2 = new JButton(new ImageIcon("img/inu2.jpg", "あたり"));
		JButton buttonDog3 = new JButton(new ImageIcon("img/inu3.jpg", "はずれ、これはシベリアンハスキー"));
		JButton buttonDog4 = new JButton(new ImageIcon("img/inu4.jpg", "はずれ、これはパグ"));

		//ボタンをパネルに追加
		panelButton.add(buttonDog1);
		panelButton.add(buttonDog2);
		panelButton.add(buttonDog3);
		panelButton.add(buttonDog4);

		//ボタンにイベントを追加
		buttonDog1.addActionListener(frame);
		buttonDog2.addActionListener(frame);
		buttonDog3.addActionListener(frame);
		buttonDog4.addActionListener(frame);

		//パネルをフレームに追加
		frame.add(panelButton, BorderLayout.CENTER);

		//フレームの設定
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1500,1000);
		frame.setLocationByPlatform(true);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		JButton b = (JButton) e.getSource();

		String s = b.getIcon().toString();

		label2.setText(s);

	}

}
