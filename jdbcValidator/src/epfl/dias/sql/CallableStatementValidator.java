package epfl.dias.sql;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.*;
import java.util.Calendar;
import java.util.Map;

/**
 * Created by torcato on 01-06-2015.
 */
public class CallableStatementValidator extends PreparedStatementValidator implements CallableStatement
{

    /**
     * The real underlying CallableStatement that this CallableStatementSpy wraps.
     */
    private CallableStatement realCallableStatement;

    /**
     * Get the real underlying CallableStatement that this CallableStatementSpy wraps.
     *
     * @return the real underlying CallableStatement.
     */
    public CallableStatement getRealCallableStatement()
    {
        return realCallableStatement;
    }

    /**
     * Create a CallableStatementSpy (JDBC 4 version) to spy upon a CallableStatement.
     *
     * @param sql                   The SQL used for this CallableStatement
     * @param connection         The ConnectionSpy which produced this CallableStatementSpy
     * @param realCallableStatement The real CallableStatement that is being spied upon
     */
    public CallableStatementValidator(String sql, ConnectionValidator connection,
                                CallableStatement realCallableStatement)
    {
        super(sql, connection, realCallableStatement);
        this.realCallableStatement = realCallableStatement;
    }

    public String getClassType()
    {
        return "CallableStatement";
    }

    // forwarding methods
    @Override
    public Date getDate(int parameterIndex) throws SQLException
    {
        return realCallableStatement.getDate(parameterIndex);
    }

    @Override
    public Date getDate(int parameterIndex, Calendar cal) throws SQLException
    {
        return realCallableStatement.getDate(parameterIndex, cal);
    }

    @Override
    public Ref getRef(String parameterName) throws SQLException
    {
        return realCallableStatement.getRef(parameterName);
    }

    @Override
    public Time getTime(String parameterName) throws SQLException
    {
        return realCallableStatement.getTime(parameterName);
    }

    @Override
    public void setTime(String parameterName, Time x) throws SQLException
    {
        realCallableStatement.setTime(parameterName, x);
    }

    @Override
    public Blob getBlob(int i) throws SQLException
    {
        return realCallableStatement.getBlob(i);
    }

    @Override
    public Clob getClob(int i) throws SQLException
    {
        return realCallableStatement.getClob(i);
    }

    @Override
    public Array getArray(int i) throws SQLException
    {
        return realCallableStatement.getArray(i);
    }

    @Override
    public byte[] getBytes(int parameterIndex) throws SQLException
    {
        return realCallableStatement.getBytes(parameterIndex);
    }

    @Override
    public double getDouble(int parameterIndex) throws SQLException
    {
        return realCallableStatement.getDouble(parameterIndex);
    }

    @Override
    public int getInt(int parameterIndex) throws SQLException
    {
        return realCallableStatement.getInt(parameterIndex);
    }

    @Override
    public boolean wasNull() throws SQLException
    {
        return realCallableStatement.wasNull();
    }

    @Override
    public Time getTime(int parameterIndex) throws SQLException
    {
        return realCallableStatement.getTime(parameterIndex);
    }

    @Override
    public Time getTime(int parameterIndex, Calendar cal) throws SQLException
    {
        return realCallableStatement.getTime(parameterIndex, cal);
    }

    @Override
    public Timestamp getTimestamp(String parameterName) throws SQLException
    {
        return realCallableStatement.getTimestamp(parameterName);
    }

    @Override
    public void setTimestamp(String parameterName, Timestamp x) throws SQLException
    {
        realCallableStatement.setTimestamp(parameterName, x);
    }

    @Override
    public String getString(int parameterIndex) throws SQLException
    {
        return realCallableStatement.getString(parameterIndex);
    }

    @Override
    public void registerOutParameter(int parameterIndex, int sqlType) throws SQLException
    {
        realCallableStatement.registerOutParameter(parameterIndex, sqlType);
    }

