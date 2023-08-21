/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 02 11:07:58 GMT 2016
 */


import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true)
public class Record_ESTest4   {
@BeforeClass
public static void initEvoSuiteFramework() {
}
@AfterClass
public static void exitEvoSuiteFramework() {
}

  //Test case number: 0
  /*
   * 54 covered goals:
   * Goal 1. Record.<init>()V: root-Branch
   * Goal 2. Record.writeNote(Ljava/lang/String;I)V: I197 Branch 1 IFLE L51 - true
   * Goal 3. Record.writeNote(Ljava/lang/String;I)V: I323 Branch 7 IF_ICMPLT L72 - true
   * Goal 4. Record.writeNote(Ljava/lang/String;I)V: I323 Branch 7 IF_ICMPLT L72 - false
   * Goal 5. Record.writeNote(Ljava/lang/String;I)V: I295 Branch 6 IF_ICMPLE L74 - true
   * Goal 6. Branch Record.<init>()V: root-Branch in context: Record:<init>()V
   * Goal 7. Branch Record.writeNote(Ljava/lang/String;I)V: I197 Branch 1 IFLE L51 - true in context: Record:writeNote(Ljava/lang/String;I)V
   * Goal 8. Branch Record.writeNote(Ljava/lang/String;I)V: I323 Branch 7 IF_ICMPLT L72 - true in context: Record:writeNote(Ljava/lang/String;I)V
   * Goal 9. Branch Record.writeNote(Ljava/lang/String;I)V: I323 Branch 7 IF_ICMPLT L72 - false in context: Record:writeNote(Ljava/lang/String;I)V
   * Goal 10. Branch Record.writeNote(Ljava/lang/String;I)V: I295 Branch 6 IF_ICMPLE L74 - true in context: Record:writeNote(Ljava/lang/String;I)V
   * Goal 11. Record.<init>()V: Line 13
   * Goal 12. Record.<init>()V: Line 14
   * Goal 13. Record.<init>()V: Line 15
   * Goal 14. Record.<init>()V: Line 16
   * Goal 15. Record.writeNote(Ljava/lang/String;I)V: Line 20
   * Goal 16. Record.writeNote(Ljava/lang/String;I)V: Line 23
   * Goal 17. Record.writeNote(Ljava/lang/String;I)V: Line 24
   * Goal 18. Record.writeNote(Ljava/lang/String;I)V: Line 25
   * Goal 19. Record.writeNote(Ljava/lang/String;I)V: Line 26
   * Goal 20. Record.writeNote(Ljava/lang/String;I)V: Line 29
   * Goal 21. Record.writeNote(Ljava/lang/String;I)V: Line 30
   * Goal 22. Record.writeNote(Ljava/lang/String;I)V: Line 32
   * Goal 23. Record.writeNote(Ljava/lang/String;I)V: Line 33
   * Goal 24. Record.writeNote(Ljava/lang/String;I)V: Line 36
   * Goal 25. Record.writeNote(Ljava/lang/String;I)V: Line 38
   * Goal 26. Record.writeNote(Ljava/lang/String;I)V: Line 39
   * Goal 27. Record.writeNote(Ljava/lang/String;I)V: Line 40
   * Goal 28. Record.writeNote(Ljava/lang/String;I)V: Line 45
   * Goal 29. Record.writeNote(Ljava/lang/String;I)V: Line 46
   * Goal 30. Record.writeNote(Ljava/lang/String;I)V: Line 47
   * Goal 31. Record.writeNote(Ljava/lang/String;I)V: Line 48
   * Goal 32. Record.writeNote(Ljava/lang/String;I)V: Line 50
   * Goal 33. Record.writeNote(Ljava/lang/String;I)V: Line 51
   * Goal 34. Record.writeNote(Ljava/lang/String;I)V: Line 69
   * Goal 35. Record.writeNote(Ljava/lang/String;I)V: Line 72
   * Goal 36. Record.writeNote(Ljava/lang/String;I)V: Line 74
   * Goal 37. Record.writeNote(Ljava/lang/String;I)V: Line 77
   * Goal 38. Record.writeNote(Ljava/lang/String;I)V: Line 78
   * Goal 39. Record.writeNote(Ljava/lang/String;I)V: Line 79
   * Goal 40. Record.writeNote(Ljava/lang/String;I)V: Line 84
   * Goal 41. Record.writeNote(Ljava/lang/String;I)V: Line 85
   * Goal 42. Record.writeNote(Ljava/lang/String;I)V: Line 86
   * Goal 43. Record.writeNote(Ljava/lang/String;I)V: Line 88
   * Goal 44. [METHOD] Record.<init>()V
   * Goal 45. [METHOD] Record.writeNote(Ljava/lang/String;I)V
   * Goal 46. [METHODNOEX] Record.<init>()V
   * Goal 47. [METHODNOEX] Record.writeNote(Ljava/lang/String;I)V
   * Goal 48. Weak Mutation 0: Record.<init>()V:16 - ReplaceConstant - record.dat -> 
   * Goal 49. Weak Mutation 1: Record.writeNote(Ljava/lang/String;I)V:20 - ReplaceComparisonOperator == -> !=
   * Goal 50. Weak Mutation 2: Record.writeNote(Ljava/lang/String;I)V:23 - ReplaceComparisonOperator == -> !=
   * Goal 51. Weak Mutation 3: Record.writeNote(Ljava/lang/String;I)V:25 - ReplaceComparisonOperator == -> !=
   * Goal 52. Weak Mutation 4: Record.writeNote(Ljava/lang/String;I)V:32 - InsertUnaryOp Negation of note
   * Goal 53. Weak Mutation 5: Record.writeNote(Ljava/lang/String;I)V:32 - InsertUnaryOp IINC 1 note
   * Goal 54. Weak Mutation 6: Record.writeNote(Ljava/lang/String;I)V:32 - InsertUnaryOp IINC -1 note
   */

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Record record0 = new Record();
      record0.writeNote("", 0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      record0.writeNote("vO", 0);
  }

