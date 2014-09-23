/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2007 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.util.KeyNamePair;

/** Generated Interface for HR_Quart_Emp_Charges
 *  @author Adempiere (generated) 
 *  @version Release 3.6.0LTS
 */
public interface I_HR_Quart_Emp_Charges 
{
// Kindly do not delete below line as it is being used for svn version maintenance
public static final String svnRevision =  "$Id: I_HR_Quart_Emp_Charges.java 1009 2012-02-09 09:16:13Z suman $";

    /** TableName=HR_Quart_Emp_Charges */
    public static final String Table_Name = "HR_Quart_Emp_Charges";

    /** AD_Table_ID=9000009 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within client
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within client
	  */
	public int getAD_Org_ID();

    /** Column name Amount */
    public static final String COLUMNNAME_Amount = "Amount";

	/** Set Amount.
	  * Amount in a defined currency
	  */
	public void setAmount (BigDecimal Amount);

	/** Get Amount.
	  * Amount in a defined currency
	  */
	public BigDecimal getAmount();

    /** Column name C_BPartner_ID */
    public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";

	/** Set Employee.
	  * Identifies a Employee
	  */
	public void setC_BPartner_ID (int C_BPartner_ID);

	/** Get Employee.
	  * Identifies a Employee
	  */
	public int getC_BPartner_ID();

	public I_C_BPartner getC_BPartner() throws RuntimeException;

    /** Column name chargedate */
    public static final String COLUMNNAME_chargedate = "chargedate";

	/** Set chargedate	  */
	public void setchargedate (Timestamp chargedate);

	/** Get chargedate	  */
	public Timestamp getchargedate();

    /** Column name chargetype */
    public static final String COLUMNNAME_chargetype = "chargetype";

	/** Set chargetype	  */
	public void setchargetype (String chargetype);

	/** Get chargetype	  */
	public String getchargetype();

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name HR_Period_ID */
    public static final String COLUMNNAME_HR_Period_ID = "HR_Period_ID";

	/** Set Payroll Period	  */
	public void setHR_Period_ID (int HR_Period_ID);

	/** Get Payroll Period	  */
	public int getHR_Period_ID();

	public org.eevolution.model.I_HR_Period getHR_Period() throws RuntimeException;

    /** Column name HR_Quart_Emp_Charges_ID */
    public static final String COLUMNNAME_HR_Quart_Emp_Charges_ID = "HR_Quart_Emp_Charges_ID";

	/** Set Quarter employee charges	  */
	public void setHR_Quart_Emp_Charges_ID (int HR_Quart_Emp_Charges_ID);

	/** Get Quarter employee charges	  */
	public int getHR_Quart_Emp_Charges_ID();

    /** Column name HR_Quarter_ID */
    public static final String COLUMNNAME_HR_Quarter_ID = "HR_Quarter_ID";

	/** Set Quarter.
	  * Quarter
	  */
	public void setHR_Quarter_ID (int HR_Quarter_ID);

	/** Get Quarter.
	  * Quarter
	  */
	public int getHR_Quarter_ID();

	public I_HR_Quarter getHR_Quarter() throws RuntimeException;

    /** Column name HR_Quarter_Power_Cons_ID */
    public static final String COLUMNNAME_HR_Quarter_Power_Cons_ID = "HR_Quarter_Power_Cons_ID";

	/** Set Quarter power consumption	  */
	public void setHR_Quarter_Power_Cons_ID (int HR_Quarter_Power_Cons_ID);

	/** Get Quarter power consumption	  */
	public int getHR_Quarter_Power_Cons_ID();

	public I_HR_Quarter_Power_Cons getHR_Quarter_Power_Cons() throws RuntimeException;

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name Processed */
    public static final String COLUMNNAME_Processed = "Processed";

	/** Set Processed.
	  * The document has been processed
	  */
	public void setProcessed (boolean Processed);

	/** Get Processed.
	  * The document has been processed
	  */
	public boolean isProcessed();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();
}