    @Override
    public void registerOutParameter(int parameterIndex, int sqlType, int scale) throws SQLException
    {
        realCallableStatement.registerOutParameter(parameterIndex, sqlType, scale);
    }

    @Override
    public void registerOutParameter(int paramIndex, int sqlType, String typeName) throws SQLException
    {
        realCallableStatement.registerOutParameter(paramIndex, sqlType, typeName);
    }

    @Override
    public byte getByte(String parameterName) throws SQLException
    {
        return realCallableStatement.getByte(parameterName);
    }

    @Override
    public double getDouble(String parameterName) throws SQLException
    {
        return realCallableStatement.getDouble(parameterName);
    }

    @Override
    public float getFloat(String parameterName) throws SQLException
    {
        return realCallableStatement.getFloat(parameterName);
    }

    @Override
    public int getInt(String parameterName) throws SQLException
    {
        return realCallableStatement.getInt(parameterName);
    }

    @Override
    public long getLong(String parameterName) throws SQLException
    {
        return realCallableStatement.getLong(parameterName);
    }

    @Override
    public short getShort(String parameterName) throws SQLException
    {
        return realCallableStatement.getShort(parameterName);
    }

    @Override
    public boolean getBoolean(String parameterName) throws SQLException
    {
        return realCallableStatement.getBoolean(parameterName);
    }

    @Override
    public byte[] getBytes(String parameterName) throws SQLException
    {
        return realCallableStatement.getBytes(parameterName);
    }

    @Override
    public void setByte(String parameterName, byte x) throws SQLException
    {
        realCallableStatement.setByte(parameterName, x);
    }

    @Override
    public void setDouble(String parameterName, double x) throws SQLException
    {
        realCallableStatement.setDouble(parameterName , x);
    }

    @Override
    public void setFloat(String parameterName, float x) throws SQLException
    {
        realCallableStatement.setFloat(parameterName, x);
    }

    @Override
    public void registerOutParameter(String parameterName, int sqlType) throws SQLException
    {
        realCallableStatement.registerOutParameter(parameterName, sqlType);
    }

    @Override
    public void setInt(String parameterName, int x) throws SQLException
    {
        realCallableStatement.setInt(parameterName, x);
    }

    @Override
    public void setNull(String parameterName, int sqlType) throws SQLException
    {
        realCallableStatement.setNull(parameterName, sqlType);
    }

    @Override
    public void registerOutParameter(String parameterName, int sqlType, int scale) throws SQLException
    {
        realCallableStatement.registerOutParameter(parameterName, sqlType, scale);
    }

    @Override
    public void setLong(String parameterName, long x) throws SQLException
    {
        realCallableStatement.setLong(parameterName, x);
    }

    @Override
    public void setShort(String parameterName, short x) throws SQLException
    {
        realCallableStatement.setShort(parameterName, x);
    }

    @Override
    public void setBoolean(String parameterName, boolean x) throws SQLException
    {
        realCallableStatement.setBoolean(parameterName, x);
    }

    @Override
    public void setBytes(String parameterName, byte[] x) throws SQLException
    {
        realCallableStatement.setBytes(parameterName, x);
    }

    @Override
    public boolean getBoolean(int parameterIndex) throws SQLException
    {
        return realCallableStatement.getBoolean(parameterIndex);
    }

    @Override
    public Timestamp getTimestamp(int parameterIndex) throws SQLException
    {
        return realCallableStatement.getTimestamp(parameterIndex);
    }

    @Override
    public void setAsciiStream(String parameterName, InputStream x, int length) throws SQLException
    {
        realCallableStatement.setAsciiStream(parameterName, x, length);
    }

    @Override
    public void setBinaryStream(String parameterName, InputStream x, int length) throws SQLException
    {
        realCallableStatement.setBinaryStream(parameterName, x, length);
    }

    @Override
    public void setCharacterStream(String parameterName, Reader reader, int length) throws SQLException
    {
        realCallableStatement.setCharacterStream(parameterName, reader, length);
    }

