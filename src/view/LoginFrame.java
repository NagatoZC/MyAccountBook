package view;

import common.ViewConstant;
import controller.LoginAction;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * 登录页面主窗口页面
 *
 * @author zc
 * @version 1.0
 * @date 2021/3/18 14:35
 */
public class LoginFrame  extends JFrame {

	public LoginFrame() throws HeadlessException {
		//设置大小
		setSize(ViewConstant.LOGIN_FRAME_WIDTH,
				ViewConstant.LOGIN_FRAME_HEIGHT);
		//禁止改变大小
		setResizable(false);
		//设置标题
		setTitle(ViewConstant.APP_TITLE);
		//设置icon
		setIconImage(new ImageIcon(this.getClass().getResource("/statics/title_img.png")).getImage());
		//获取容器
		Container contentPane = getContentPane();
		//设置窗体大小
		BorderLayout borderLayout = new BorderLayout();
		setLayout(borderLayout);



		//输入框

		JPanel userPanel = new JPanel();
		JLabel userLabel = new JLabel("用户名");
		JTextField userName = new JTextField(15);
		userPanel.add(userLabel);
		userPanel.add(userName);

		JPanel passWordPanel = new JPanel();
		JLabel passWordLabel = new JLabel("密  码");
		JTextField passWord = new JPasswordField(15);
		passWordPanel.add(passWordLabel);
		passWordPanel.add(passWord);

		//登录按钮组件
		JPanel loginBtnPanel = new JPanel();
		JButton loginBtn = new JButton("登录");
		JButton resetBtn = new JButton("重置");
		loginBtnPanel.add(loginBtn);
		loginBtnPanel.add(resetBtn);
		loginBtn.addActionListener(new LoginAction(userName,passWord));
		GridLayout gridLayout = new GridLayout(3,2,0,5);
		//声明一个面板来存放组件
		JPanel contentPanel = new JPanel();
		//设置边框
		contentPanel.setBorder(new EmptyBorder(80,20,20,20));
		contentPanel.setLayout(gridLayout);
		//添加组件
		contentPanel.add(userPanel);
		contentPanel.add(passWordPanel);
		contentPanel.add(loginBtnPanel);

		contentPane.add(contentPanel);





	}
}
