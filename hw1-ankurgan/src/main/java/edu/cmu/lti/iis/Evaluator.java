

/* First created by JCasGen Wed Sep 11 18:28:42 EDT 2013 */
package edu.cmu.lti.iis;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;


/** It stores the metric of evaluation of the performance in a given test element - precision at N, etc.
 * Updated by JCasGen Wed Sep 11 20:45:07 EDT 2013
 * XML source: C:/Users/gandhe/git/hw1-ankurgan/hw1-ankurgan/src/main/resources/hw1-ankurgan-typesystem.xml
 * @generated */
public class Evaluator extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Evaluator.class);
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
  protected Evaluator() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Evaluator(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Evaluator(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: precisionAtN

  /** getter for precisionAtN - gets Stores the score of precision at N, where N in number of correct answers in a given test element
   * @generated */
  public float getPrecisionAtN() {
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_precisionAtN == null)
      jcasType.jcas.throwFeatMissing("precisionAtN", "edu.cmu.lti.iis.Evaluator");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((Evaluator_Type)jcasType).casFeatCode_precisionAtN);}
    
  /** setter for precisionAtN - sets Stores the score of precision at N, where N in number of correct answers in a given test element 
   * @generated */
  public void setPrecisionAtN(float v) {
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_precisionAtN == null)
      jcasType.jcas.throwFeatMissing("precisionAtN", "edu.cmu.lti.iis.Evaluator");
    jcasType.ll_cas.ll_setFloatValue(addr, ((Evaluator_Type)jcasType).casFeatCode_precisionAtN, v);}    
   
    
  //*--------------*
  //* Feature: n

  /** getter for n - gets The value of number of correct answers. Stored for debugging perposes
   * @generated */
  public int getN() {
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_n == null)
      jcasType.jcas.throwFeatMissing("n", "edu.cmu.lti.iis.Evaluator");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Evaluator_Type)jcasType).casFeatCode_n);}
    
  /** setter for n - sets The value of number of correct answers. Stored for debugging perposes 
   * @generated */
  public void setN(int v) {
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_n == null)
      jcasType.jcas.throwFeatMissing("n", "edu.cmu.lti.iis.Evaluator");
    jcasType.ll_cas.ll_setIntValue(addr, ((Evaluator_Type)jcasType).casFeatCode_n, v);}    
  }

    