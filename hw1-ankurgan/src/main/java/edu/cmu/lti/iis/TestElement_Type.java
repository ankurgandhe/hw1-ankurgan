
/* First created by JCasGen Wed Sep 11 15:05:36 EDT 2013 */
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

/** The overall test element recording question and list of answers
 * Updated by JCasGen Wed Sep 11 20:45:07 EDT 2013
 * @generated */
public class TestElement_Type extends BaseAnnotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (TestElement_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = TestElement_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new TestElement(addr, TestElement_Type.this);
  			   TestElement_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new TestElement(addr, TestElement_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = TestElement.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.iis.TestElement");
 
  /** @generated */
  final Feature casFeat_answerList;
  /** @generated */
  final int     casFeatCode_answerList;
  /** @generated */ 
  public int getAnswerList(int addr) {
        if (featOkTst && casFeat_answerList == null)
      jcas.throwFeatMissing("answerList", "edu.cmu.lti.iis.TestElement");
    return ll_cas.ll_getRefValue(addr, casFeatCode_answerList);
  }
  /** @generated */    
  public void setAnswerList(int addr, int v) {
        if (featOkTst && casFeat_answerList == null)
      jcas.throwFeatMissing("answerList", "edu.cmu.lti.iis.TestElement");
    ll_cas.ll_setRefValue(addr, casFeatCode_answerList, v);}
    
  
 
  /** @generated */
  final Feature casFeat_question;
  /** @generated */
  final int     casFeatCode_question;
  /** @generated */ 
  public int getQuestion(int addr) {
        if (featOkTst && casFeat_question == null)
      jcas.throwFeatMissing("question", "edu.cmu.lti.iis.TestElement");
    return ll_cas.ll_getRefValue(addr, casFeatCode_question);
  }
  /** @generated */    
  public void setQuestion(int addr, int v) {
        if (featOkTst && casFeat_question == null)
      jcas.throwFeatMissing("question", "edu.cmu.lti.iis.TestElement");
    ll_cas.ll_setRefValue(addr, casFeatCode_question, v);}
    
  
 
  /** @generated */
  final Feature casFeat_evaluator;
  /** @generated */
  final int     casFeatCode_evaluator;
  /** @generated */ 
  public int getEvaluator(int addr) {
        if (featOkTst && casFeat_evaluator == null)
      jcas.throwFeatMissing("evaluator", "edu.cmu.lti.iis.TestElement");
    return ll_cas.ll_getRefValue(addr, casFeatCode_evaluator);
  }
  /** @generated */    
  public void setEvaluator(int addr, int v) {
        if (featOkTst && casFeat_evaluator == null)
      jcas.throwFeatMissing("evaluator", "edu.cmu.lti.iis.TestElement");
    ll_cas.ll_setRefValue(addr, casFeatCode_evaluator, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public TestElement_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_answerList = jcas.getRequiredFeatureDE(casType, "answerList", "uima.cas.FSList", featOkTst);
    casFeatCode_answerList  = (null == casFeat_answerList) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_answerList).getCode();

 
    casFeat_question = jcas.getRequiredFeatureDE(casType, "question", "edu.cmu.lti.iis.Question", featOkTst);
    casFeatCode_question  = (null == casFeat_question) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_question).getCode();

 
    casFeat_evaluator = jcas.getRequiredFeatureDE(casType, "evaluator", "edu.cmu.lti.iis.Evaluator", featOkTst);
    casFeatCode_evaluator  = (null == casFeat_evaluator) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_evaluator).getCode();

  }
}



    