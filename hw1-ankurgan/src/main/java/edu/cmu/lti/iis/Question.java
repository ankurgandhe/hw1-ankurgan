

/* First created by JCasGen Wed Sep 11 15:05:36 EDT 2013 */
package edu.cmu.lti.iis;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;


/** Annotation for question in the TestElement
 * Updated by JCasGen Wed Sep 11 20:45:07 EDT 2013
 * XML source: C:/Users/gandhe/git/hw1-ankurgan/hw1-ankurgan/src/main/resources/hw1-ankurgan-typesystem.xml
 * @generated */
public class Question extends BaseAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Question.class);
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
  protected Question() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Question(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Question(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Question(JCas jcas, int begin, int end) {
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

  /** getter for tokenList - gets List of tokens in the question
   * @generated */
  public FSList getTokenList() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_tokenList == null)
      jcasType.jcas.throwFeatMissing("tokenList", "edu.cmu.lti.iis.Question");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_tokenList)));}
    
  /** setter for tokenList - sets List of tokens in the question 
   * @generated */
  public void setTokenList(FSList v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_tokenList == null)
      jcasType.jcas.throwFeatMissing("tokenList", "edu.cmu.lti.iis.Question");
    jcasType.ll_cas.ll_setRefValue(addr, ((Question_Type)jcasType).casFeatCode_tokenList, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: unigramList

  /** getter for unigramList - gets Lists the unigrams annotations in a question
   * @generated */
  public Unigram getUnigramList() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_unigramList == null)
      jcasType.jcas.throwFeatMissing("unigramList", "edu.cmu.lti.iis.Question");
    return (Unigram)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_unigramList)));}
    
  /** setter for unigramList - sets Lists the unigrams annotations in a question 
   * @generated */
  public void setUnigramList(Unigram v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_unigramList == null)
      jcasType.jcas.throwFeatMissing("unigramList", "edu.cmu.lti.iis.Question");
    jcasType.ll_cas.ll_setRefValue(addr, ((Question_Type)jcasType).casFeatCode_unigramList, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: bigramList

  /** getter for bigramList - gets Lists the bigrams annotations in a question
   * @generated */
  public Bigram getBigramList() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_bigramList == null)
      jcasType.jcas.throwFeatMissing("bigramList", "edu.cmu.lti.iis.Question");
    return (Bigram)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_bigramList)));}
    
  /** setter for bigramList - sets Lists the bigrams annotations in a question 
   * @generated */
  public void setBigramList(Bigram v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_bigramList == null)
      jcasType.jcas.throwFeatMissing("bigramList", "edu.cmu.lti.iis.Question");
    jcasType.ll_cas.ll_setRefValue(addr, ((Question_Type)jcasType).casFeatCode_bigramList, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: trigramList

  /** getter for trigramList - gets Lists the trigram annotations in a question
   * @generated */
  public Trigram getTrigramList() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_trigramList == null)
      jcasType.jcas.throwFeatMissing("trigramList", "edu.cmu.lti.iis.Question");
    return (Trigram)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_trigramList)));}
    
  /** setter for trigramList - sets Lists the trigram annotations in a question 
   * @generated */
  public void setTrigramList(Trigram v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_trigramList == null)
      jcasType.jcas.throwFeatMissing("trigramList", "edu.cmu.lti.iis.Question");
    jcasType.ll_cas.ll_setRefValue(addr, ((Question_Type)jcasType).casFeatCode_trigramList, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    