package com.dp.cr.filter;

public class CRFilterTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String msg = "Hi :),�����ַ���ֻΪ�˲��ԣ�";
		String response = "[response]";
		FilterChain filterChain = new FilterChain();
		filterChain.add(new SensitiveFilter())
					.add(new HTMLFilter());
		filterChain.doFilter(msg,response,filterChain);
	}

}
