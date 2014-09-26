package com.dp.cr.filter;

public class HTMLFilter implements Filter{

	
	@Override
	public void doFilter(String request,String response,FilterChain filterChain) {
		request = request.replaceAll(":\\)", "^_^");
		System.out.println("---------After HTML Filter :" + request + "---------");
		filterChain.doFilter(request, response, filterChain);
		System.out.println("---------After HTML Filter :" + response + "---------");
	}

}
