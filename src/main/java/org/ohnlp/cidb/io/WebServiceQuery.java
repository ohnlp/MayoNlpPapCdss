/*******************************************************************************
 * Copyright: (c)  2014  Mayo Foundation for Medical Education and 
 *  Research (MFMER). All rights reserved. MAYO, MAYO CLINIC, and the
 *  triple-shield Mayo logo are trademarks and service marks of MFMER.
 *   
 *  Except as contained in the copyright notice above, or as used to identify 
 *  MFMER as the author of this software, the trade names, trademarks, service
 *  marks, or product names of the copyright holder shall not be used in
 *  advertising, promotion or otherwise in connection with this software without
 *  prior written authorization of the copyright holder.
 *     
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *     
 *  http://www.apache.org/licenses/LICENSE-2.0 
 *     
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and 
 *  limitations under the License. 
 *******************************************************************************/

package org.ohnlp.cidb.io;

import java.util.HashMap;
import java.util.Map;

/*
 * @author Kavishwar Wagholikar (waghsk)
 */
public class WebServiceQuery{
	
	String recXPath;
	Map<String,String> varPathMap;
	
	public WebServiceQuery(){
	    varPathMap=new HashMap<String,String>();
	    
	    //varXPath1, String XPath2, String XPath3, String XPath4
	}   
	
	public WebServiceQuery setRecXPath(String x){
	    this.recXPath=x;
	    return this;
	}
	
	public WebServiceQuery addVarPathMap(String par,String path){
	    this.varPathMap.put(par, path);
	    return this;
	}

	public String getRecXPath() {
	    
	    return this.recXPath;
	}
	
	
	
}
