package com.dp.cr.filter;

public class SensitiveFilter implements Filter{

	
	@Override
	public void doFilter(String request,String response,FilterChain filterChain) {
		request = request.replaceAll("√Ù∏–", " ");
		System.out.println("---------After Sensitive Filter :" + request + "---------");
		filterChain.doFilter(request, response, filterChain);
		System.out.println("---------After Sensitive Filter :" + response + "---------");
	}

}