    @Override
    public Object getObject(String parameterName) throws SQLException
    {
        return realCallableStatement.getObject(parameterName);
    }

    @Override
    public void setObject(String parameterName, Object x) throws SQLException
    {
        realCallableStatement.setObject(parameterName, x);
    }

    @Override
    public void setObject(String parameterName, Object x, int targetSqlType) throws SQLException
    {
        realCallableStatement.setObject(parameterName, x, targetSqlType);
    }

    @Override
    public void setObject(String parameterName, Object x, int targetSqlType, int scale) throws SQLException
    {
        realCallableStatement.setObject(parameterName, x, targetSqlType, scale);
    }

    @Override
    public Timestamp getTimestamp(int parameterIndex, Calendar cal) throws SQLException
    {
        return realCallableStatement.getTimestamp(parameterIndex, cal);
    }

    @Override
    public Date getDate(String parameterName, Calendar cal) throws SQLException
    {
        return realCallableStatement.getDate(parameterName, cal);
    }

    @Override
    public Time getTime(String parameterName, Calendar cal) throws SQLException
    {
        return realCallableStatement.getTime(parameterName, cal);
    }

    @Override
    public Timestamp getTimestamp(String parameterName, Calendar cal) throws SQLException
    {
        return realCallableStatement.getTimestamp(parameterName, cal);
    }

    @Override
    public void setDate(String parameterName, Date x, Calendar cal) throws SQLException
    {
        realCallableStatement.setDate(parameterName, x, cal);
    }

    @Override
    public void setTime(String parameterName, Time x, Calendar cal) throws SQLException
    {
        realCallableStatement.setTime(parameterName, x, cal);
    }

    @Override
    public void setTimestamp(String parameterName, Timestamp x, Calendar cal) throws SQLException
    {
        realCallableStatement.setTimestamp(parameterName, x, cal);
    }

    @Override
    public short getShort(int parameterIndex) throws SQLException
    {
        return realCallableStatement.getShort(parameterIndex);
    }

    @Override
    public long getLong(int parameterIndex) throws SQLException
    {
        return realCallableStatement.getLong(parameterIndex);
    }

    @Override
    public float getFloat(int parameterIndex) throws SQLException
    {
        return realCallableStatement.getFloat(parameterIndex);
    }

    @Override
    public Ref getRef(int i) throws SQLException
    {
        return realCallableStatement.getRef(i);
    }

    /**
     * @deprecated
     */
    @Override
    public BigDecimal getBigDecimal(int parameterIndex, int scale) throws SQLException
    {
        return realCallableStatement.getBigDecimal(parameterIndex, scale);
    }

    @Override
    public URL getURL(int parameterIndex) throws SQLException
    {
        return realCallableStatement.getURL(parameterIndex);

    }

    @Override
    public BigDecimal getBigDecimal(int parameterIndex) throws SQLException
    {
        return realCallableStatement.getBigDecimal(parameterIndex);
    }

    @Override
    public byte getByte(int parameterIndex) throws SQLException
    {
        return realCallableStatement.getByte(parameterIndex);
    }

    @Override
    public Object getObject(int parameterIndex) throws SQLException
    {
        return realCallableStatement.getObject(parameterIndex);
    }

    @Override
    public Object getObject(int i, Map<String,Class<?>> map) throws SQLException
    {
        return realCallableStatement.getObject(i, map);
    }

    @Override
    public String getString(String parameterName) throws SQLException
    {
        return realCallableStatement.getString(parameterName);
    }

    @Override
    public void registerOutParameter(String parameterName, int sqlType, String typeName) throws SQLException
    {
        realCallableStatement.registerOutParameter(parameterName, sqlType, typeName);
    }

    @Override
    public void setNull(String parameterName, int sqlType, String typeName) throws SQLException
    {
        realCallableStatement.setNull(parameterName, sqlType, typeName);
    }

    @Override
    public void setString(String parameterName, String x) throws SQLException
    {
        realCallableStatement.setString(parameterName, x);
    }