  //Test case number: 1
  /*
   * 63 covered goals:
   * Goal 1. Record.readNote()Ljava/util/Vector;: root-Branch
   * Goal 2. Record.<init>()V: root-Branch
   * Goal 3. Record.writeNote(Ljava/lang/String;I)V: I197 Branch 1 IFLE L51 - true
   * Goal 4. Record.writeNote(Ljava/lang/String;I)V: I323 Branch 7 IF_ICMPLT L72 - true
   * Goal 5. Record.writeNote(Ljava/lang/String;I)V: I323 Branch 7 IF_ICMPLT L72 - false
   * Goal 6. Record.writeNote(Ljava/lang/String;I)V: I295 Branch 6 IF_ICMPLE L74 - true
   * Goal 7. Branch Record.readNote()Ljava/util/Vector;: root-Branch in context: Record:readNote()Ljava/util/Vector;
   * Goal 8. Branch Record.<init>()V: root-Branch in context: Record:<init>()V
   * Goal 9. Branch Record.writeNote(Ljava/lang/String;I)V: I197 Branch 1 IFLE L51 - true in context: Record:writeNote(Ljava/lang/String;I)V
   * Goal 10. Branch Record.writeNote(Ljava/lang/String;I)V: I323 Branch 7 IF_ICMPLT L72 - true in context: Record:writeNote(Ljava/lang/String;I)V
   * Goal 11. Branch Record.writeNote(Ljava/lang/String;I)V: I323 Branch 7 IF_ICMPLT L72 - false in context: Record:writeNote(Ljava/lang/String;I)V
   * Goal 12. Branch Record.writeNote(Ljava/lang/String;I)V: I295 Branch 6 IF_ICMPLE L74 - true in context: Record:writeNote(Ljava/lang/String;I)V
   * Goal 13. [Output]: Record.readNote()Ljava/util/Vector;:NonNull:java.util.Vector:capacity()I:Positive
   * Goal 14. [Output]: Record.readNote()Ljava/util/Vector;:NonNull:java.util.Vector:isEmpty()Z:True
   * Goal 15. [Output]: Record.readNote()Ljava/util/Vector;:NonNull:java.util.Vector:size()I:Zero
   * Goal 16. Record.<init>()V: Line 13
   * Goal 17. Record.<init>()V: Line 14
   * Goal 18. Record.<init>()V: Line 15
   * Goal 19. Record.<init>()V: Line 16
   * Goal 20. Record.readNote()Ljava/util/Vector;: Line 92
   * Goal 21. Record.readNote()Ljava/util/Vector;: Line 101
   * Goal 22. Record.readNote()Ljava/util/Vector;: Line 102
   * Goal 23. Record.readNote()Ljava/util/Vector;: Line 104
   * Goal 24. Record.readNote()Ljava/util/Vector;: Line 107
   * Goal 25. Record.readNote()Ljava/util/Vector;: Line 110
   * Goal 26. Record.readNote()Ljava/util/Vector;: Line 111
   * Goal 27. Record.readNote()Ljava/util/Vector;: Line 115
   * Goal 28. Record.writeNote(Ljava/lang/String;I)V: Line 20
   * Goal 29. Record.writeNote(Ljava/lang/String;I)V: Line 23
   * Goal 30. Record.writeNote(Ljava/lang/String;I)V: Line 24
   * Goal 31. Record.writeNote(Ljava/lang/String;I)V: Line 25
   * Goal 32. Record.writeNote(Ljava/lang/String;I)V: Line 26
   * Goal 33. Record.writeNote(Ljava/lang/String;I)V: Line 32
   * Goal 34. Record.writeNote(Ljava/lang/String;I)V: Line 33
   * Goal 35. Record.writeNote(Ljava/lang/String;I)V: Line 36
   * Goal 36. Record.writeNote(Ljava/lang/String;I)V: Line 38
   * Goal 37. Record.writeNote(Ljava/lang/String;I)V: Line 45
   * Goal 38. Record.writeNote(Ljava/lang/String;I)V: Line 46
   * Goal 39. Record.writeNote(Ljava/lang/String;I)V: Line 47
   * Goal 40. Record.writeNote(Ljava/lang/String;I)V: Line 50
   * Goal 41. Record.writeNote(Ljava/lang/String;I)V: Line 51
   * Goal 42. Record.writeNote(Ljava/lang/String;I)V: Line 69
   * Goal 43. Record.writeNote(Ljava/lang/String;I)V: Line 72
   * Goal 44. Record.writeNote(Ljava/lang/String;I)V: Line 74
   * Goal 45. Record.writeNote(Ljava/lang/String;I)V: Line 77
   * Goal 46. Record.writeNote(Ljava/lang/String;I)V: Line 78
   * Goal 47. Record.writeNote(Ljava/lang/String;I)V: Line 84
   * Goal 48. Record.writeNote(Ljava/lang/String;I)V: Line 85
   * Goal 49. Record.writeNote(Ljava/lang/String;I)V: Line 88
   * Goal 50. [METHOD] Record.<init>()V
   * Goal 51. [METHOD] Record.readNote()Ljava/util/Vector;
   * Goal 52. [METHOD] Record.writeNote(Ljava/lang/String;I)V
   * Goal 53. [METHODNOEX] Record.<init>()V
   * Goal 54. [METHODNOEX] Record.readNote()Ljava/util/Vector;
   * Goal 55. [METHODNOEX] Record.writeNote(Ljava/lang/String;I)V
   * Goal 56. Weak Mutation 0: Record.<init>()V:16 - ReplaceConstant - record.dat -> 
   * Goal 57. Weak Mutation 1: Record.writeNote(Ljava/lang/String;I)V:20 - ReplaceComparisonOperator == -> !=
   * Goal 58. Weak Mutation 2: Record.writeNote(Ljava/lang/String;I)V:23 - ReplaceComparisonOperator == -> !=
   * Goal 59. Weak Mutation 3: Record.writeNote(Ljava/lang/String;I)V:25 - ReplaceComparisonOperator == -> !=
   * Goal 60. Weak Mutation 4: Record.writeNote(Ljava/lang/String;I)V:32 - InsertUnaryOp Negation of note
   * Goal 61. Weak Mutation 5: Record.writeNote(Ljava/lang/String;I)V:32 - InsertUnaryOp IINC 1 note
   * Goal 62. Weak Mutation 6: Record.writeNote(Ljava/lang/String;I)V:32 - InsertUnaryOp IINC -1 note
   * Goal 63. Weak Mutation 7: Record.readNote()Ljava/util/Vector;:92 - ReplaceComparisonOperator == -> !=
   */

  

