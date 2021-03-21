package view.menu;

import javax.swing.*;

/**
 * @author zc
 * @version 1.0
 * @date 2021/3/21 21:59
 */
public class WelcomeMenu {
	/**
	 * 获取欢迎页TopMenu
	 * @return welcome page menuBar
	 */
	public JMenuBar getTopMenuBar(){

		JMenuBar jMenuBar = new JMenuBar();
		JMenu dataMenu = new JMenu("数据维护");
		JMenuItem taskItem = new JMenuItem("任务配置");
		JMenuItem taskDataItem = new JMenuItem("任务维护");
		dataMenu.add(taskItem);
		dataMenu.add(taskDataItem);
		JMenu dataViewMenu = new JMenu("数据查看");
		jMenuBar.add(dataMenu);
		jMenuBar.add(dataViewMenu);
		return jMenuBar;
	}
}