    @Override
    public BigDecimal getBigDecimal(String parameterName) throws SQLException
    {
        return realCallableStatement.getBigDecimal(parameterName);
    }

    @Override
    public Object getObject(String parameterName, Map<String, Class<?>> map) throws SQLException {
        return realCallableStatement.getObject(parameterName, map);
    }

    @Override
    public void setBigDecimal(String parameterName, BigDecimal x) throws SQLException
    {
        realCallableStatement.setBigDecimal(parameterName, x);
    }

    @Override
    public URL getURL(String parameterName) throws SQLException
    {
        return realCallableStatement.getURL(parameterName);
    }

    @Override
    public RowId getRowId(int parameterIndex) throws SQLException {
        return realCallableStatement.getRowId(parameterIndex);
    }

    @Override
    public RowId getRowId(String parameterName) throws SQLException {
        return realCallableStatement.getRowId(parameterName);
    }

    @Override
    public void setRowId(String parameterName, RowId x) throws SQLException {
        realCallableStatement.setRowId(parameterName, x);
    }

    @Override
    public void setNString(String parameterName, String value) throws SQLException {
        realCallableStatement.setNString(parameterName, value);
    }

    @Override
    public void setNCharacterStream(String parameterName, Reader reader, long length) throws SQLException {
        realCallableStatement.setNCharacterStream(parameterName, reader, length);
    }

    @Override
    public void setNClob(String parameterName, NClob value) throws SQLException {
        String methodCall = "setNClob(" + parameterName + ", " + value + ")";
        try
        {
            realCallableStatement.setNClob(parameterName, value);
        }
        catch (SQLException s)
        {
            reportException(methodCall, s);
            throw s;
        }
        reportReturn(methodCall);
    }

    @Override
    public void setClob(String parameterName, Reader reader, long length) throws SQLException {
        String methodCall = "setClob(" + parameterName + ", " + reader + ", " + length + ")";
        try
        {
            realCallableStatement.setClob(parameterName, reader, length);
        }
        catch (SQLException s)
        {
            reportException(methodCall, s);
            throw s;
        }
        reportReturn(methodCall);
    }

    @Override
    public void setBlob(String parameterName, InputStream inputStream, long length) throws SQLException {
        String methodCall = "setBlob(" + parameterName + ", " + inputStream + ", " + length + ")";
        try
        {
            realCallableStatement.setBlob(parameterName, inputStream, length);
        }
        catch (SQLException s)
        {
            reportException(methodCall, s);
            throw s;
        }
        reportReturn(methodCall);
    }

    @Override
    public void setNClob(String parameterName, Reader reader, long length) throws SQLException {
        String methodCall = "setNClob(" + parameterName + ", " + reader + ", " + length + ")";
        try
        {
            realCallableStatement.setNClob(parameterName, reader, length);
        }
        catch (SQLException s)
        {
            reportException(methodCall, s);
            throw s;
        }
        reportReturn(methodCall);
    }

    @Override
    public NClob getNClob(int parameterIndex) throws SQLException {
        String methodCall = "getNClob(" + parameterIndex + ")";
        try
        {
            return (NClob) reportReturn(methodCall, realCallableStatement.getNClob(parameterIndex));
        }
        catch (SQLException s)
        {
            reportException(methodCall, s);
            throw s;
        }
    }

    @Override
    public NClob getNClob(String parameterName) throws SQLException {
        String methodCall = "getNClob(" + parameterName + ")";
        try
        {
            return (NClob) reportReturn(methodCall, realCallableStatement.getNClob(parameterName));
        }
        catch (SQLException s)
        {
            reportException(methodCall, s);
            throw s;
        }
    }

    @Override
    public void setSQLXML(String parameterName, SQLXML xmlObject) throws SQLException {
        String methodCall = "setSQLXML(" + parameterName + ", " + xmlObject + ")";
        try
        {
            realCallableStatement.setSQLXML(parameterName, xmlObject);
        }
        catch (SQLException s)
        {
            reportException(methodCall, s);
            throw s;
        }
        reportReturn(methodCall);
    }

