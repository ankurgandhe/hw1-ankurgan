

/* First created by JCasGen Wed Sep 11 15:05:36 EDT 2013 */
package edu.cmu.lti.iis;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;


/** The overall test element recording question and list of answers
 * Updated by JCasGen Wed Sep 11 20:45:07 EDT 2013
 * XML source: C:/Users/gandhe/git/hw1-ankurgan/hw1-ankurgan/src/main/resources/hw1-ankurgan-typesystem.xml
 * @generated */
public class TestElement extends BaseAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TestElement.class);
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
  protected TestElement() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public TestElement(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public TestElement(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public TestElement(JCas jcas, int begin, int end) {
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
  //* Feature: answerList

  /** getter for answerList - gets Stores the answers in a given test element
   * @generated */
  public FSList getAnswerList() {
    if (TestElement_Type.featOkTst && ((TestElement_Type)jcasType).casFeat_answerList == null)
      jcasType.jcas.throwFeatMissing("answerList", "edu.cmu.lti.iis.TestElement");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TestElement_Type)jcasType).casFeatCode_answerList)));}
    
  /** setter for answerList - sets Stores the answers in a given test element 
   * @generated */
  public void setAnswerList(FSList v) {
    if (TestElement_Type.featOkTst && ((TestElement_Type)jcasType).casFeat_answerList == null)
      jcasType.jcas.throwFeatMissing("answerList", "edu.cmu.lti.iis.TestElement");
    jcasType.ll_cas.ll_setRefValue(addr, ((TestElement_Type)jcasType).casFeatCode_answerList, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: question

  /** getter for question - gets stores the question in a given test element
   * @generated */
  public Question getQuestion() {
    if (TestElement_Type.featOkTst && ((TestElement_Type)jcasType).casFeat_question == null)
      jcasType.jcas.throwFeatMissing("question", "edu.cmu.lti.iis.TestElement");
    return (Question)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TestElement_Type)jcasType).casFeatCode_question)));}
    
  /** setter for question - sets stores the question in a given test element 
   * @generated */
  public void setQuestion(Question v) {
    if (TestElement_Type.featOkTst && ((TestElement_Type)jcasType).casFeat_question == null)
      jcasType.jcas.throwFeatMissing("question", "edu.cmu.lti.iis.TestElement");
    jcasType.ll_cas.ll_setRefValue(addr, ((TestElement_Type)jcasType).casFeatCode_question, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: evaluator

  /** getter for evaluator - gets This feature stores the precision at N value for the given question and given set of answers
   * @generated */
  public Evaluator getEvaluator() {
    if (TestElement_Type.featOkTst && ((TestElement_Type)jcasType).casFeat_evaluator == null)
      jcasType.jcas.throwFeatMissing("evaluator", "edu.cmu.lti.iis.TestElement");
    return (Evaluator)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TestElement_Type)jcasType).casFeatCode_evaluator)));}
    
  /** setter for evaluator - sets This feature stores the precision at N value for the given question and given set of answers 
   * @generated */
  public void setEvaluator(Evaluator v) {
    if (TestElement_Type.featOkTst && ((TestElement_Type)jcasType).casFeat_evaluator == null)
      jcasType.jcas.throwFeatMissing("evaluator", "edu.cmu.lti.iis.TestElement");
    jcasType.ll_cas.ll_setRefValue(addr, ((TestElement_Type)jcasType).casFeatCode_evaluator, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    