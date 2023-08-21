# ActSPL

This is the experimental materials for the paper entitled "Automated Code-based Test Case Reuse for Software Product Line Testing"

The materials include the followings:
1) Subject SPLs, product families and test cases
2) The bytecode instrumentation tool based on BCEL
3) ActSPL prototype tool

* Prerequisites for ActSPL tool
  1) Eclipse Mars.2 4.5.2
  2) EvoSuite 1.0.2
  3) BCEL 6.2

Run process (Byte code instrumentation based on BCEL)
1. Select the target project you want to inject a trace log
2. To set a target product you want to inject a trace log, change the variable 'target'
3. Run
   
Run process (ActSPL)
1. Import ActSPL project
2. Configure Build Path to include the prerequisites
3. Change paths in source code to adapt your local environment
4. Run Main.java
       - the default setting of code unit granularity is class