    @Override
    public SQLXML getSQLXML(int parameterIndex) throws SQLException {
        String methodCall = "getSQLXML(" + parameterIndex + ")";
        try
        {
            return (SQLXML) reportReturn(methodCall, realCallableStatement.getSQLXML(parameterIndex));
        }
        catch (SQLException s)
        {
            reportException(methodCall, s);
            throw s;
        }
    }

    @Override
    public SQLXML getSQLXML(String parameterName) throws SQLException {
        String methodCall = "getSQLXML(" + parameterName + ")";
        try
        {
            return (SQLXML) reportReturn(methodCall, realCallableStatement.getSQLXML(parameterName));
        }
        catch (SQLException s)
        {
            reportException(methodCall, s);
            throw s;
        }

    }

    @Override
    public String getNString(int parameterIndex) throws SQLException {
        String methodCall = "getNString(" + parameterIndex + ")";
        try
        {
            return (String) reportReturn(methodCall, realCallableStatement.getNString(parameterIndex));
        }
        catch (SQLException s)
        {
            reportException(methodCall, s);
            throw s;
        }
    }

    @Override
    public String getNString(String parameterName) throws SQLException {
        String methodCall = "getNString(" + parameterName + ")";
        try
        {
            return (String) reportReturn(methodCall, realCallableStatement.getNString(parameterName));
        }
        catch (SQLException s)
        {
            reportException(methodCall, s);
            throw s;
        }
    }

    @Override
    public Reader getNCharacterStream(int parameterIndex) throws SQLException {
        String methodCall = "getNCharacterStream(" + parameterIndex + ")";
        try
        {
            return (Reader) reportReturn(methodCall, realCallableStatement.getNCharacterStream(parameterIndex));
        }
        catch (SQLException s)
        {
            reportException(methodCall, s);
            throw s;
        }
    }

    @Override
    public Reader getNCharacterStream(String parameterName) throws SQLException {
        String methodCall = "getNCharacterStream(" + parameterName + ")";
        try
        {
            return (Reader) reportReturn(methodCall, realCallableStatement.getNCharacterStream(parameterName));
        }
        catch (SQLException s)
        {
            reportException(methodCall, s);
            throw s;
        }
    }

    @Override
    public Reader getCharacterStream(int parameterIndex) throws SQLException {
        String methodCall = "getCharacterStream(" + parameterIndex + ")";
        try
        {
            return (Reader) reportReturn(methodCall, realCallableStatement.getCharacterStream(parameterIndex));
        }
        catch (SQLException s)
        {
            reportException(methodCall, s);
            throw s;
        }
    }

    @Override
    public Reader getCharacterStream(String parameterName) throws SQLException {
        String methodCall = "getCharacterStream(" + parameterName + ")";
        try
        {
            return (Reader) reportReturn(methodCall, realCallableStatement.getCharacterStream(parameterName));
        }
        catch (SQLException s)
        {
            reportException(methodCall, s);
            throw s;
        }
    }

    @Override
    public void setBlob(String parameterName, Blob x) throws SQLException {
        String methodCall = "setBlob(" + parameterName + ", " + x + ")";
        try
        {
            realCallableStatement.setBlob(parameterName, x);
        }
        catch (SQLException s)
        {
            reportException(methodCall, s);
            throw s;
        }
        reportReturn(methodCall);
    }

    @Override
    public void setClob(String parameterName, Clob x) throws SQLException {
        String methodCall = "setClob(" + parameterName + ", " + x + ")";
        try
        {
            realCallableStatement.setClob(parameterName, x);
        }
        catch (SQLException s)
        {
            reportException(methodCall, s);
            throw s;
        }
        reportReturn(methodCall);
    }

