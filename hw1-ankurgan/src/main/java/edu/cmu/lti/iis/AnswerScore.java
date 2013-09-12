

/* First created by JCasGen Wed Sep 11 20:40:55 EDT 2013 */
package edu.cmu.lti.iis;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** Stores the score and confidence of the total score for an asnwer, and the source of the scoring annotator
 * Updated by JCasGen Wed Sep 11 20:45:07 EDT 2013
 * XML source: C:/Users/gandhe/git/hw1-ankurgan/hw1-ankurgan/src/main/resources/hw1-ankurgan-typesystem.xml
 * @generated */
public class AnswerScore extends BaseAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnswerScore.class);
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
  protected AnswerScore() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public AnswerScore(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public AnswerScore(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public AnswerScore(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: value

  /** getter for value - gets Records the value of the score of an answer
   * @generated */
  public float getValue() {
    if (AnswerScore_Type.featOkTst && ((AnswerScore_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "edu.cmu.lti.iis.AnswerScore");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((AnswerScore_Type)jcasType).casFeatCode_value);}
    
  /** setter for value - sets Records the value of the score of an answer 
   * @generated */
  public void setValue(float v) {
    if (AnswerScore_Type.featOkTst && ((AnswerScore_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "edu.cmu.lti.iis.AnswerScore");
    jcasType.ll_cas.ll_setFloatValue(addr, ((AnswerScore_Type)jcasType).casFeatCode_value, v);}    
  }

    