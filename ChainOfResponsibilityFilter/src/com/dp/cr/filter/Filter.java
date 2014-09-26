package com.dp.cr.filter;

public interface Filter {
	void doFilter(String request,String response,FilterChain filterChain);
}