  //Test case number: 2
  /*
   * 62 covered goals:
   * Goal 1. Record.readNote()Ljava/util/Vector;: root-Branch
   * Goal 2. Record.<init>()V: root-Branch
   * Goal 3. Record.writeNote(Ljava/lang/String;I)V: I197 Branch 1 IFLE L51 - true
   * Goal 4. Record.writeNote(Ljava/lang/String;I)V: I323 Branch 7 IF_ICMPLT L72 - true
   * Goal 5. Record.writeNote(Ljava/lang/String;I)V: I323 Branch 7 IF_ICMPLT L72 - false
   * Goal 6. Record.writeNote(Ljava/lang/String;I)V: I295 Branch 6 IF_ICMPLE L74 - true
   * Goal 7. Branch Record.readNote()Ljava/util/Vector;: root-Branch in context: Record:readNote()Ljava/util/Vector;
   * Goal 8. Branch Record.<init>()V: root-Branch in context: Record:<init>()V
   * Goal 9. Branch Record.writeNote(Ljava/lang/String;I)V: I197 Branch 1 IFLE L51 - true in context: Record:writeNote(Ljava/lang/String;I)V
   * Goal 10. Branch Record.writeNote(Ljava/lang/String;I)V: I323 Branch 7 IF_ICMPLT L72 - true in context: Record:writeNote(Ljava/lang/String;I)V
   * Goal 11. Branch Record.writeNote(Ljava/lang/String;I)V: I323 Branch 7 IF_ICMPLT L72 - false in context: Record:writeNote(Ljava/lang/String;I)V
   * Goal 12. Branch Record.writeNote(Ljava/lang/String;I)V: I295 Branch 6 IF_ICMPLE L74 - true in context: Record:writeNote(Ljava/lang/String;I)V
   * Goal 13. [Output]: Record.readNote()Ljava/util/Vector;:NonNull:java.util.Vector:capacity()I:Positive
   * Goal 14. [Output]: Record.readNote()Ljava/util/Vector;:NonNull:java.util.Vector:isEmpty()Z:False
   * Goal 15. [Output]: Record.readNote()Ljava/util/Vector;:NonNull:java.util.Vector:size()I:Positive
   * Goal 16. Record.<init>()V: Line 13
   * Goal 17. Record.<init>()V: Line 14
   * Goal 18. Record.<init>()V: Line 15
   * Goal 19. Record.<init>()V: Line 16
   * Goal 20. Record.readNote()Ljava/util/Vector;: Line 92
   * Goal 21. Record.readNote()Ljava/util/Vector;: Line 93
   * Goal 22. Record.readNote()Ljava/util/Vector;: Line 104
   * Goal 23. Record.readNote()Ljava/util/Vector;: Line 106
   * Goal 24. Record.readNote()Ljava/util/Vector;: Line 107
   * Goal 25. Record.readNote()Ljava/util/Vector;: Line 109
   * Goal 26. Record.readNote()Ljava/util/Vector;: Line 115
   * Goal 27. Record.writeNote(Ljava/lang/String;I)V: Line 20
   * Goal 28. Record.writeNote(Ljava/lang/String;I)V: Line 23
   * Goal 29. Record.writeNote(Ljava/lang/String;I)V: Line 24
   * Goal 30. Record.writeNote(Ljava/lang/String;I)V: Line 25
   * Goal 31. Record.writeNote(Ljava/lang/String;I)V: Line 26
   * Goal 32. Record.writeNote(Ljava/lang/String;I)V: Line 32
   * Goal 33. Record.writeNote(Ljava/lang/String;I)V: Line 33
   * Goal 34. Record.writeNote(Ljava/lang/String;I)V: Line 36
   * Goal 35. Record.writeNote(Ljava/lang/String;I)V: Line 38
   * Goal 36. Record.writeNote(Ljava/lang/String;I)V: Line 45
   * Goal 37. Record.writeNote(Ljava/lang/String;I)V: Line 46
   * Goal 38. Record.writeNote(Ljava/lang/String;I)V: Line 47
   * Goal 39. Record.writeNote(Ljava/lang/String;I)V: Line 50
   * Goal 40. Record.writeNote(Ljava/lang/String;I)V: Line 51
   * Goal 41. Record.writeNote(Ljava/lang/String;I)V: Line 69
   * Goal 42. Record.writeNote(Ljava/lang/String;I)V: Line 72
   * Goal 43. Record.writeNote(Ljava/lang/String;I)V: Line 74
   * Goal 44. Record.writeNote(Ljava/lang/String;I)V: Line 77
   * Goal 45. Record.writeNote(Ljava/lang/String;I)V: Line 78
   * Goal 46. Record.writeNote(Ljava/lang/String;I)V: Line 84
   * Goal 47. Record.writeNote(Ljava/lang/String;I)V: Line 85
   * Goal 48. Record.writeNote(Ljava/lang/String;I)V: Line 88
   * Goal 49. [METHOD] Record.<init>()V
   * Goal 50. [METHOD] Record.readNote()Ljava/util/Vector;
   * Goal 51. [METHOD] Record.writeNote(Ljava/lang/String;I)V
   * Goal 52. [METHODNOEX] Record.<init>()V
   * Goal 53. [METHODNOEX] Record.readNote()Ljava/util/Vector;
   * Goal 54. [METHODNOEX] Record.writeNote(Ljava/lang/String;I)V
   * Goal 55. Weak Mutation 0: Record.<init>()V:16 - ReplaceConstant - record.dat -> 
   * Goal 56. Weak Mutation 1: Record.writeNote(Ljava/lang/String;I)V:20 - ReplaceComparisonOperator == -> !=
   * Goal 57. Weak Mutation 2: Record.writeNote(Ljava/lang/String;I)V:23 - ReplaceComparisonOperator == -> !=
   * Goal 58. Weak Mutation 3: Record.writeNote(Ljava/lang/String;I)V:25 - ReplaceComparisonOperator == -> !=
   * Goal 59. Weak Mutation 4: Record.writeNote(Ljava/lang/String;I)V:32 - InsertUnaryOp Negation of note
   * Goal 60. Weak Mutation 5: Record.writeNote(Ljava/lang/String;I)V:32 - InsertUnaryOp IINC 1 note
   * Goal 61. Weak Mutation 6: Record.writeNote(Ljava/lang/String;I)V:32 - InsertUnaryOp IINC -1 note
   * Goal 62. Weak Mutation 7: Record.readNote()Ljava/util/Vector;:92 - ReplaceComparisonOperator == -> !=
   */

  

