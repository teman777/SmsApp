/*
 * This file is generated by jOOQ.
 */
package com.artemvoronov.SmsApp.generated.sys.routines;


import com.artemvoronov.SmsApp.generated.sys.Sys;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * 
 * Description
 * -----------
 * 
 * Takes a raw file path, and extracts the table name from it.
 * 
 * Useful for when interacting with Performance Schema data 
 * concerning IO statistics, for example.
 * 
 * Parameters
 * -----------
 * 
 * path (    VARCHAR(512)):
 *   The full file path to a data file to extract the table name from.
 * 
 * Returns
 * -----------
 * 
 * VARCHAR(64)
 * 
 * Example
 * -----------
 * 
 * mysql&gt; SELECT sys.extract_table_from_file_name('/var/lib/mysql/employees/employee.ibd');
 * +---------------------------------------------------------------------------+
 * | sys.extract_table_from_file_name('/var/lib/mysql/employees/employee.ibd') 
 * |
 * +---------------------------------------------------------------------------+
 * | employee                                                             
 *      |
 * +---------------------------------------------------------------------------+
 * 1 row in set (    0.02 sec)
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ExtractTableFromFileName extends AbstractRoutine<String> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>sys.extract_table_from_file_name.RETURN_VALUE</code>.
     */
    public static final Parameter<String> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.VARCHAR(64), false, false);

    /**
     * The parameter <code>sys.extract_table_from_file_name.path</code>.
     */
    public static final Parameter<String> PATH = Internal.createParameter("path", SQLDataType.VARCHAR(512), false, false);

    /**
     * Create a new routine call instance
     */
    public ExtractTableFromFileName() {
        super("extract_table_from_file_name", Sys.SYS, SQLDataType.VARCHAR(64));

        setReturnParameter(RETURN_VALUE);
        addInParameter(PATH);
    }

    /**
     * Set the <code>path</code> parameter IN value to the routine
     */
    public void setPath(String value) {
        setValue(PATH, value);
    }

    /**
     * Set the <code>path</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setPath(Field<String> field) {
        setField(PATH, field);
    }
}
