/*******************************************************************************
 * Copyright: (c)  2013  Mayo Foundation for Medical Education and 
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


/* First created by JCasGen Mon Sep 30 15:04:17 CDT 2013 */
package org.ohnlp.typesystem.type.relation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;


/** A superclass for semantic relationships between Elements.  For example, one might consider TemporalRelations or UMLSRelations between a Medication and a Disorder.  The "category" feature indicates what kind of relation it is.
 * Updated by JCasGen Mon Sep 30 15:04:17 CDT 2013
 * XML source: /MedXN_1.0/descsrc/org/ohnlp/medxn/types/MedXNTypes.xml
 * @generated */
public class Relation extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Relation.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Relation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Relation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Relation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: id

  /** getter for id - gets 
   * @generated */
  public int getId() {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "org.ohnlp.typesystem.type.relation.Relation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Relation_Type)jcasType).casFeatCode_id);}
    
  /** setter for id - sets  
   * @generated */
  public void setId(int v) {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "org.ohnlp.typesystem.type.relation.Relation");
    jcasType.ll_cas.ll_setIntValue(addr, ((Relation_Type)jcasType).casFeatCode_id, v);}    
   
    
  //*--------------*
  //* Feature: category

  /** getter for category - gets 
   * @generated */
  public String getCategory() {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_category == null)
      jcasType.jcas.throwFeatMissing("category", "org.ohnlp.typesystem.type.relation.Relation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Relation_Type)jcasType).casFeatCode_category);}
    
  /** setter for category - sets  
   * @generated */
  public void setCategory(String v) {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_category == null)
      jcasType.jcas.throwFeatMissing("category", "org.ohnlp.typesystem.type.relation.Relation");
    jcasType.ll_cas.ll_setStringValue(addr, ((Relation_Type)jcasType).casFeatCode_category, v);}    
   
    
  //*--------------*
  //* Feature: discoveryTechnique

  /** getter for discoveryTechnique - gets 
   * @generated */
  public int getDiscoveryTechnique() {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_discoveryTechnique == null)
      jcasType.jcas.throwFeatMissing("discoveryTechnique", "org.ohnlp.typesystem.type.relation.Relation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Relation_Type)jcasType).casFeatCode_discoveryTechnique);}
    
  /** setter for discoveryTechnique - sets  
   * @generated */
  public void setDiscoveryTechnique(int v) {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_discoveryTechnique == null)
      jcasType.jcas.throwFeatMissing("discoveryTechnique", "org.ohnlp.typesystem.type.relation.Relation");
    jcasType.ll_cas.ll_setIntValue(addr, ((Relation_Type)jcasType).casFeatCode_discoveryTechnique, v);}    
   
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets 
   * @generated */
  public double getConfidence() {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "org.ohnlp.typesystem.type.relation.Relation");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Relation_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets  
   * @generated */
  public void setConfidence(double v) {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "org.ohnlp.typesystem.type.relation.Relation");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Relation_Type)jcasType).casFeatCode_confidence, v);}    
   
    
  //*--------------*
  //* Feature: polarity

  /** getter for polarity - gets 
   * @generated */
  public int getPolarity() {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_polarity == null)
      jcasType.jcas.throwFeatMissing("polarity", "org.ohnlp.typesystem.type.relation.Relation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Relation_Type)jcasType).casFeatCode_polarity);}
    
  /** setter for polarity - sets  
   * @generated */
  public void setPolarity(int v) {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_polarity == null)
      jcasType.jcas.throwFeatMissing("polarity", "org.ohnlp.typesystem.type.relation.Relation");
    jcasType.ll_cas.ll_setIntValue(addr, ((Relation_Type)jcasType).casFeatCode_polarity, v);}    
   
    
  //*--------------*
  //* Feature: uncertainty

  /** getter for uncertainty - gets 
   * @generated */
  public int getUncertainty() {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_uncertainty == null)
      jcasType.jcas.throwFeatMissing("uncertainty", "org.ohnlp.typesystem.type.relation.Relation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Relation_Type)jcasType).casFeatCode_uncertainty);}
    
  /** setter for uncertainty - sets  
   * @generated */
  public void setUncertainty(int v) {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_uncertainty == null)
      jcasType.jcas.throwFeatMissing("uncertainty", "org.ohnlp.typesystem.type.relation.Relation");
    jcasType.ll_cas.ll_setIntValue(addr, ((Relation_Type)jcasType).casFeatCode_uncertainty, v);}    
  }

    