    @Override
    public void setAsciiStream(String parameterName, InputStream x, long length) throws SQLException {
        String methodCall = "setAsciiStream(" + parameterName + ", " + x + ", " + length + ")";
        try
        {
            realCallableStatement.setAsciiStream(parameterName, x, length);
        }
        catch (SQLException s)
        {
            reportException(methodCall, s);
            throw s;
        }
        reportReturn(methodCall);
    }

    @Override
    public void setBinaryStream(String parameterName, InputStream x, long length) throws SQLException {
        String methodCall = "setBinaryStream(" + parameterName + ", " + x + ", " + length + ")";
        try
        {
            realCallableStatement.setBinaryStream(parameterName, x, length);
        }
        catch (SQLException s)
        {
            reportException(methodCall, s);
            throw s;
        }
        reportReturn(methodCall);
    }

    @Override
    public void setCharacterStream(String parameterName, Reader reader, long length) throws SQLException {
        String methodCall = "setCharacterStream(" + parameterName + ", " + reader + ", " + length + ")";
        try
        {
            realCallableStatement.setCharacterStream(parameterName, reader, length);
        }
        catch (SQLException s)
        {
            reportException(methodCall, s);
            throw s;
        }
        reportReturn(methodCall);
    }

    @Override
    public void setAsciiStream(String parameterName, InputStream x) throws SQLException {
        String methodCall = "setAsciiStream(" + parameterName + ", " + x + ")";
        try
        {
            realCallableStatement.setAsciiStream(parameterName, x);
        }
        catch (SQLException s)
        {
            reportException(methodCall, s);
            throw s;
        }
        reportReturn(methodCall);
    }

    @Override
    public void setBinaryStream(String parameterName, InputStream x) throws SQLException {
        String methodCall = "setBinaryStream(" + parameterName + ", " + x + ")";
        try
        {
            realCallableStatement.setBinaryStream(parameterName, x);
        }
        catch (SQLException s)
        {
            reportException(methodCall, s);
            throw s;
        }
        reportReturn(methodCall);
    }

    @Override
    public void setCharacterStream(String parameterName, Reader reader) throws SQLException {
        String methodCall = "setCharacterStream(" + parameterName + ", " + reader + ")";
        try
        {
            realCallableStatement.setCharacterStream(parameterName, reader);
        }
        catch (SQLException s)
        {
            reportException(methodCall, s);
            throw s;
        }
        reportReturn(methodCall);
    }

    @Override
    public void setNCharacterStream(String parameterName, Reader reader) throws SQLException {
        String methodCall = "setNCharacterStream(" + parameterName + ", " + reader + ")";
        try
        {
            realCallableStatement.setNCharacterStream(parameterName, reader);
        }
        catch (SQLException s)
        {
            reportException(methodCall, s);
            throw s;
        }
        reportReturn(methodCall);
    }

    @Override
    public void setClob(String parameterName, Reader reader) throws SQLException {
        String methodCall = "setClob(" + parameterName + ", " + reader + ")";
        try
        {
            realCallableStatement.setClob(parameterName, reader);
        }
        catch (SQLException s)
        {
            reportException(methodCall, s);
            throw s;
        }
        reportReturn(methodCall);
    }

    @Override
    public void setBlob(String parameterName, InputStream inputStream) throws SQLException {
        String methodCall = "setBlob(" + parameterName + ", " + inputStream + ")";
        try
        {
            realCallableStatement.setBlob(parameterName, inputStream);
        }
        catch (SQLException s)
        {
            reportException(methodCall, s);
            throw s;
        }
        reportReturn(methodCall);
    }

    @Override
    public void setNClob(String parameterName, Reader reader) throws SQLException {
        String methodCall = "setNClob(" + parameterName + ", " + reader + ")";
        try
        {
            realCallableStatement.setNClob(parameterName, reader);
        }
        catch (SQLException s)
        {
            reportException(methodCall, s);
            throw s;
        }
        reportReturn(methodCall);
    }

