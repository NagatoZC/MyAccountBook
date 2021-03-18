package controller;

import common.CurrentEnvInfo;
import common.ViewConstant;
import controller.common.CommonAction;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author zc
 * @version 1.0
 * @date 2021/3/18 16:23
 */
public class LoginAction  extends CommonAction implements ActionListener {
	private JTextField userField;
	private JTextField passField;

	public LoginAction(JTextField userField, JTextField passField) {
		this.userField = userField;
		this.passField = passField;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String currentBtnName=null;
		Object source = e.getSource();
		if(source instanceof JButton){
			JButton	currentBtn = (JButton) source;
			currentBtnName = currentBtn.getText();
		}
		if(null==currentBtnName){
			showErrorInfo();
		}else {
			switch (currentBtnName){
				case ViewConstant.LOGIN_BUTTON_NAME:
					String text = userField.getText();
					String pass = passField.getText();
					System.out.println("获取到登录密码"+text+pass);
					//TODO 跳转至欢迎页目前不做密码验证
					CurrentEnvInfo.WELCOME_FRAME.setVisible(true);
					//销毁登录窗口
					CurrentEnvInfo.LOGIN_FRAME.dispose();
					break;
				case ViewConstant.RESTART_BUTTON_NAME:
					userField.setText("");
					passField.setText("");
					break;
				default:
					showErrorInfo();
					break;
			}
		}
	}
}
