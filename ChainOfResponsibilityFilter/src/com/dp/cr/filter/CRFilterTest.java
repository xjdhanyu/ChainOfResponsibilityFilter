package com.dp.cr.filter;

public class CRFilterTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String msg = "Hi :),敏感字符，只为了测试；";
		String response = "[response]";
		FilterChain filterChain = new FilterChain();
		filterChain.add(new SensitiveFilter())
					.add(new HTMLFilter());
		filterChain.doFilter(msg,response,filterChain);
	}

}