  //Test case number: 3
  /*
   * 22 covered goals:
   * Goal 1. Record.<init>()V: root-Branch
   * Goal 2. Branch Record.<init>()V: root-Branch in context: Record:<init>()V
   * Goal 3. writeNote(Ljava/lang/String;I)V_java.lang.NullPointerException_IMPLICIT
   * Goal 4. Record.<init>()V: Line 13
   * Goal 5. Record.<init>()V: Line 14
   * Goal 6. Record.<init>()V: Line 15
   * Goal 7. Record.<init>()V: Line 16
   * Goal 8. Record.writeNote(Ljava/lang/String;I)V: Line 20
   * Goal 9. Record.writeNote(Ljava/lang/String;I)V: Line 23
   * Goal 10. Record.writeNote(Ljava/lang/String;I)V: Line 27
   * Goal 11. Record.writeNote(Ljava/lang/String;I)V: Line 32
   * Goal 12. Record.writeNote(Ljava/lang/String;I)V: Line 33
   * Goal 13. Record.writeNote(Ljava/lang/String;I)V: Line 36
   * Goal 14. [METHOD] Record.<init>()V
   * Goal 15. [METHOD] Record.writeNote(Ljava/lang/String;I)V
   * Goal 16. [METHODNOEX] Record.<init>()V
   * Goal 17. Weak Mutation 0: Record.<init>()V:16 - ReplaceConstant - record.dat -> 
   * Goal 18. Weak Mutation 1: Record.writeNote(Ljava/lang/String;I)V:20 - ReplaceComparisonOperator == -> !=
   * Goal 19. Weak Mutation 2: Record.writeNote(Ljava/lang/String;I)V:23 - ReplaceComparisonOperator == -> !=
   * Goal 20. Weak Mutation 4: Record.writeNote(Ljava/lang/String;I)V:32 - InsertUnaryOp Negation of note
   * Goal 21. Weak Mutation 5: Record.writeNote(Ljava/lang/String;I)V:32 - InsertUnaryOp IINC 1 note
   * Goal 22. Weak Mutation 6: Record.writeNote(Ljava/lang/String;I)V:32 - InsertUnaryOp IINC -1 note
   */

  

