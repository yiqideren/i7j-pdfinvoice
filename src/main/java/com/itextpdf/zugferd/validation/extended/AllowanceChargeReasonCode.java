/*
    This file is part of the iText (R) project.
    Copyright (c) 1998-2017 iText Group NV
    Authors: Bruno Lowagie, et al.
    
    This program is free software; you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License version 3
    as published by the Free Software Foundation with the addition of the
    following permission added to Section 15 as permitted in Section 7(a):
    FOR ANY PART OF THE COVERED WORK IN WHICH THE COPYRIGHT IS OWNED BY
    ITEXT GROUP. ITEXT GROUP DISCLAIMS THE WARRANTY OF NON INFRINGEMENT
    OF THIRD PARTY RIGHTS
    
    This program is distributed in the hope that it will be useful, but
    WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
    or FITNESS FOR A PARTICULAR PURPOSE.
    See the GNU Affero General Public License for more details.
    You should have received a copy of the GNU Affero General Public License
    along with this program; if not, see http://www.gnu.org/licenses or write to
    the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
    Boston, MA, 02110-1301 USA, or download the license from the following URL:
    http://itextpdf.com/terms-of-use/
    
    The interactive user interfaces in modified source and object code versions
    of this program must display Appropriate Legal Notices, as required under
    Section 5 of the GNU Affero General Public License.
    
    In accordance with Section 7(b) of the GNU Affero General Public License,
    a covered work must retain the producer line in every PDF that is created
    or manipulated using iText.
    
    You can be released from the requirements of the license by purchasing
    a commercial license. Buying such a license is mandatory as soon as you
    develop commercial activities involving the iText software without
    disclosing the source code of your own applications.
    These activities include: offering paid services to customers as an ASP,
    serving PDFs on the fly in a web application, shipping iText with a closed
    source product.
    
    For more information, please contact iText Software Corp. at this
    address: sales@itextpdf.com
 */
package com.itextpdf.zugferd.validation.extended;

import com.itextpdf.zugferd.validation.CodeValidation;

/**
 * Series of codes that can be used for allowance charge reasons.
 * These codes are used only in the context of the Extended profile.
 */
public class AllowanceChargeReasonCode extends CodeValidation {

    /** The Constant ADVERTISING. */
    public static final String ADVERTISING = "AA";
    
    /** The Constant OTHER_SERVICES. */
    public static final String OTHER_SERVICES = "ADR";
    
    /** The Constant COLLECTION_AND_RECYCLING. */
    public static final String COLLECTION_AND_RECYCLING = "AEO";
    
    /** The Constant DISCOUNT. */
    public static final String DISCOUNT = "DI";
    
    /** The Constant EARLY_PAYMENT_ALLOWANCE. */
    public static final String EARLY_PAYMENT_ALLOWANCE = "EAB";
    
    /** The Constant FREIGHT_SERVICE. */
    public static final String FREIGHT_SERVICE = "FC";
    
    /** The Constant INSURANCE. */
    public static final String INSURANCE = "IN";
    
    /** The Constant MINIMUM_BILLING_CHARGE. */
    public static final String MINIMUM_BILLING_CHARGE = "MAC";
    
    /** The Constant NON_RETURNABLE_CONTAINERS. */
    public static final String NON_RETURNABLE_CONTAINERS = "NAA";
    
    /** The Constant PACKING. */
    public static final String PACKING = "PC";
    
    /** The Constant REBATE. */
    public static final String REBATE = "RAA";
    
    /** The Constant SPECIAL_HANDLING. */
    public static final String SPECIAL_HANDLING = "SH";

    /* (non-Javadoc)
     * @see com.itextpdf.zugferd.validation.CodeValidation#isValid(java.lang.String)
     */
    public boolean isValid(String code) {
        return code.equals(ADVERTISING)
                || code.equals(OTHER_SERVICES)
                || code.equals(COLLECTION_AND_RECYCLING)
                || code.equals(DISCOUNT)
                || code.equals(EARLY_PAYMENT_ALLOWANCE)
                || code.equals(FREIGHT_SERVICE)
                || code.equals(INSURANCE)
                || code.equals(MINIMUM_BILLING_CHARGE)
                || code.equals(NON_RETURNABLE_CONTAINERS)
                || code.equals(PACKING)
                || code.equals(REBATE)
                || code.equals(SPECIAL_HANDLING);
    }
}
