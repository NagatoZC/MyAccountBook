import common.CurrentEnvInfo;
import view.LoginFrame;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

/**
 * 启动函数,应用从这里启动
 * @author zc
 * @version 1.0
 * @date 2021/3/18 14:32
 */
public class Start {

	public static void main(String[] args) {
		System.out.println("应用启动"+new Date());
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				LoginFrame loginFrame = CurrentEnvInfo.LOGIN_FRAME;
				//选择退出按钮
				loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				//登录窗口居中显示
				loginFrame.setLocationRelativeTo(null);
				//显示
				loginFrame.setVisible(true);
			}
		});

	}

}