  //Test case number: 4
  /*
   * 20 covered goals:
   * Goal 1. Record.readNote()Ljava/util/Vector;: root-Branch
   * Goal 2. Record.<init>()V: root-Branch
   * Goal 3. Branch Record.readNote()Ljava/util/Vector;: root-Branch in context: Record:readNote()Ljava/util/Vector;
   * Goal 4. Branch Record.<init>()V: root-Branch in context: Record:<init>()V
   * Goal 5. readNote()Ljava/util/Vector;_java.lang.NullPointerException_IMPLICIT
   * Goal 6. Record.<init>()V: Line 13
   * Goal 7. Record.<init>()V: Line 14
   * Goal 8. Record.<init>()V: Line 15
   * Goal 9. Record.<init>()V: Line 16
   * Goal 10. Record.readNote()Ljava/util/Vector;: Line 92
   * Goal 11. Record.readNote()Ljava/util/Vector;: Line 95
   * Goal 12. Record.readNote()Ljava/util/Vector;: Line 99
   * Goal 13. Record.readNote()Ljava/util/Vector;: Line 104
   * Goal 14. Record.readNote()Ljava/util/Vector;: Line 107
   * Goal 15. [METHOD] Record.<init>()V
   * Goal 16. [METHOD] Record.readNote()Ljava/util/Vector;
   * Goal 17. [METHODNOEX] Record.<init>()V
   * Goal 18. Weak Mutation 0: Record.<init>()V:16 - ReplaceConstant - record.dat -> 
   * Goal 19. Weak Mutation 7: Record.readNote()Ljava/util/Vector;:92 - ReplaceComparisonOperator == -> !=
   * Goal 20. Weak Mutation 8: Record.readNote()Ljava/util/Vector;:95 - ReplaceComparisonOperator == -> !=
   */

  

