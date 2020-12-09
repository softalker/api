package com.softalks.sql;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Date;
import java.sql.NClob;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLType;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Map;

public class Row implements ResultSet {

	private final ResultSet backend;

	public Row(ResultSet backend) {
		this.backend = backend;
	}
	
	public <T> T unwrap(Class<T> iface) throws SQLException {
		return backend.unwrap(iface);
	}

	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		return backend.isWrapperFor(iface);
	}

	public boolean next() throws SQLException {
		return backend.next();
	}

	public void close() throws SQLException {
		backend.close();
	}

	public boolean wasNull() throws SQLException {
		return backend.wasNull();
	}

	public String getString(int columnIndex) {
		try {
			return backend.getString(columnIndex);
		} catch (SQLException e) {
			throw new IllegalStateException(e);
		}
	}

	public boolean getBoolean(int columnIndex) throws SQLException {
		return backend.getBoolean(columnIndex);
	}

	public byte getByte(int columnIndex) throws SQLException {
		return backend.getByte(columnIndex);
	}

	public short getShort(int columnIndex) throws SQLException {
		return backend.getShort(columnIndex);
	}

	public int getInt(int columnIndex) {
		try {
			return backend.getInt(columnIndex);
		} catch (SQLException e) {
			throw new IllegalStateException(e);
		}
	}

	public long getLong(int columnIndex) throws SQLException {
		return backend.getLong(columnIndex);
	}

	public float getFloat(int columnIndex) throws SQLException {
		return backend.getFloat(columnIndex);
	}

	public double getDouble(int columnIndex) throws SQLException {
		return backend.getDouble(columnIndex);
	}

	public BigDecimal getBigDecimal(int columnIndex, int scale) throws SQLException {
		throw new UnsupportedOperationException();
	}

	public byte[] getBytes(int columnIndex) throws SQLException {
		return backend.getBytes(columnIndex);
	}

	public Date getDate(int columnIndex) throws SQLException {
		return backend.getDate(columnIndex);
	}

	public Time getTime(int columnIndex) throws SQLException {
		return backend.getTime(columnIndex);
	}

	public Timestamp getTimestamp(int columnIndex) throws SQLException {
		return backend.getTimestamp(columnIndex);
	}

	public InputStream getAsciiStream(int columnIndex) throws SQLException {
		return backend.getAsciiStream(columnIndex);
	}

	public InputStream getUnicodeStream(int columnIndex) throws SQLException {
		throw new UnsupportedOperationException();
	}

	public InputStream getBinaryStream(int columnIndex) throws SQLException {
		return backend.getBinaryStream(columnIndex);
	}

	public String getString(String columnLabel) throws SQLException {
		return backend.getString(columnLabel);
	}

	public boolean getBoolean(String columnLabel) throws SQLException {
		return backend.getBoolean(columnLabel);
	}

	public byte getByte(String columnLabel) throws SQLException {
		return backend.getByte(columnLabel);
	}

	public short getShort(String columnLabel) throws SQLException {
		return backend.getShort(columnLabel);
	}

	public int getInt(String columnLabel) throws SQLException {
		return backend.getInt(columnLabel);
	}

	public long getLong(String columnLabel) throws SQLException {
		return backend.getLong(columnLabel);
	}

	public float getFloat(String columnLabel) throws SQLException {
		return backend.getFloat(columnLabel);
	}

	public double getDouble(String columnLabel) throws SQLException {
		return backend.getDouble(columnLabel);
	}

	public BigDecimal getBigDecimal(String columnLabel, int scale) throws SQLException {
		throw new UnsupportedOperationException();
	}

	public byte[] getBytes(String columnLabel) throws SQLException {
		return backend.getBytes(columnLabel);
	}

	public Date getDate(String columnLabel) throws SQLException {
		return backend.getDate(columnLabel);
	}

	public Time getTime(String columnLabel) throws SQLException {
		return backend.getTime(columnLabel);
	}

	public Timestamp getTimestamp(String columnLabel) throws SQLException {
		return backend.getTimestamp(columnLabel);
	}

	public InputStream getAsciiStream(String columnLabel) throws SQLException {
		return backend.getAsciiStream(columnLabel);
	}

	public InputStream getUnicodeStream(String columnLabel) throws SQLException {
		throw new UnsupportedOperationException();
	}

	public InputStream getBinaryStream(String columnLabel) throws SQLException {
		return backend.getBinaryStream(columnLabel);
	}

	public SQLWarning getWarnings() throws SQLException {
		return backend.getWarnings();
	}

	public void clearWarnings() throws SQLException {
		backend.clearWarnings();
	}

	public String getCursorName() throws SQLException {
		return backend.getCursorName();
	}

	public ResultSetMetaData getMetaData() throws SQLException {
		return backend.getMetaData();
	}

	public Object getObject(int columnIndex) throws SQLException {
		return backend.getObject(columnIndex);
	}

	public Object getObject(String columnLabel) throws SQLException {
		return backend.getObject(columnLabel);
	}

	public int findColumn(String columnLabel) throws SQLException {
		return backend.findColumn(columnLabel);
	}

	public Reader getCharacterStream(int columnIndex) throws SQLException {
		return backend.getCharacterStream(columnIndex);
	}

	public Reader getCharacterStream(String columnLabel) throws SQLException {
		return backend.getCharacterStream(columnLabel);
	}

	public BigDecimal getBigDecimal(int columnIndex) throws SQLException {
		return backend.getBigDecimal(columnIndex);
	}

	public BigDecimal getBigDecimal(String columnLabel) throws SQLException {
		return backend.getBigDecimal(columnLabel);
	}

	public boolean isBeforeFirst() throws SQLException {
		return backend.isBeforeFirst();
	}

	public boolean isAfterLast() throws SQLException {
		return backend.isAfterLast();
	}

	public boolean isFirst() throws SQLException {
		return backend.isFirst();
	}

	public boolean isLast() throws SQLException {
		return backend.isLast();
	}

	public void beforeFirst() throws SQLException {
		backend.beforeFirst();
	}

	public void afterLast() throws SQLException {
		backend.afterLast();
	}

	public boolean first() throws SQLException {
		return backend.first();
	}

	public boolean last() throws SQLException {
		return backend.last();
	}

	public int getRow() throws SQLException {
		return backend.getRow();
	}

	public boolean absolute(int row) throws SQLException {
		return backend.absolute(row);
	}

	public boolean relative(int rows) throws SQLException {
		return backend.relative(rows);
	}

	public boolean previous() throws SQLException {
		return backend.previous();
	}

	public void setFetchDirection(int direction) throws SQLException {
		backend.setFetchDirection(direction);
	}

	public int getFetchDirection() throws SQLException {
		return backend.getFetchDirection();
	}

	public void setFetchSize(int rows) throws SQLException {
		backend.setFetchSize(rows);
	}

	public int getFetchSize() throws SQLException {
		return backend.getFetchSize();
	}

	public int getType() throws SQLException {
		return backend.getType();
	}

	public int getConcurrency() throws SQLException {
		return backend.getConcurrency();
	}

	public boolean rowUpdated() throws SQLException {
		return backend.rowUpdated();
	}

	public boolean rowInserted() throws SQLException {
		return backend.rowInserted();
	}

	public boolean rowDeleted() throws SQLException {
		return backend.rowDeleted();
	}

	public void updateNull(int columnIndex) throws SQLException {
		backend.updateNull(columnIndex);
	}

	public void updateBoolean(int columnIndex, boolean x) throws SQLException {
		backend.updateBoolean(columnIndex, x);
	}

	public void updateByte(int columnIndex, byte x) throws SQLException {
		backend.updateByte(columnIndex, x);
	}

	public void updateShort(int columnIndex, short x) throws SQLException {
		backend.updateShort(columnIndex, x);
	}

	public void updateInt(int columnIndex, int x) throws SQLException {
		backend.updateInt(columnIndex, x);
	}

	public void updateLong(int columnIndex, long x) throws SQLException {
		backend.updateLong(columnIndex, x);
	}

	public void updateFloat(int columnIndex, float x) throws SQLException {
		backend.updateFloat(columnIndex, x);
	}

	public void updateDouble(int columnIndex, double x) throws SQLException {
		backend.updateDouble(columnIndex, x);
	}

	public void updateBigDecimal(int columnIndex, BigDecimal x) throws SQLException {
		backend.updateBigDecimal(columnIndex, x);
	}

	public void updateString(int columnIndex, String x) throws SQLException {
		backend.updateString(columnIndex, x);
	}

	public void updateBytes(int columnIndex, byte[] x) throws SQLException {
		backend.updateBytes(columnIndex, x);
	}

	public void updateDate(int columnIndex, Date x) throws SQLException {
		backend.updateDate(columnIndex, x);
	}

	public void updateTime(int columnIndex, Time x) throws SQLException {
		backend.updateTime(columnIndex, x);
	}

	public void updateTimestamp(int columnIndex, Timestamp x) throws SQLException {
		backend.updateTimestamp(columnIndex, x);
	}

	public void updateAsciiStream(int columnIndex, InputStream x, int length) throws SQLException {
		backend.updateAsciiStream(columnIndex, x, length);
	}

	public void updateBinaryStream(int columnIndex, InputStream x, int length) throws SQLException {
		backend.updateBinaryStream(columnIndex, x, length);
	}

	public void updateCharacterStream(int columnIndex, Reader x, int length) throws SQLException {
		backend.updateCharacterStream(columnIndex, x, length);
	}

	public void updateObject(int columnIndex, Object x, int scaleOrLength) throws SQLException {
		backend.updateObject(columnIndex, x, scaleOrLength);
	}

	public void updateObject(int columnIndex, Object x) throws SQLException {
		backend.updateObject(columnIndex, x);
	}

	public void updateNull(String columnLabel) throws SQLException {
		backend.updateNull(columnLabel);
	}

	public void updateBoolean(String columnLabel, boolean x) throws SQLException {
		backend.updateBoolean(columnLabel, x);
	}

	public void updateByte(String columnLabel, byte x) throws SQLException {
		backend.updateByte(columnLabel, x);
	}

	public void updateShort(String columnLabel, short x) throws SQLException {
		backend.updateShort(columnLabel, x);
	}

	public void updateInt(String columnLabel, int x) throws SQLException {
		backend.updateInt(columnLabel, x);
	}

	public void updateLong(String columnLabel, long x) throws SQLException {
		backend.updateLong(columnLabel, x);
	}

	public void updateFloat(String columnLabel, float x) throws SQLException {
		backend.updateFloat(columnLabel, x);
	}

	public void updateDouble(String columnLabel, double x) throws SQLException {
		backend.updateDouble(columnLabel, x);
	}

	public void updateBigDecimal(String columnLabel, BigDecimal x) throws SQLException {
		backend.updateBigDecimal(columnLabel, x);
	}

	public void updateString(String columnLabel, String x) throws SQLException {
		backend.updateString(columnLabel, x);
	}

	public void updateBytes(String columnLabel, byte[] x) throws SQLException {
		backend.updateBytes(columnLabel, x);
	}

	public void updateDate(String columnLabel, Date x) throws SQLException {
		backend.updateDate(columnLabel, x);
	}

	public void updateTime(String columnLabel, Time x) throws SQLException {
		backend.updateTime(columnLabel, x);
	}

	public void updateTimestamp(String columnLabel, Timestamp x) throws SQLException {
		backend.updateTimestamp(columnLabel, x);
	}

	public void updateAsciiStream(String columnLabel, InputStream x, int length) throws SQLException {
		backend.updateAsciiStream(columnLabel, x, length);
	}

	public void updateBinaryStream(String columnLabel, InputStream x, int length) throws SQLException {
		backend.updateBinaryStream(columnLabel, x, length);
	}

	public void updateCharacterStream(String columnLabel, Reader reader, int length) throws SQLException {
		backend.updateCharacterStream(columnLabel, reader, length);
	}

	public void updateObject(String columnLabel, Object x, int scaleOrLength) throws SQLException {
		backend.updateObject(columnLabel, x, scaleOrLength);
	}

	public void updateObject(String columnLabel, Object x) throws SQLException {
		backend.updateObject(columnLabel, x);
	}

	public void insertRow() throws SQLException {
		backend.insertRow();
	}

	public void updateRow() throws SQLException {
		backend.updateRow();
	}

	public void deleteRow() throws SQLException {
		backend.deleteRow();
	}

	public void refreshRow() throws SQLException {
		backend.refreshRow();
	}

	public void cancelRowUpdates() throws SQLException {
		backend.cancelRowUpdates();
	}

	public void moveToInsertRow() throws SQLException {
		backend.moveToInsertRow();
	}

	public void moveToCurrentRow() throws SQLException {
		backend.moveToCurrentRow();
	}

	public Statement getStatement() throws SQLException {
		return backend.getStatement();
	}

	public Object getObject(int columnIndex, Map<String, Class<?>> map) throws SQLException {
		return backend.getObject(columnIndex, map);
	}

	public Ref getRef(int columnIndex) throws SQLException {
		return backend.getRef(columnIndex);
	}

	public Blob getBlob(int columnIndex) throws SQLException {
		return backend.getBlob(columnIndex);
	}

	public Clob getClob(int columnIndex) throws SQLException {
		return backend.getClob(columnIndex);
	}

	public Array getArray(int columnIndex) throws SQLException {
		return backend.getArray(columnIndex);
	}

	public Object getObject(String columnLabel, Map<String, Class<?>> map) throws SQLException {
		return backend.getObject(columnLabel, map);
	}

	public Ref getRef(String columnLabel) throws SQLException {
		return backend.getRef(columnLabel);
	}

	public Blob getBlob(String columnLabel) throws SQLException {
		return backend.getBlob(columnLabel);
	}

	public Clob getClob(String columnLabel) throws SQLException {
		return backend.getClob(columnLabel);
	}

	public Array getArray(String columnLabel) throws SQLException {
		return backend.getArray(columnLabel);
	}

	public Date getDate(int columnIndex, Calendar cal) throws SQLException {
		return backend.getDate(columnIndex, cal);
	}

	public Date getDate(String columnLabel, Calendar cal) throws SQLException {
		return backend.getDate(columnLabel, cal);
	}

	public Time getTime(int columnIndex, Calendar cal) throws SQLException {
		return backend.getTime(columnIndex, cal);
	}

	public Time getTime(String columnLabel, Calendar cal) throws SQLException {
		return backend.getTime(columnLabel, cal);
	}

	public Timestamp getTimestamp(int columnIndex, Calendar cal) throws SQLException {
		return backend.getTimestamp(columnIndex, cal);
	}

	public Timestamp getTimestamp(String columnLabel, Calendar cal) throws SQLException {
		return backend.getTimestamp(columnLabel, cal);
	}

	public URL getURL(int columnIndex) throws SQLException {
		return backend.getURL(columnIndex);
	}

	public URL getURL(String columnLabel) throws SQLException {
		return backend.getURL(columnLabel);
	}

	public void updateRef(int columnIndex, Ref x) throws SQLException {
		backend.updateRef(columnIndex, x);
	}

	public void updateRef(String columnLabel, Ref x) throws SQLException {
		backend.updateRef(columnLabel, x);
	}

	public void updateBlob(int columnIndex, Blob x) throws SQLException {
		backend.updateBlob(columnIndex, x);
	}

	public void updateBlob(String columnLabel, Blob x) throws SQLException {
		backend.updateBlob(columnLabel, x);
	}

	public void updateClob(int columnIndex, Clob x) throws SQLException {
		backend.updateClob(columnIndex, x);
	}

	public void updateClob(String columnLabel, Clob x) throws SQLException {
		backend.updateClob(columnLabel, x);
	}

	public void updateArray(int columnIndex, Array x) throws SQLException {
		backend.updateArray(columnIndex, x);
	}

	public void updateArray(String columnLabel, Array x) throws SQLException {
		backend.updateArray(columnLabel, x);
	}

	public RowId getRowId(int columnIndex) throws SQLException {
		return backend.getRowId(columnIndex);
	}

	public RowId getRowId(String columnLabel) throws SQLException {
		return backend.getRowId(columnLabel);
	}

	public void updateRowId(int columnIndex, RowId x) throws SQLException {
		backend.updateRowId(columnIndex, x);
	}

	public void updateRowId(String columnLabel, RowId x) throws SQLException {
		backend.updateRowId(columnLabel, x);
	}

	public int getHoldability() throws SQLException {
		return backend.getHoldability();
	}

	public boolean isClosed() throws SQLException {
		return backend.isClosed();
	}

	public void updateNString(int columnIndex, String nString) throws SQLException {
		backend.updateNString(columnIndex, nString);
	}

	public void updateNString(String columnLabel, String nString) throws SQLException {
		backend.updateNString(columnLabel, nString);
	}

	public void updateNClob(int columnIndex, NClob nClob) throws SQLException {
		backend.updateNClob(columnIndex, nClob);
	}

	public void updateNClob(String columnLabel, NClob nClob) throws SQLException {
		backend.updateNClob(columnLabel, nClob);
	}

	public NClob getNClob(int columnIndex) throws SQLException {
		return backend.getNClob(columnIndex);
	}

	public NClob getNClob(String columnLabel) throws SQLException {
		return backend.getNClob(columnLabel);
	}

	public SQLXML getSQLXML(int columnIndex) throws SQLException {
		return backend.getSQLXML(columnIndex);
	}

	public SQLXML getSQLXML(String columnLabel) throws SQLException {
		return backend.getSQLXML(columnLabel);
	}

	public void updateSQLXML(int columnIndex, SQLXML xmlObject) throws SQLException {
		backend.updateSQLXML(columnIndex, xmlObject);
	}

	public void updateSQLXML(String columnLabel, SQLXML xmlObject) throws SQLException {
		backend.updateSQLXML(columnLabel, xmlObject);
	}

	public String getNString(int columnIndex) throws SQLException {
		return backend.getNString(columnIndex);
	}

	public String getNString(String columnLabel) throws SQLException {
		return backend.getNString(columnLabel);
	}

	public Reader getNCharacterStream(int columnIndex) throws SQLException {
		return backend.getNCharacterStream(columnIndex);
	}

	public Reader getNCharacterStream(String columnLabel) throws SQLException {
		return backend.getNCharacterStream(columnLabel);
	}

	public void updateNCharacterStream(int columnIndex, Reader x, long length) throws SQLException {
		backend.updateNCharacterStream(columnIndex, x, length);
	}

	public void updateNCharacterStream(String columnLabel, Reader reader, long length) throws SQLException {
		backend.updateNCharacterStream(columnLabel, reader, length);
	}

	public void updateAsciiStream(int columnIndex, InputStream x, long length) throws SQLException {
		backend.updateAsciiStream(columnIndex, x, length);
	}

	public void updateBinaryStream(int columnIndex, InputStream x, long length) throws SQLException {
		backend.updateBinaryStream(columnIndex, x, length);
	}

	public void updateCharacterStream(int columnIndex, Reader x, long length) throws SQLException {
		backend.updateCharacterStream(columnIndex, x, length);
	}

	public void updateAsciiStream(String columnLabel, InputStream x, long length) throws SQLException {
		backend.updateAsciiStream(columnLabel, x, length);
	}

	public void updateBinaryStream(String columnLabel, InputStream x, long length) throws SQLException {
		backend.updateBinaryStream(columnLabel, x, length);
	}

	public void updateCharacterStream(String columnLabel, Reader reader, long length) throws SQLException {
		backend.updateCharacterStream(columnLabel, reader, length);
	}

	public void updateBlob(int columnIndex, InputStream inputStream, long length) throws SQLException {
		backend.updateBlob(columnIndex, inputStream, length);
	}

	public void updateBlob(String columnLabel, InputStream inputStream, long length) throws SQLException {
		backend.updateBlob(columnLabel, inputStream, length);
	}

	public void updateClob(int columnIndex, Reader reader, long length) throws SQLException {
		backend.updateClob(columnIndex, reader, length);
	}

	public void updateClob(String columnLabel, Reader reader, long length) throws SQLException {
		backend.updateClob(columnLabel, reader, length);
	}

	public void updateNClob(int columnIndex, Reader reader, long length) throws SQLException {
		backend.updateNClob(columnIndex, reader, length);
	}

	public void updateNClob(String columnLabel, Reader reader, long length) throws SQLException {
		backend.updateNClob(columnLabel, reader, length);
	}

	public void updateNCharacterStream(int columnIndex, Reader x) throws SQLException {
		backend.updateNCharacterStream(columnIndex, x);
	}

	public void updateNCharacterStream(String columnLabel, Reader reader) throws SQLException {
		backend.updateNCharacterStream(columnLabel, reader);
	}

	public void updateAsciiStream(int columnIndex, InputStream x) throws SQLException {
		backend.updateAsciiStream(columnIndex, x);
	}

	public void updateBinaryStream(int columnIndex, InputStream x) throws SQLException {
		backend.updateBinaryStream(columnIndex, x);
	}

	public void updateCharacterStream(int columnIndex, Reader x) throws SQLException {
		backend.updateCharacterStream(columnIndex, x);
	}

	public void updateAsciiStream(String columnLabel, InputStream x) throws SQLException {
		backend.updateAsciiStream(columnLabel, x);
	}

	public void updateBinaryStream(String columnLabel, InputStream x) throws SQLException {
		backend.updateBinaryStream(columnLabel, x);
	}

	public void updateCharacterStream(String columnLabel, Reader reader) throws SQLException {
		backend.updateCharacterStream(columnLabel, reader);
	}

	public void updateBlob(int columnIndex, InputStream inputStream) throws SQLException {
		backend.updateBlob(columnIndex, inputStream);
	}

	public void updateBlob(String columnLabel, InputStream inputStream) throws SQLException {
		backend.updateBlob(columnLabel, inputStream);
	}

	public void updateClob(int columnIndex, Reader reader) throws SQLException {
		backend.updateClob(columnIndex, reader);
	}

	public void updateClob(String columnLabel, Reader reader) throws SQLException {
		backend.updateClob(columnLabel, reader);
	}

	public void updateNClob(int columnIndex, Reader reader) throws SQLException {
		backend.updateNClob(columnIndex, reader);
	}

	public void updateNClob(String columnLabel, Reader reader) throws SQLException {
		backend.updateNClob(columnLabel, reader);
	}

	public <T> T getObject(int columnIndex, Class<T> type) throws SQLException {
		return backend.getObject(columnIndex, type);
	}

	public <T> T getObject(String columnLabel, Class<T> type) throws SQLException {
		return backend.getObject(columnLabel, type);
	}

	public void updateObject(int columnIndex, Object x, SQLType targetSqlType, int scaleOrLength) throws SQLException {
		backend.updateObject(columnIndex, x, targetSqlType, scaleOrLength);
	}

	public void updateObject(String columnLabel, Object x, SQLType targetSqlType, int scaleOrLength)
			throws SQLException {
		backend.updateObject(columnLabel, x, targetSqlType, scaleOrLength);
	}

	public void updateObject(int columnIndex, Object x, SQLType targetSqlType) throws SQLException {
		backend.updateObject(columnIndex, x, targetSqlType);
	}

	public void updateObject(String columnLabel, Object x, SQLType targetSqlType) throws SQLException {
		backend.updateObject(columnLabel, x, targetSqlType);
	}

}