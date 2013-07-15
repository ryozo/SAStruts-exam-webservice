package jp.sastruts.exam.interceptor;

import javax.servlet.http.HttpServletRequest;

import jp.sastruts.exam.service.dto.LogInfo;

import org.seasar.struts.util.RequestUtil;
import org.seasar.struts.util.ResponseUtil;

public class ApplicationLogInterceptor extends LogInterceptorBase {
	
	/**
	 * 処理の実行前ログを取得します。
	 */
	@Override
	protected LogInfo preLog(LogInfo logInfo) {
		HttpServletRequest request = RequestUtil.getRequest();
		logInfo.preInfo= request.getRequestURI();
		return logInfo;
	}
	
	/**
	 * 処理の実行後ログを取得します。
	 */
	@Override
	protected LogInfo postLog(LogInfo logInfo) {
		logInfo.postInfo = ResponseUtil.getResponse().toString();
		return logInfo;
	}

}
