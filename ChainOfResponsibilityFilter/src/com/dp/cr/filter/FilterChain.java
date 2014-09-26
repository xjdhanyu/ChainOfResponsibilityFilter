package com.dp.cr.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter{
	private List<Filter> filterList = new ArrayList<Filter>();
	private int index = 0;
	
	public FilterChain add(Filter filter){
		this.filterList.add(filter);
		return this;
	}

	@Override
	public void doFilter(String request,String response,FilterChain filterChain) {
		if(index == this.filterList.size()) return ;
		else{
			Filter filter = filterList.get(index);
			index++;
			filter.doFilter(request, response, filterChain);
		}
	}

	public List<Filter> getFilterList() {
		return filterList;
	}

	public void setFilterList(List<Filter> filterList) {
		this.filterList = filterList;
	}

	public void next(String request,String response,FilterChain filterChain) {
		if(index == this.filterList.size()) return;
		else{
			this.filterList.get(index + 1).doFilter(request, response, filterChain);
		}
		
	}
	
	
}
