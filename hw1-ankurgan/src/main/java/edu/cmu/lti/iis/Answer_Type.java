
/* First created by JCasGen Wed Sep 11 19:01:59 EDT 2013 */
package edu.cmu.lti.iis;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** Annotation for an instance of answer in Test Element. It contains the tokens, n-grams and score information about the answer
 * Updated by JCasGen Wed Sep 11 20:45:07 EDT 2013
 * @generated */
public class Answer_Type extends BaseAnnotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Answer_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Answer_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Answer(addr, Answer_Type.this);
  			   Answer_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Answer(addr, Answer_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Answer.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.iis.Answer");
 
  /** @generated */
  final Feature casFeat_tokenList;
  /** @generated */
  final int     casFeatCode_tokenList;
  /** @generated */ 
  public int getTokenList(int addr) {
        if (featOkTst && casFeat_tokenList == null)
      jcas.throwFeatMissing("tokenList", "edu.cmu.lti.iis.Answer");
    return ll_cas.ll_getRefValue(addr, casFeatCode_tokenList);
  }
  /** @generated */    
  public void setTokenList(int addr, int v) {
        if (featOkTst && casFeat_tokenList == null)
      jcas.throwFeatMissing("tokenList", "edu.cmu.lti.iis.Answer");
    ll_cas.ll_setRefValue(addr, casFeatCode_tokenList, v);}
    
  
 
  /** @generated */
  final Feature casFeat_correctAnswer;
  /** @generated */
  final int     casFeatCode_correctAnswer;
  /** @generated */ 
  public boolean getCorrectAnswer(int addr) {
        if (featOkTst && casFeat_correctAnswer == null)
      jcas.throwFeatMissing("correctAnswer", "edu.cmu.lti.iis.Answer");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_correctAnswer);
  }
  /** @generated */    
  public void setCorrectAnswer(int addr, boolean v) {
        if (featOkTst && casFeat_correctAnswer == null)
      jcas.throwFeatMissing("correctAnswer", "edu.cmu.lti.iis.Answer");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_correctAnswer, v);}
    
  
 
  /** @generated */
  final Feature casFeat_score;
  /** @generated */
  final int     casFeatCode_score;
  /** @generated */ 
  public int getScore(int addr) {
        if (featOkTst && casFeat_score == null)
      jcas.throwFeatMissing("score", "edu.cmu.lti.iis.Answer");
    return ll_cas.ll_getRefValue(addr, casFeatCode_score);
  }
  /** @generated */    
  public void setScore(int addr, int v) {
        if (featOkTst && casFeat_score == null)
      jcas.throwFeatMissing("score", "edu.cmu.lti.iis.Answer");
    ll_cas.ll_setRefValue(addr, casFeatCode_score, v);}
    
  
 
  /** @generated */
  final Feature casFeat_unigramList;
  /** @generated */
  final int     casFeatCode_unigramList;
  /** @generated */ 
  public int getUnigramList(int addr) {
        if (featOkTst && casFeat_unigramList == null)
      jcas.throwFeatMissing("unigramList", "edu.cmu.lti.iis.Answer");
    return ll_cas.ll_getRefValue(addr, casFeatCode_unigramList);
  }
  /** @generated */    
  public void setUnigramList(int addr, int v) {
        if (featOkTst && casFeat_unigramList == null)
      jcas.throwFeatMissing("unigramList", "edu.cmu.lti.iis.Answer");
    ll_cas.ll_setRefValue(addr, casFeatCode_unigramList, v);}
    
  
 
  /** @generated */
  final Feature casFeat_bigramList;
  /** @generated */
  final int     casFeatCode_bigramList;
  /** @generated */ 
  public int getBigramList(int addr) {
        if (featOkTst && casFeat_bigramList == null)
      jcas.throwFeatMissing("bigramList", "edu.cmu.lti.iis.Answer");
    return ll_cas.ll_getRefValue(addr, casFeatCode_bigramList);
  }
  /** @generated */    
  public void setBigramList(int addr, int v) {
        if (featOkTst && casFeat_bigramList == null)
      jcas.throwFeatMissing("bigramList", "edu.cmu.lti.iis.Answer");
    ll_cas.ll_setRefValue(addr, casFeatCode_bigramList, v);}
    
  
 
  /** @generated */
  final Feature casFeat_trigramList;
  /** @generated */
  final int     casFeatCode_trigramList;
  /** @generated */ 
  public int getTrigramList(int addr) {
        if (featOkTst && casFeat_trigramList == null)
      jcas.throwFeatMissing("trigramList", "edu.cmu.lti.iis.Answer");
    return ll_cas.ll_getRefValue(addr, casFeatCode_trigramList);
  }
  /** @generated */    
  public void setTrigramList(int addr, int v) {
        if (featOkTst && casFeat_trigramList == null)
      jcas.throwFeatMissing("trigramList", "edu.cmu.lti.iis.Answer");
    ll_cas.ll_setRefValue(addr, casFeatCode_trigramList, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Answer_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_tokenList = jcas.getRequiredFeatureDE(casType, "tokenList", "uima.cas.FSList", featOkTst);
    casFeatCode_tokenList  = (null == casFeat_tokenList) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tokenList).getCode();

 
    casFeat_correctAnswer = jcas.getRequiredFeatureDE(casType, "correctAnswer", "uima.cas.Boolean", featOkTst);
    casFeatCode_correctAnswer  = (null == casFeat_correctAnswer) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_correctAnswer).getCode();

 
    casFeat_score = jcas.getRequiredFeatureDE(casType, "score", "edu.cmu.lti.iis.AnswerScore", featOkTst);
    casFeatCode_score  = (null == casFeat_score) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_score).getCode();

 
    casFeat_unigramList = jcas.getRequiredFeatureDE(casType, "unigramList", "edu.cmu.lti.iis.Unigram", featOkTst);
    casFeatCode_unigramList  = (null == casFeat_unigramList) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_unigramList).getCode();

 
    casFeat_bigramList = jcas.getRequiredFeatureDE(casType, "bigramList", "edu.cmu.lti.iis.Bigram", featOkTst);
    casFeatCode_bigramList  = (null == casFeat_bigramList) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_bigramList).getCode();

 
    casFeat_trigramList = jcas.getRequiredFeatureDE(casType, "trigramList", "edu.cmu.lti.iis.Trigram", featOkTst);
    casFeatCode_trigramList  = (null == casFeat_trigramList) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_trigramList).getCode();

  }
}



    