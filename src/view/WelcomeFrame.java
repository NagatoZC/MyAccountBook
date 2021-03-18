package view;

import common.ViewConstant;

import javax.swing.*;
import java.awt.*;

/**
 * 登录成功页面
 * @author zc
 */
public class WelcomeFrame extends JFrame {


	public WelcomeFrame() throws HeadlessException {
		//设置大小
		setSize(ViewConstant.WELCOME_FRAME_WIDTH, ViewConstant.WELCOME_FRAME_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//设置标题
		setTitle(ViewConstant.APP_TITLE);
		//设置icon
		setIconImage(new ImageIcon(this.getClass().getResource("/statics/title_img.png")).getImage());
		//获取容器
		Container contentPane = getContentPane();
		//设置窗体大小
		BorderLayout borderLayout = new BorderLayout();
		setLayout(borderLayout);
		contentPane.add(new JLabel("欢迎登录"));
	}
}
