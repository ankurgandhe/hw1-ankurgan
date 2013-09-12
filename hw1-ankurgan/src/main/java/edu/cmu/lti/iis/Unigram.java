

/* First created by JCasGen Wed Sep 11 20:45:07 EDT 2013 */
package edu.cmu.lti.iis;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;


/** Annotation class for storing annotations of 1-grams
 * Updated by JCasGen Wed Sep 11 20:45:07 EDT 2013
 * XML source: C:/Users/gandhe/git/hw1-ankurgan/hw1-ankurgan/src/main/resources/hw1-ankurgan-typesystem.xml
 * @generated */
public class Unigram extends BaseAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Unigram.class);
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
  protected Unigram() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Unigram(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Unigram(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Unigram(JCas jcas, int begin, int end) {
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
  //* Feature: tokenList

  /** getter for tokenList - gets Lists the tokens occuring in the n-gram
   * @generated */
  public FSList getTokenList() {
    if (Unigram_Type.featOkTst && ((Unigram_Type)jcasType).casFeat_tokenList == null)
      jcasType.jcas.throwFeatMissing("tokenList", "edu.cmu.lti.iis.Unigram");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Unigram_Type)jcasType).casFeatCode_tokenList)));}
    
  /** setter for tokenList - sets Lists the tokens occuring in the n-gram 
   * @generated */
  public void setTokenList(FSList v) {
    if (Unigram_Type.featOkTst && ((Unigram_Type)jcasType).casFeat_tokenList == null)
      jcasType.jcas.throwFeatMissing("tokenList", "edu.cmu.lti.iis.Unigram");
    jcasType.ll_cas.ll_setRefValue(addr, ((Unigram_Type)jcasType).casFeatCode_tokenList, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    