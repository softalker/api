package com.softalks.http;

import java.util.function.Function;

import javax.servlet.Filter;
import javax.servlet.FilterConfig;

public interface FilterFactory extends Function<FilterConfig, Filter> {
	
}