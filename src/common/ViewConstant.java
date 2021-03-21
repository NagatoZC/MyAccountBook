package common;

/**
 * 视图相关的常量
 *
 * @author zc
 * @version 1.0
 * @date 2021/3/18 14:43
 */
public interface ViewConstant {
	/**
	 * 登录页面高度
	 */
	int LOGIN_FRAME_HEIGHT = 300;
	/**
	 * 登录页面宽度
	 */
	int LOGIN_FRAME_WIDTH = 400;
	/**
	 * 应用名称
	 */
	String APP_TITLE = "记账本";

	/**
	 * 欢迎页的宽度
	 */
	int WELCOME_FRAME_WIDTH = 800;
	/**
	 * 欢迎页的高度
	 */
	int WELCOME_FRAME_HEIGHT = 700;
	/**
	 * 登录按钮名称
	 */
	String LOGIN_BUTTON_NAME ="登录";
	/**
	 * 重置按钮名称
	 */
	String RESTART_BUTTON_NAME ="重置";
	/**
	 * 错误提示语
	 */
	String ERROR_MESSAGE ="操作出现异常,请联系管理员";
	/**
	 * 用户名或密码错误
	 */
	String LOGIN_FAIL_MESSAGE ="用户名或密码输入错误";
}
