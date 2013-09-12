
/* First created by JCasGen Wed Sep 11 18:28:42 EDT 2013 */
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
import org.apache.uima.jcas.cas.TOP_Type;

/** It stores the metric of evaluation of the performance in a given test element - precision at N, etc.
 * Updated by JCasGen Wed Sep 11 20:45:07 EDT 2013
 * @generated */
public class Evaluator_Type extends TOP_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Evaluator_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Evaluator_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Evaluator(addr, Evaluator_Type.this);
  			   Evaluator_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Evaluator(addr, Evaluator_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Evaluator.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.iis.Evaluator");
 
  /** @generated */
  final Feature casFeat_precisionAtN;
  /** @generated */
  final int     casFeatCode_precisionAtN;
  /** @generated */ 
  public float getPrecisionAtN(int addr) {
        if (featOkTst && casFeat_precisionAtN == null)
      jcas.throwFeatMissing("precisionAtN", "edu.cmu.lti.iis.Evaluator");
    return ll_cas.ll_getFloatValue(addr, casFeatCode_precisionAtN);
  }
  /** @generated */    
  public void setPrecisionAtN(int addr, float v) {
        if (featOkTst && casFeat_precisionAtN == null)
      jcas.throwFeatMissing("precisionAtN", "edu.cmu.lti.iis.Evaluator");
    ll_cas.ll_setFloatValue(addr, casFeatCode_precisionAtN, v);}
    
  
 
  /** @generated */
  final Feature casFeat_n;
  /** @generated */
  final int     casFeatCode_n;
  /** @generated */ 
  public int getN(int addr) {
        if (featOkTst && casFeat_n == null)
      jcas.throwFeatMissing("n", "edu.cmu.lti.iis.Evaluator");
    return ll_cas.ll_getIntValue(addr, casFeatCode_n);
  }
  /** @generated */    
  public void setN(int addr, int v) {
        if (featOkTst && casFeat_n == null)
      jcas.throwFeatMissing("n", "edu.cmu.lti.iis.Evaluator");
    ll_cas.ll_setIntValue(addr, casFeatCode_n, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Evaluator_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_precisionAtN = jcas.getRequiredFeatureDE(casType, "precisionAtN", "uima.cas.Float", featOkTst);
    casFeatCode_precisionAtN  = (null == casFeat_precisionAtN) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_precisionAtN).getCode();

 
    casFeat_n = jcas.getRequiredFeatureDE(casType, "n", "uima.cas.Integer", featOkTst);
    casFeatCode_n  = (null == casFeat_n) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_n).getCode();

  }
}



    