

/* First created by JCasGen Wed Sep 11 19:01:59 EDT 2013 */
package edu.cmu.lti.iis;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;


/** Annotation for an instance of answer in Test Element. It contains the tokens, n-grams and score information about the answer
 * Updated by JCasGen Wed Sep 11 20:45:07 EDT 2013
 * XML source: C:/Users/gandhe/git/hw1-ankurgan/hw1-ankurgan/src/main/resources/hw1-ankurgan-typesystem.xml
 * @generated */
public class Answer extends BaseAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Answer.class);
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
  protected Answer() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Answer(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Answer(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Answer(JCas jcas, int begin, int end) {
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

  /** getter for tokenList - gets List containing all tokens in the answer
   * @generated */
  public FSList getTokenList() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_tokenList == null)
      jcasType.jcas.throwFeatMissing("tokenList", "edu.cmu.lti.iis.Answer");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_tokenList)));}
    
  /** setter for tokenList - sets List containing all tokens in the answer 
   * @generated */
  public void setTokenList(FSList v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_tokenList == null)
      jcasType.jcas.throwFeatMissing("tokenList", "edu.cmu.lti.iis.Answer");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answer_Type)jcasType).casFeatCode_tokenList, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: correctAnswer

  /** getter for correctAnswer - gets Records whether the answer is correct or not
   * @generated */
  public boolean getCorrectAnswer() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_correctAnswer == null)
      jcasType.jcas.throwFeatMissing("correctAnswer", "edu.cmu.lti.iis.Answer");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_correctAnswer);}
    
  /** setter for correctAnswer - sets Records whether the answer is correct or not 
   * @generated */
  public void setCorrectAnswer(boolean v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_correctAnswer == null)
      jcasType.jcas.throwFeatMissing("correctAnswer", "edu.cmu.lti.iis.Answer");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_correctAnswer, v);}    
   
    
  //*--------------*
  //* Feature: score

  /** getter for score - gets Records the score of the answer
   * @generated */
  public AnswerScore getScore() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "edu.cmu.lti.iis.Answer");
    return (AnswerScore)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_score)));}
    
  /** setter for score - sets Records the score of the answer 
   * @generated */
  public void setScore(AnswerScore v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "edu.cmu.lti.iis.Answer");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answer_Type)jcasType).casFeatCode_score, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: unigramList

  /** getter for unigramList - gets Lists the unigrams annotations in the answer
   * @generated */
  public Unigram getUnigramList() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_unigramList == null)
      jcasType.jcas.throwFeatMissing("unigramList", "edu.cmu.lti.iis.Answer");
    return (Unigram)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_unigramList)));}
    
  /** setter for unigramList - sets Lists the unigrams annotations in the answer 
   * @generated */
  public void setUnigramList(Unigram v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_unigramList == null)
      jcasType.jcas.throwFeatMissing("unigramList", "edu.cmu.lti.iis.Answer");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answer_Type)jcasType).casFeatCode_unigramList, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: bigramList

  /** getter for bigramList - gets Lists the bigrams annotations in an answer
   * @generated */
  public Bigram getBigramList() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_bigramList == null)
      jcasType.jcas.throwFeatMissing("bigramList", "edu.cmu.lti.iis.Answer");
    return (Bigram)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_bigramList)));}
    
  /** setter for bigramList - sets Lists the bigrams annotations in an answer 
   * @generated */
  public void setBigramList(Bigram v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_bigramList == null)
      jcasType.jcas.throwFeatMissing("bigramList", "edu.cmu.lti.iis.Answer");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answer_Type)jcasType).casFeatCode_bigramList, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: trigramList

  /** getter for trigramList - gets Lists the trigram annotations in an answer
   * @generated */
  public Trigram getTrigramList() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_trigramList == null)
      jcasType.jcas.throwFeatMissing("trigramList", "edu.cmu.lti.iis.Answer");
    return (Trigram)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_trigramList)));}
    
  /** setter for trigramList - sets Lists the trigram annotations in an answer 
   * @generated */
  public void setTrigramList(Trigram v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_trigramList == null)
      jcasType.jcas.throwFeatMissing("trigramList", "edu.cmu.lti.iis.Answer");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answer_Type)jcasType).casFeatCode_trigramList, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    