  //Test case number: 5
  /*
   * 83 covered goals:
   * Goal 1. Record.<init>()V: root-Branch
   * Goal 2. Record.writeNote(Ljava/lang/String;I)V: I197 Branch 1 IFLE L51 - true
   * Goal 3. Record.writeNote(Ljava/lang/String;I)V: I197 Branch 1 IFLE L51 - false
   * Goal 4. Record.writeNote(Ljava/lang/String;I)V: I267 Branch 4 IF_ICMPLT L53 - true
   * Goal 5. Record.writeNote(Ljava/lang/String;I)V: I267 Branch 4 IF_ICMPLT L53 - false
   * Goal 6. Record.writeNote(Ljava/lang/String;I)V: I216 Branch 2 IF_ICMPGT L54 - true
   * Goal 7. Record.writeNote(Ljava/lang/String;I)V: I216 Branch 2 IF_ICMPGT L54 - false
   * Goal 8. Record.writeNote(Ljava/lang/String;I)V: I256 Branch 3 IF_ICMPLT L59 - true
   * Goal 9. Record.writeNote(Ljava/lang/String;I)V: I256 Branch 3 IF_ICMPLT L59 - false
   * Goal 10. Record.writeNote(Ljava/lang/String;I)V: I271 Branch 5 IFNE L65 - true
   * Goal 11. Record.writeNote(Ljava/lang/String;I)V: I271 Branch 5 IFNE L65 - false
   * Goal 12. Record.writeNote(Ljava/lang/String;I)V: I323 Branch 7 IF_ICMPLT L72 - true
   * Goal 13. Record.writeNote(Ljava/lang/String;I)V: I323 Branch 7 IF_ICMPLT L72 - false
   * Goal 14. Record.writeNote(Ljava/lang/String;I)V: I295 Branch 6 IF_ICMPLE L74 - true
   * Goal 15. Record.writeNote(Ljava/lang/String;I)V: I295 Branch 6 IF_ICMPLE L74 - false
   * Goal 16. Branch Record.<init>()V: root-Branch in context: Record:<init>()V
   * Goal 17. Branch Record.writeNote(Ljava/lang/String;I)V: I197 Branch 1 IFLE L51 - true in context: Record:writeNote(Ljava/lang/String;I)V
   * Goal 18. Branch Record.writeNote(Ljava/lang/String;I)V: I197 Branch 1 IFLE L51 - false in context: Record:writeNote(Ljava/lang/String;I)V
   * Goal 19. Branch Record.writeNote(Ljava/lang/String;I)V: I267 Branch 4 IF_ICMPLT L53 - true in context: Record:writeNote(Ljava/lang/String;I)V
   * Goal 20. Branch Record.writeNote(Ljava/lang/String;I)V: I267 Branch 4 IF_ICMPLT L53 - false in context: Record:writeNote(Ljava/lang/String;I)V
   * Goal 21. Branch Record.writeNote(Ljava/lang/String;I)V: I216 Branch 2 IF_ICMPGT L54 - true in context: Record:writeNote(Ljava/lang/String;I)V
   * Goal 22. Branch Record.writeNote(Ljava/lang/String;I)V: I216 Branch 2 IF_ICMPGT L54 - false in context: Record:writeNote(Ljava/lang/String;I)V
   * Goal 23. Branch Record.writeNote(Ljava/lang/String;I)V: I256 Branch 3 IF_ICMPLT L59 - true in context: Record:writeNote(Ljava/lang/String;I)V
   * Goal 24. Branch Record.writeNote(Ljava/lang/String;I)V: I256 Branch 3 IF_ICMPLT L59 - false in context: Record:writeNote(Ljava/lang/String;I)V
   * Goal 25. Branch Record.writeNote(Ljava/lang/String;I)V: I271 Branch 5 IFNE L65 - false in context: Record:writeNote(Ljava/lang/String;I)V
   * Goal 26. Branch Record.writeNote(Ljava/lang/String;I)V: I271 Branch 5 IFNE L65 - true in context: Record:writeNote(Ljava/lang/String;I)V
   * Goal 27. Branch Record.writeNote(Ljava/lang/String;I)V: I323 Branch 7 IF_ICMPLT L72 - true in context: Record:writeNote(Ljava/lang/String;I)V
   * Goal 28. Branch Record.writeNote(Ljava/lang/String;I)V: I323 Branch 7 IF_ICMPLT L72 - false in context: Record:writeNote(Ljava/lang/String;I)V
   * Goal 29. Branch Record.writeNote(Ljava/lang/String;I)V: I295 Branch 6 IF_ICMPLE L74 - true in context: Record:writeNote(Ljava/lang/String;I)V
   * Goal 30. Branch Record.writeNote(Ljava/lang/String;I)V: I295 Branch 6 IF_ICMPLE L74 - false in context: Record:writeNote(Ljava/lang/String;I)V
   * Goal 31. Record.<init>()V: Line 13
   * Goal 32. Record.<init>()V: Line 14
   * Goal 33. Record.<init>()V: Line 15
   * Goal 34. Record.<init>()V: Line 16
   * Goal 35. Record.writeNote(Ljava/lang/String;I)V: Line 20
   * Goal 36. Record.writeNote(Ljava/lang/String;I)V: Line 21
   * Goal 37. Record.writeNote(Ljava/lang/String;I)V: Line 23
   * Goal 38. Record.writeNote(Ljava/lang/String;I)V: Line 24
   * Goal 39. Record.writeNote(Ljava/lang/String;I)V: Line 25
   * Goal 40. Record.writeNote(Ljava/lang/String;I)V: Line 26
   * Goal 41. Record.writeNote(Ljava/lang/String;I)V: Line 32
   * Goal 42. Record.writeNote(Ljava/lang/String;I)V: Line 33
   * Goal 43. Record.writeNote(Ljava/lang/String;I)V: Line 35
   * Goal 44. Record.writeNote(Ljava/lang/String;I)V: Line 36
   * Goal 45. Record.writeNote(Ljava/lang/String;I)V: Line 38
   * Goal 46. Record.writeNote(Ljava/lang/String;I)V: Line 45
   * Goal 47. Record.writeNote(Ljava/lang/String;I)V: Line 46
   * Goal 48. Record.writeNote(Ljava/lang/String;I)V: Line 47
   * Goal 49. Record.writeNote(Ljava/lang/String;I)V: Line 50
   * Goal 50. Record.writeNote(Ljava/lang/String;I)V: Line 51
   * Goal 51. Record.writeNote(Ljava/lang/String;I)V: Line 52
   * Goal 52. Record.writeNote(Ljava/lang/String;I)V: Line 53
   * Goal 53. Record.writeNote(Ljava/lang/String;I)V: Line 54
   * Goal 54. Record.writeNote(Ljava/lang/String;I)V: Line 55
   * Goal 55. Record.writeNote(Ljava/lang/String;I)V: Line 56
   * Goal 56. Record.writeNote(Ljava/lang/String;I)V: Line 57
   * Goal 57. Record.writeNote(Ljava/lang/String;I)V: Line 58
   * Goal 58. Record.writeNote(Ljava/lang/String;I)V: Line 59
   * Goal 59. Record.writeNote(Ljava/lang/String;I)V: Line 60
   * Goal 60. Record.writeNote(Ljava/lang/String;I)V: Line 62
   * Goal 61. Record.writeNote(Ljava/lang/String;I)V: Line 65
   * Goal 62. Record.writeNote(Ljava/lang/String;I)V: Line 66
   * Goal 63. Record.writeNote(Ljava/lang/String;I)V: Line 68
   * Goal 64. Record.writeNote(Ljava/lang/String;I)V: Line 69
   * Goal 65. Record.writeNote(Ljava/lang/String;I)V: Line 72
   * Goal 66. Record.writeNote(Ljava/lang/String;I)V: Line 74
   * Goal 67. Record.writeNote(Ljava/lang/String;I)V: Line 75
   * Goal 68. Record.writeNote(Ljava/lang/String;I)V: Line 77
   * Goal 69. Record.writeNote(Ljava/lang/String;I)V: Line 78
   * Goal 70. Record.writeNote(Ljava/lang/String;I)V: Line 84
   * Goal 71. Record.writeNote(Ljava/lang/String;I)V: Line 85
   * Goal 72. Record.writeNote(Ljava/lang/String;I)V: Line 88
   * Goal 73. [METHOD] Record.<init>()V
   * Goal 74. [METHOD] Record.writeNote(Ljava/lang/String;I)V
   * Goal 75. [METHODNOEX] Record.<init>()V
   * Goal 76. [METHODNOEX] Record.writeNote(Ljava/lang/String;I)V
   * Goal 77. Weak Mutation 0: Record.<init>()V:16 - ReplaceConstant - record.dat -> 
   * Goal 78. Weak Mutation 1: Record.writeNote(Ljava/lang/String;I)V:20 - ReplaceComparisonOperator == -> !=
   * Goal 79. Weak Mutation 2: Record.writeNote(Ljava/lang/String;I)V:23 - ReplaceComparisonOperator == -> !=
   * Goal 80. Weak Mutation 3: Record.writeNote(Ljava/lang/String;I)V:25 - ReplaceComparisonOperator == -> !=
   * Goal 81. Weak Mutation 4: Record.writeNote(Ljava/lang/String;I)V:32 - InsertUnaryOp Negation of note
   * Goal 82. Weak Mutation 5: Record.writeNote(Ljava/lang/String;I)V:32 - InsertUnaryOp IINC 1 note
   * Goal 83. Weak Mutation 6: Record.writeNote(Ljava/lang/String;I)V:32 - InsertUnaryOp IINC -1 note
   */

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Record record0 = new Record();
      record0.writeNote("", 647);
      record0.writeNote("", 647);
      record0.writeNote("", 647);
      record0.writeNote("", 647);
      record0.writeNote("", 647);
      record0.writeNote("", 3037);
      record0.writeNote("", 647);
  }

  //Test case number: 6
  /*
   * 28 covered goals:
   * Goal 1. Record.readNote()Ljava/util/Vector;: root-Branch
   * Goal 2. Record.<init>()V: root-Branch
   * Goal 3. Branch Record.readNote()Ljava/util/Vector;: root-Branch in context: Record:readNote()Ljava/util/Vector;
   * Goal 4. Branch Record.<init>()V: root-Branch in context: Record:<init>()V
   * Goal 5. [Output]: Record.readNote()Ljava/util/Vector;:NonNull:java.util.Vector:capacity()I:Positive
   * Goal 6. [Output]: Record.readNote()Ljava/util/Vector;:NonNull:java.util.Vector:isEmpty()Z:True
   * Goal 7. [Output]: Record.readNote()Ljava/util/Vector;:NonNull:java.util.Vector:size()I:Zero
   * Goal 8. Record.<init>()V: Line 13
   * Goal 9. Record.<init>()V: Line 14
   * Goal 10. Record.<init>()V: Line 15
   * Goal 11. Record.<init>()V: Line 16
   * Goal 12. Record.readNote()Ljava/util/Vector;: Line 92
   * Goal 13. Record.readNote()Ljava/util/Vector;: Line 95
   * Goal 14. Record.readNote()Ljava/util/Vector;: Line 96
   * Goal 15. Record.readNote()Ljava/util/Vector;: Line 97
   * Goal 16. Record.readNote()Ljava/util/Vector;: Line 98
   * Goal 17. Record.readNote()Ljava/util/Vector;: Line 104
   * Goal 18. Record.readNote()Ljava/util/Vector;: Line 107
   * Goal 19. Record.readNote()Ljava/util/Vector;: Line 109
   * Goal 20. Record.readNote()Ljava/util/Vector;: Line 115
   * Goal 21. [METHOD] Record.<init>()V
   * Goal 22. [METHOD] Record.readNote()Ljava/util/Vector;
   * Goal 23. [METHODNOEX] Record.<init>()V
   * Goal 24. [METHODNOEX] Record.readNote()Ljava/util/Vector;
   * Goal 25. Weak Mutation 0: Record.<init>()V:16 - ReplaceConstant - record.dat -> 
   * Goal 26. Weak Mutation 7: Record.readNote()Ljava/util/Vector;:92 - ReplaceComparisonOperator == -> !=
   * Goal 27. Weak Mutation 8: Record.readNote()Ljava/util/Vector;:95 - ReplaceComparisonOperator == -> !=
   * Goal 28. Weak Mutation 9: Record.readNote()Ljava/util/Vector;:97 - ReplaceComparisonOperator == -> !=
   */
}
