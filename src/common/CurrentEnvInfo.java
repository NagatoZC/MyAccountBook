package common;

import view.LoginFrame;
import view.WelcomeFrame;

/**
 * 当前正在运行的环境
 * @author zc
 * @version 1.0
 * @date 2021/3/18 15:01
 */
public interface CurrentEnvInfo {
	/**
	 * 登录窗口
	 */
	LoginFrame LOGIN_FRAME = new LoginFrame();
	/**
	 * 欢迎窗口
	 */
	WelcomeFrame WELCOME_FRAME = new WelcomeFrame();
}
