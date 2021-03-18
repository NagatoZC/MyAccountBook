package controller.common;

import common.ViewConstant;

import javax.swing.*;

/**
 * @author zc
 * @version 1.0
 * @date 2021/3/18 17:35
 */
public class CommonAction {
	public void showErrorInfo(){
		JOptionPane.showMessageDialog(null, ViewConstant.ERROR_MESSAGE);
	}
}
