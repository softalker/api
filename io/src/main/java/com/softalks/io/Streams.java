package com.softalks.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.function.Supplier;

import javax.servlet.http.HttpServletResponse;

public interface Streams {
	
	void connect(Supplier<InputStream> inputStream, Supplier<OutputStream> outputStream);

	ByteArrayInputStream input(ByteArrayOutputStream memory);

	default void connect(byte[] response, Supplier<OutputStream> outputStream) {
		connect(() -> new ByteArrayInputStream(response), outputStream);
	}

	default void connect(byte[] input, HttpServletResponse output) {
		connect(input, () -> {
			try {
				return output.getOutputStream();
			} catch (IOException e) {
				throw new IllegalStateException(e);
			}
		});
	}
	
}