    @Override
    public void setURL(String parameterName, URL val) throws SQLException
    {
        String methodCall = "setURL(" + parameterName + ", " + val + ")";
        try
        {
            realCallableStatement.setURL(parameterName, val);
        }
        catch (SQLException s)
        {
            reportException(methodCall, s);
            throw s;
        }
        reportReturn(methodCall);
    }

    @Override
    public Array getArray(String parameterName) throws SQLException
    {
        String methodCall = "getArray(" + parameterName + ")";
        try
        {
            return (Array) reportReturn(methodCall, realCallableStatement.getArray(parameterName));
        }
        catch (SQLException s)
        {
            reportException(methodCall, s);
            throw s;
        }
    }

    @Override
    public Blob getBlob(String parameterName) throws SQLException
    {
        String methodCall = "getBlob(" + parameterName + ")";
        try
        {
            return (Blob) reportReturn(methodCall, realCallableStatement.getBlob(parameterName));
        }
        catch (SQLException s)
        {
            reportException(methodCall, s);
            throw s;
        }
    }

    @Override
    public Clob getClob(String parameterName) throws SQLException
    {
        String methodCall = "getClob(" + parameterName + ")";
        try
        {
            return (Clob) reportReturn(methodCall, realCallableStatement.getClob(parameterName));
        }
        catch (SQLException s)
        {
            reportException(methodCall, s);
            throw s;
        }
    }

    @Override
    public Date getDate(String parameterName) throws SQLException
    {
        String methodCall = "getDate(" + parameterName + ")";
        try
        {
            return (Date) reportReturn(methodCall, realCallableStatement.getDate(parameterName));
        }
        catch (SQLException s)
        {
            reportException(methodCall, s);
            throw s;
        }
    }

    @Override
    public void setDate(String parameterName, Date x) throws SQLException
    {
        String methodCall = "setDate(" + parameterName + ", " + x + ")";
        try
        {
            realCallableStatement.setDate(parameterName, x);
        }
        catch (SQLException s)
        {
            reportException(methodCall, s);
            throw s;
        }
        reportReturn(methodCall);
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        String methodCall = "unwrap(" + (iface==null?"null":iface.getName()) + ")";
        try
        {
            //todo: double check this logic
            //NOTE: could call super.isWrapperFor to simplify this logic, but it would result in extra log output
            //because the super classes would be invoked, thus executing their logging methods too...
            return (T)reportReturn(methodCall,
                    (iface != null && (iface == CallableStatement.class||iface==PreparedStatement.class||
                            iface==Statement.class||iface==Spy.class))?
                            (T)this:
                            realCallableStatement.unwrap(iface));
        }
        catch (SQLException s)
        {
            reportException(methodCall,s);
            throw s;
        }
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException
    {
        String methodCall = "isWrapperFor(" + (iface==null?"null":iface.getName()) + ")";
        try
        {
            //NOTE: could call super.isWrapperFor to simplify this logic, but it would result in extra log output
            //when the super classes would be invoked..
            return reportReturn(methodCall,
                    (iface != null && (iface == CallableStatement.class||iface==PreparedStatement.class||iface==Statement.class||iface==Spy.class)) ||
                            realCallableStatement.isWrapperFor(iface));
        }
        catch (SQLException s)
        {
            reportException(methodCall,s);
            throw s;
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T> T getObject(int parameterIndex, Class<T> type) throws SQLException
    {
        String methodCall = "getObject(" + parameterIndex + "," + type+ ")";
        try
        {
            return (T) reportReturn(methodCall, realCallableStatement.getObject(parameterIndex,type));
        }
        catch (SQLException s)
        {
            reportException(methodCall, s);
            throw s;
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T> T getObject(String parameterName, Class<T> type) throws SQLException
    {
        String methodCall = "getObject(" + parameterName + "," + type+ ")";
        try
        {
            return (T) reportReturn(methodCall, realCallableStatement.getObject(parameterName,type));
        }
        catch (SQLException s)
        {
            reportException(methodCall, s);
            throw s;
        }
    }

}
